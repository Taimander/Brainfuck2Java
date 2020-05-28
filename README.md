# Brainfuck2Java
A Brainfuck to Java source compiler.

To use:

java -jar BF2Java.jar "source file" "destination file"
javac "destination file"
java "destination file"

Currently input may not be supported. (I haven't tested it)

This compiler has 3000 total cells, it starts in the middle so programs can use cells both ways. ("Below zero")

There is an example file that you can use to test it, its called mandelbrot.bf, credits of it go to Erik Bosman. (Compiling will generate a 4123 lines source)
