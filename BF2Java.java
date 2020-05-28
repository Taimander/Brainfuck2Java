import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BF2Java {
	
	public static final String CLASS_STRING_DEFINITION = "public class %s {\n\n\tpublic static void main(String[] args) {\n\t\tint[] cells = new int[3000];\n\t\tint ptr = 1500;\n%s\n\t}\n}";

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Please specify a source and a destination file.");
			System.out.println("Usage: java -jar BF2Java.jar \"<source file>\" \"<destination file>\"");
			return;
		}
		
		File f = new File(args[0]);
		File dest = new File(args[1].endsWith(".java")?args[1]:(args[1]+".java"));
		try {
			dest.createNewFile();
		} catch (IOException e1) {
			System.out.println("Unable to create destination file.");
			return;
		}
		String code = "";
		try {
			StringBuilder sb1 = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader(f));
			br.lines().forEachOrdered(sb1::append);
			code = sb1.toString();
			br.close();
		} catch(FileNotFoundException e) {
			System.out.println("File doesn't exist.");
			return;
		} catch (IOException e) {
			System.out.println("An error ocurred while trying to read the file. ("+e.getMessage()+")");
			return;
		}
		int currentIndex = 0;
		ArrayList<String> generatedLines = new ArrayList<>();
		int currentTabs = 2;
		while(currentIndex < code.length()) {
			int n = 0;
			switch(code.charAt(currentIndex)) {
			case '>':
				while(currentIndex < code.length() && code.charAt(currentIndex) == '>') {
					n++;
					currentIndex++;
				}
				if(currentIndex < code.length())
					currentIndex--;
				generatedLines.add(printTabs(currentTabs)+"ptr += "+n+";");
				break;
			case '<':
				while(currentIndex < code.length() && code.charAt(currentIndex) == '<') {
					n++;
					currentIndex++;
				}
				if(currentIndex < code.length())
					currentIndex--;
				generatedLines.add(printTabs(currentTabs)+"ptr -= "+n+";");
				break;
			case '+':
				while(currentIndex < code.length() && code.charAt(currentIndex) == '+') {
					n++;
					currentIndex++;
				}
				if(currentIndex < code.length())
					currentIndex--;
				generatedLines.add(printTabs(currentTabs)+"cells[ptr] += "+n+";");
				break;
			case '-':
				while(currentIndex < code.length() && code.charAt(currentIndex) == '-') {
					n++;
					currentIndex++;
				}
				if(currentIndex < code.length())
					currentIndex--;
				generatedLines.add(printTabs(currentTabs)+"cells[ptr] -= "+n+";");
				break;
			case '[':
				generatedLines.add(printTabs(currentTabs++)+"while(cells[ptr] != 0) {");
				break;
			case ']':
				generatedLines.add(printTabs(--currentTabs)+"}");
				break;
			case '.':
				generatedLines.add(printTabs(currentTabs)+"System.out.print((char)cells[ptr]);");
				break;
			case ',':
				generatedLines.add(printTabs(currentTabs)+"cells[ptr] = (int)System.in.read();");
				break;
			default:
				break;
			}	
			currentIndex++;
		}
		StringBuilder sb = new StringBuilder();
		for(String k : generatedLines) {
			sb.append(k+"\n");
		}
		try {
			BufferedWriter destWriter = new BufferedWriter(new FileWriter(dest));
			destWriter.append(String.format(CLASS_STRING_DEFINITION,dest.getName().replace(".java", ""), sb.toString()));
			destWriter.flush();
			destWriter.close();
		} catch (IOException e) {
			System.out.println("Unable to write output to file.");
			return;
		}
	}
	
	public static final String printTabs(int n) {
		String k = "";
		while(n-- > 0) {
			k += "\t";
		}
		return k;
	}
	
}
