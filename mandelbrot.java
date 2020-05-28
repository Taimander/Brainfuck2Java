public class mandelbrot {

	public static void main(String[] args) {
		int[] cells = new int[3000];
		int ptr = 1500;
		cells[ptr] += 13;
		while(cells[ptr] != 0) {
			cells[ptr] -= 1;
			ptr += 1;
			cells[ptr] += 2;
			ptr += 3;
			cells[ptr] += 5;
			ptr += 1;
			cells[ptr] += 2;
			ptr += 1;
			cells[ptr] += 1;
			ptr -= 6;
		}
		ptr += 5;
		cells[ptr] += 6;
		ptr += 1;
		cells[ptr] -= 3;
		ptr += 10;
		cells[ptr] += 15;
		while(cells[ptr] != 0) {
			while(cells[ptr] != 0) {
				ptr += 9;
			}
			cells[ptr] += 1;
			while(cells[ptr] != 0) {
				ptr -= 9;
			}
			ptr += 9;
			cells[ptr] -= 1;
		}
		cells[ptr] += 1;
		while(cells[ptr] != 0) {
			ptr += 8;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
			}
			ptr += 1;
		}
		ptr -= 9;
		while(cells[ptr] != 0) {
			ptr -= 9;
		}
		ptr += 8;
		while(cells[ptr] != 0) {
			cells[ptr] -= 1;
		}
		cells[ptr] += 1;
		ptr -= 7;
		cells[ptr] += 5;
		while(cells[ptr] != 0) {
			cells[ptr] -= 1;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				ptr += 9;
				cells[ptr] += 1;
				ptr -= 9;
			}
			ptr += 9;
		}
		ptr += 7;
		cells[ptr] += 1;
		ptr += 27;
		cells[ptr] += 1;
		ptr -= 17;
		while(cells[ptr] != 0) {
			ptr -= 9;
		}
		ptr += 3;
		while(cells[ptr] != 0) {
			cells[ptr] -= 1;
		}
		cells[ptr] += 1;
		while(cells[ptr] != 0) {
			ptr += 6;
			while(cells[ptr] != 0) {
				ptr += 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 2;
			}
			ptr -= 9;
			while(cells[ptr] != 0) {
				ptr -= 9;
			}
			ptr += 7;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
			}
			cells[ptr] += 1;
			ptr -= 6;
			cells[ptr] += 4;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 9;
					cells[ptr] += 1;
					ptr -= 9;
				}
				ptr += 9;
			}
			ptr += 6;
			cells[ptr] += 1;
			ptr -= 6;
			cells[ptr] += 7;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 9;
					cells[ptr] += 1;
					ptr -= 9;
				}
				ptr += 9;
			}
			ptr += 6;
			cells[ptr] += 1;
			ptr -= 16;
			while(cells[ptr] != 0) {
				ptr -= 9;
			}
			ptr += 3;
			while(cells[ptr] != 0) {
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 6;
				while(cells[ptr] != 0) {
					ptr += 7;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 6;
						cells[ptr] += 1;
						ptr += 6;
					}
					ptr -= 6;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 6;
						cells[ptr] += 1;
						ptr -= 2;
						cells[ptr] += 1;
						ptr -= 3;
						cells[ptr] += 1;
						ptr -= 1;
					}
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 8;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 7;
						cells[ptr] += 1;
						ptr += 7;
					}
					ptr -= 7;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 7;
						cells[ptr] += 1;
						ptr -= 2;
						cells[ptr] += 1;
						ptr -= 3;
						cells[ptr] += 1;
						ptr -= 2;
					}
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr -= 7;
					cells[ptr] += 1;
					ptr += 7;
				}
				ptr -= 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 7;
					cells[ptr] += 1;
					ptr -= 2;
					cells[ptr] += 1;
					ptr -= 5;
				}
				ptr += 9;
				cells[ptr] += 15;
				while(cells[ptr] != 0) {
					while(cells[ptr] != 0) {
						ptr += 9;
					}
					cells[ptr] += 1;
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					cells[ptr] -= 1;
				}
				cells[ptr] += 1;
				while(cells[ptr] != 0) {
					ptr += 1;
					cells[ptr] += 1;
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 1;
					cells[ptr] -= 1;
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 4;
					}
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] += 1;
						ptr -= 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 2;
								cells[ptr] += 1;
								ptr += 2;
							}
							ptr -= 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								cells[ptr] += 1;
								ptr += 2;
								cells[ptr] += 1;
								ptr -= 4;
							}
							cells[ptr] += 1;
							ptr += 9;
						}
						ptr -= 8;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 9;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr -= 10;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 9;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr -= 1;
					cells[ptr] += 1;
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 1;
					cells[ptr] -= 1;
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							ptr -= 1;
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] -= 1;
							ptr -= 6;
							cells[ptr] += 1;
							ptr += 6;
						}
						ptr -= 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 4;
					}
					ptr -= 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 3;
						cells[ptr] += 1;
						ptr -= 3;
					}
					ptr -= 1;
					cells[ptr] += 1;
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 1;
					cells[ptr] += 1;
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 1;
					cells[ptr] -= 1;
					ptr += 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 5;
						cells[ptr] += 1;
						ptr += 5;
					}
					ptr -= 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 5;
						cells[ptr] += 1;
						ptr -= 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] += 1;
								ptr += 3;
							}
							ptr -= 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] += 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 4;
							}
							cells[ptr] += 1;
							ptr += 9;
						}
						ptr -= 8;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 9;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr -= 11;
					}
					ptr += 2;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 9;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr -= 2;
					cells[ptr] += 1;
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 1;
					cells[ptr] -= 1;
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							ptr -= 1;
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] -= 1;
							ptr -= 6;
							cells[ptr] += 1;
							ptr += 6;
						}
						ptr -= 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 4;
					}
					ptr -= 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 3;
						cells[ptr] += 1;
						ptr -= 3;
					}
					ptr -= 1;
					cells[ptr] += 1;
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 36;
						cells[ptr] += 1;
						ptr += 36;
					}
					ptr += 5;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 9;
				cells[ptr] += 15;
				while(cells[ptr] != 0) {
					while(cells[ptr] != 0) {
						ptr += 9;
					}
					ptr -= 9;
					cells[ptr] -= 1;
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					cells[ptr] -= 1;
				}
				cells[ptr] += 1;
				ptr += 21;
				cells[ptr] += 1;
				ptr -= 3;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 3;
						cells[ptr] -= 1;
						ptr += 3;
					}
					cells[ptr] += 1;
					ptr -= 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 3;
						cells[ptr] -= 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr -= 13;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
							ptr += 4;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							cells[ptr] += 1;
							ptr += 5;
							while(cells[ptr] != 0) {
								ptr += 9;
							}
							ptr += 1;
							cells[ptr] += 1;
							ptr -= 1;
						}
					}
					cells[ptr] += 1;
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] -= 1;
						ptr += 4;
					}
					cells[ptr] += 1;
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] -= 1;
						ptr -= 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr += 3;
						}
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] += 1;
							ptr -= 12;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
							ptr += 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							cells[ptr] += 1;
							ptr += 6;
							while(cells[ptr] != 0) {
								ptr += 9;
							}
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							cells[ptr] += 1;
							ptr -= 1;
						}
					}
					cells[ptr] += 1;
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 1;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 8;
					}
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr -= 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 1;
					cells[ptr] += 1;
					ptr += 3;
					cells[ptr] -= 1;
					ptr -= 4;
				}
				ptr += 9;
				cells[ptr] += 26;
				ptr += 2;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr -= 4;
					cells[ptr] += 1;
					ptr += 4;
				}
				ptr -= 4;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 4;
					cells[ptr] += 1;
					ptr -= 2;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 2;
				}
				ptr += 2;
				while(cells[ptr] != 0) {
					ptr -= 7;
					cells[ptr] += 1;
					ptr -= 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 1;
						cells[ptr] += 1;
						ptr += 4;
						cells[ptr] += 1;
						ptr -= 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] += 1;
							ptr += 3;
							cells[ptr] -= 1;
							ptr -= 4;
						}
						ptr += 3;
					}
					ptr += 13;
					while(cells[ptr] != 0) {
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 5;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 6;
					while(cells[ptr] != 0) {
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 9;
							cells[ptr] += 1;
							ptr += 9;
						}
						ptr += 7;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					cells[ptr] += 15;
					while(cells[ptr] != 0) {
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 9;
						cells[ptr] -= 1;
					}
					cells[ptr] += 1;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] -= 1;
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] += 1;
							ptr += 5;
						}
						ptr -= 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] += 1;
							ptr -= 6;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] += 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr += 1;
									cells[ptr] += 1;
									ptr -= 3;
								}
								cells[ptr] += 1;
								ptr += 9;
							}
							ptr -= 8;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
						}
						ptr += 9;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 9;
								cells[ptr] += 1;
								ptr -= 9;
							}
							ptr -= 10;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								ptr -= 1;
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] -= 1;
								ptr -= 7;
								cells[ptr] += 1;
								ptr += 7;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
							ptr += 3;
						}
						ptr -= 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 2;
							cells[ptr] += 1;
							ptr -= 2;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] += 1;
							ptr += 5;
						}
						ptr -= 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] += 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] -= 1;
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] += 1;
							ptr += 5;
						}
						ptr -= 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] += 1;
							ptr -= 6;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] += 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 4;
								}
								cells[ptr] += 1;
								ptr += 9;
							}
							ptr -= 8;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
						}
						ptr += 9;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 9;
								cells[ptr] += 1;
								ptr -= 9;
							}
							ptr -= 10;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								ptr -= 1;
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] -= 1;
								ptr -= 6;
								cells[ptr] += 1;
								ptr += 6;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
							ptr += 4;
						}
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] += 1;
							ptr -= 3;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 36;
							cells[ptr] += 1;
							ptr += 36;
						}
						ptr += 5;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 36;
							cells[ptr] += 1;
							ptr += 36;
						}
						ptr += 6;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					cells[ptr] += 15;
					while(cells[ptr] != 0) {
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						cells[ptr] -= 1;
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 9;
						cells[ptr] -= 1;
					}
					cells[ptr] += 1;
					while(cells[ptr] != 0) {
						ptr += 8;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 7;
							cells[ptr] += 1;
							ptr += 7;
						}
						ptr -= 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 7;
							cells[ptr] += 1;
							ptr -= 6;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 3;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 4;
					cells[ptr] += 1;
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 1;
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 5;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] += 1;
							ptr -= 1;
							cells[ptr] += 2;
							ptr -= 4;
						}
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] += 1;
							ptr += 5;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 1;
						cells[ptr] += 1;
						ptr += 1;
					}
					ptr -= 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 1;
						cells[ptr] += 1;
						ptr -= 1;
					}
					ptr -= 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 5;
						cells[ptr] += 1;
						ptr -= 5;
					}
					ptr += 6;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 6;
					cells[ptr] += 1;
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] -= 1;
						ptr += 4;
					}
					cells[ptr] += 1;
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] -= 1;
						ptr += 5;
						while(cells[ptr] != 0) {
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 2;
								cells[ptr] -= 1;
								ptr += 2;
							}
							cells[ptr] += 1;
							ptr -= 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								cells[ptr] -= 1;
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 3;
									cells[ptr] += 1;
									ptr += 3;
								}
								ptr -= 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] += 1;
									ptr -= 12;
									while(cells[ptr] != 0) {
										ptr -= 9;
									}
									ptr += 3;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
									}
									cells[ptr] += 1;
									ptr += 6;
									while(cells[ptr] != 0) {
										ptr += 9;
									}
									ptr += 1;
									cells[ptr] += 1;
									ptr -= 1;
								}
							}
							cells[ptr] += 1;
							ptr += 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] -= 1;
								ptr += 3;
							}
							cells[ptr] += 1;
							ptr -= 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] -= 1;
								ptr -= 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] += 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 11;
									while(cells[ptr] != 0) {
										ptr -= 9;
									}
									ptr += 4;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
									}
									cells[ptr] += 1;
									ptr += 5;
									while(cells[ptr] != 0) {
										ptr += 9;
									}
									ptr += 1;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
									}
									cells[ptr] += 1;
									ptr -= 1;
								}
							}
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 1;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr -= 8;
							}
							ptr += 8;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr += 5;
							while(cells[ptr] != 0) {
								ptr += 1;
								cells[ptr] += 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] -= 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 2;
								}
								ptr += 8;
							}
							ptr -= 8;
							cells[ptr] += 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 5;
									cells[ptr] += 1;
									ptr -= 4;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 4;
										cells[ptr] -= 1;
										ptr -= 14;
										cells[ptr] += 1;
										ptr += 11;
										while(cells[ptr] != 0) {
											cells[ptr] -= 1;
											ptr += 3;
											cells[ptr] += 1;
											ptr -= 3;
										}
										ptr -= 1;
									}
									ptr += 1;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 3;
										cells[ptr] -= 1;
										ptr -= 14;
										cells[ptr] += 1;
										ptr += 11;
									}
									ptr -= 2;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 4;
									cells[ptr] += 1;
									ptr -= 3;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 3;
										cells[ptr] -= 1;
										ptr -= 14;
										cells[ptr] += 1;
										ptr += 11;
									}
									ptr -= 1;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] += 1;
									ptr -= 3;
								}
								ptr -= 12;
							}
							ptr += 4;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							ptr -= 4;
						}
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr += 3;
						}
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] += 1;
							ptr += 6;
							while(cells[ptr] != 0) {
								ptr += 1;
								cells[ptr] += 1;
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 1;
									cells[ptr] -= 1;
									ptr += 1;
								}
								ptr -= 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 1;
									cells[ptr] += 1;
									ptr -= 1;
								}
								ptr += 8;
							}
							ptr -= 8;
							cells[ptr] += 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 5;
									cells[ptr] += 1;
									ptr -= 3;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 3;
										cells[ptr] -= 1;
										ptr -= 14;
										cells[ptr] += 1;
										ptr += 10;
										while(cells[ptr] != 0) {
											cells[ptr] -= 1;
											ptr += 4;
											cells[ptr] += 1;
											ptr -= 4;
										}
										ptr += 1;
									}
									ptr -= 1;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 4;
										cells[ptr] -= 1;
										ptr -= 14;
										cells[ptr] += 1;
										ptr += 10;
									}
									ptr -= 1;
								}
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] += 1;
									ptr -= 4;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 4;
										cells[ptr] -= 1;
										ptr -= 14;
										cells[ptr] += 1;
										ptr += 10;
									}
									ptr += 1;
								}
								ptr -= 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 4;
									cells[ptr] += 1;
									ptr -= 4;
								}
								ptr -= 11;
							}
							ptr += 6;
							cells[ptr] += 1;
							ptr -= 6;
						}
					}
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 4;
					}
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] += 1;
						ptr += 5;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 5;
								cells[ptr] += 1;
								ptr -= 4;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 4;
									cells[ptr] -= 1;
									ptr -= 14;
									cells[ptr] += 1;
									ptr += 11;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 3;
										cells[ptr] += 1;
										ptr -= 3;
									}
									ptr -= 1;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] -= 1;
									ptr -= 14;
									cells[ptr] += 1;
									ptr += 11;
								}
								ptr -= 2;
							}
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 4;
								cells[ptr] += 1;
								ptr -= 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] -= 1;
									ptr -= 14;
									cells[ptr] += 1;
									ptr += 11;
								}
								ptr -= 1;
							}
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] += 1;
								ptr -= 3;
							}
							ptr -= 12;
						}
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 2;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 5;
					while(cells[ptr] != 0) {
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 6;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					cells[ptr] += 15;
					while(cells[ptr] != 0) {
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 9;
						cells[ptr] -= 1;
					}
					cells[ptr] += 1;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] -= 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr -= 5;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] += 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr += 1;
									cells[ptr] += 1;
									ptr -= 3;
								}
								cells[ptr] += 1;
								ptr += 9;
							}
							ptr -= 8;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
						}
						ptr += 9;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 9;
								cells[ptr] += 1;
								ptr -= 9;
							}
							ptr -= 10;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								ptr -= 1;
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] -= 1;
								ptr -= 7;
								cells[ptr] += 1;
								ptr += 7;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
							ptr += 3;
						}
						ptr -= 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 2;
							cells[ptr] += 1;
							ptr -= 2;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 36;
							cells[ptr] += 1;
							ptr += 36;
						}
						ptr += 6;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 4;
					cells[ptr] += 15;
					while(cells[ptr] != 0) {
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						cells[ptr] -= 1;
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 9;
						cells[ptr] -= 1;
					}
					cells[ptr] += 1;
					while(cells[ptr] != 0) {
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 3;
							cells[ptr] -= 1;
							ptr += 3;
						}
						cells[ptr] += 1;
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] -= 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 4;
								cells[ptr] += 1;
								ptr += 4;
							}
							ptr -= 4;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 4;
								cells[ptr] += 1;
								ptr -= 13;
								while(cells[ptr] != 0) {
									ptr -= 9;
								}
								ptr += 4;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr += 5;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
						}
						cells[ptr] += 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] -= 1;
							ptr += 4;
						}
						cells[ptr] += 1;
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] -= 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] += 1;
								ptr += 3;
							}
							ptr -= 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] += 1;
								ptr -= 12;
								while(cells[ptr] != 0) {
									ptr -= 9;
								}
								ptr += 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr += 6;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr -= 1;
							}
						}
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								ptr += 9;
							}
							ptr -= 8;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 3;
						cells[ptr] += 1;
						ptr += 3;
					}
					ptr -= 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 3;
						cells[ptr] += 1;
						ptr += 6;
						while(cells[ptr] != 0) {
							ptr += 1;
							cells[ptr] += 1;
							ptr += 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] -= 1;
								ptr += 3;
							}
							ptr -= 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] += 1;
								ptr -= 3;
							}
							ptr += 8;
						}
						ptr -= 8;
						cells[ptr] += 1;
						ptr -= 1;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 1;
									cells[ptr] -= 1;
									ptr -= 10;
									cells[ptr] += 1;
									ptr += 12;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr -= 2;
										cells[ptr] += 1;
										ptr += 2;
									}
									ptr -= 1;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] -= 1;
									ptr -= 10;
									cells[ptr] += 1;
									ptr += 12;
								}
								ptr -= 3;
							}
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 1;
								cells[ptr] += 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] -= 1;
									ptr -= 10;
									cells[ptr] += 1;
									ptr += 12;
								}
								ptr -= 1;
							}
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 2;
								cells[ptr] += 1;
								ptr += 2;
							}
							ptr -= 13;
						}
					}
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 4;
					}
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] += 1;
						ptr += 5;
						while(cells[ptr] != 0) {
							ptr += 1;
							cells[ptr] += 1;
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 2;
								cells[ptr] -= 1;
								ptr += 2;
							}
							ptr -= 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								cells[ptr] += 1;
								ptr -= 2;
							}
							ptr += 8;
						}
						ptr -= 8;
						cells[ptr] += 1;
						ptr -= 1;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] -= 1;
									ptr -= 10;
									cells[ptr] += 1;
									ptr += 11;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr -= 1;
										cells[ptr] += 1;
										ptr += 1;
									}
									ptr += 1;
								}
								ptr -= 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 1;
									cells[ptr] -= 1;
									ptr -= 10;
									cells[ptr] += 1;
									ptr += 11;
								}
								ptr -= 2;
							}
							ptr += 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 2;
								cells[ptr] += 1;
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 1;
									cells[ptr] -= 1;
									ptr -= 10;
									cells[ptr] += 1;
									ptr += 11;
								}
								ptr += 1;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 1;
								cells[ptr] += 1;
								ptr += 1;
							}
							ptr -= 12;
						}
						ptr += 5;
						cells[ptr] += 1;
						ptr -= 5;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 4;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 5;
					while(cells[ptr] != 0) {
						ptr += 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 6;
							cells[ptr] += 1;
							ptr += 6;
						}
						ptr -= 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 6;
							cells[ptr] += 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr -= 2;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 4;
					cells[ptr] += 1;
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 1;
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 5;
					}
					ptr += 2;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] += 1;
							ptr -= 1;
							cells[ptr] += 2;
							ptr -= 4;
						}
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] += 1;
							ptr += 5;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 1;
						cells[ptr] += 1;
						ptr += 2;
					}
					ptr -= 2;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 2;
						cells[ptr] += 1;
						ptr -= 2;
					}
					ptr -= 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 5;
						cells[ptr] += 1;
						ptr -= 5;
					}
					cells[ptr] += 1;
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] -= 1;
						ptr += 4;
					}
					cells[ptr] += 1;
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] -= 1;
						ptr += 5;
						while(cells[ptr] != 0) {
							ptr += 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] -= 1;
								ptr += 3;
							}
							cells[ptr] += 1;
							ptr -= 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] -= 1;
								ptr -= 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] += 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 11;
									while(cells[ptr] != 0) {
										ptr -= 9;
									}
									ptr += 4;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
									}
									cells[ptr] += 1;
									ptr += 5;
									while(cells[ptr] != 0) {
										ptr += 9;
									}
									ptr += 1;
									cells[ptr] += 1;
									ptr -= 1;
								}
							}
							cells[ptr] += 1;
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 2;
								cells[ptr] -= 1;
								ptr += 2;
							}
							cells[ptr] += 1;
							ptr -= 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								cells[ptr] -= 1;
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 3;
									cells[ptr] += 1;
									ptr += 3;
								}
								ptr -= 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] += 1;
									ptr -= 12;
									while(cells[ptr] != 0) {
										ptr -= 9;
									}
									ptr += 3;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
									}
									cells[ptr] += 1;
									ptr += 6;
									while(cells[ptr] != 0) {
										ptr += 9;
									}
									ptr += 1;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
									}
									cells[ptr] += 1;
									ptr -= 1;
								}
							}
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 1;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr -= 8;
							}
							ptr += 8;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr += 3;
						}
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] += 1;
							ptr += 6;
							while(cells[ptr] != 0) {
								ptr += 1;
								cells[ptr] += 1;
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 1;
									cells[ptr] -= 1;
									ptr += 1;
								}
								ptr -= 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 1;
									cells[ptr] += 1;
									ptr -= 1;
								}
								ptr += 8;
							}
							ptr -= 8;
							cells[ptr] += 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 4;
									cells[ptr] += 1;
									ptr -= 2;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 2;
										cells[ptr] -= 1;
										ptr -= 13;
										cells[ptr] += 1;
										ptr += 10;
										while(cells[ptr] != 0) {
											cells[ptr] -= 1;
											ptr += 3;
											cells[ptr] += 1;
											ptr -= 3;
										}
										ptr += 1;
									}
									ptr -= 1;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 3;
										cells[ptr] -= 1;
										ptr -= 13;
										cells[ptr] += 1;
										ptr += 10;
									}
									ptr -= 1;
								}
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 3;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 3;
										cells[ptr] -= 1;
										ptr -= 13;
										cells[ptr] += 1;
										ptr += 10;
									}
									ptr += 1;
								}
								ptr -= 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] += 1;
									ptr -= 3;
								}
								ptr -= 11;
							}
							ptr += 5;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 7;
								cells[ptr] += 1;
								ptr += 7;
							}
							ptr -= 7;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 7;
								cells[ptr] += 1;
								ptr -= 2;
								cells[ptr] += 1;
								ptr -= 5;
							}
						}
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr += 5;
							while(cells[ptr] != 0) {
								ptr += 1;
								cells[ptr] += 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] -= 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 2;
								}
								ptr += 8;
							}
							ptr -= 8;
							cells[ptr] += 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 4;
									cells[ptr] += 1;
									ptr -= 3;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 3;
										cells[ptr] -= 1;
										ptr -= 13;
										cells[ptr] += 1;
										ptr += 11;
										while(cells[ptr] != 0) {
											cells[ptr] -= 1;
											ptr += 2;
											cells[ptr] += 1;
											ptr -= 2;
										}
										ptr -= 1;
									}
									ptr += 1;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 2;
										cells[ptr] -= 1;
										ptr -= 13;
										cells[ptr] += 1;
										ptr += 11;
									}
									ptr -= 2;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] += 1;
									ptr -= 2;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 2;
										cells[ptr] -= 1;
										ptr -= 13;
										cells[ptr] += 1;
										ptr += 11;
									}
									ptr -= 1;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 2;
								}
								ptr -= 12;
							}
						}
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 4;
					}
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 4;
					}
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 7;
							cells[ptr] += 1;
							ptr += 7;
						}
						ptr -= 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 7;
							cells[ptr] += 1;
							ptr -= 2;
							cells[ptr] += 1;
							ptr -= 5;
						}
						ptr += 9;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 4;
								cells[ptr] += 1;
								ptr -= 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] -= 1;
									ptr -= 13;
									cells[ptr] += 1;
									ptr += 11;
									while(cells[ptr] != 0) {
										cells[ptr] -= 1;
										ptr += 2;
										cells[ptr] += 1;
										ptr -= 2;
									}
									ptr -= 1;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] -= 1;
									ptr -= 13;
									cells[ptr] += 1;
									ptr += 11;
								}
								ptr -= 2;
							}
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] += 1;
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] -= 1;
									ptr -= 13;
									cells[ptr] += 1;
									ptr += 11;
								}
								ptr -= 1;
							}
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								cells[ptr] += 1;
								ptr -= 2;
							}
							ptr -= 12;
						}
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 6;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 3;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 5;
					while(cells[ptr] != 0) {
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] += 1;
							ptr += 5;
						}
						ptr -= 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] += 1;
							ptr -= 3;
							cells[ptr] += 1;
							ptr -= 2;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					cells[ptr] += 15;
					while(cells[ptr] != 0) {
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 9;
						cells[ptr] -= 1;
					}
					cells[ptr] += 1;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] -= 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr -= 5;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 2;
									cells[ptr] += 1;
									ptr += 2;
								}
								ptr -= 2;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr += 2;
									cells[ptr] += 1;
									ptr -= 4;
								}
								cells[ptr] += 1;
								ptr += 9;
							}
							ptr -= 8;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
						}
						ptr += 9;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 9;
								cells[ptr] += 1;
								ptr -= 9;
							}
							ptr -= 10;
						}
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								ptr -= 1;
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] -= 1;
								ptr -= 6;
								cells[ptr] += 1;
								ptr += 6;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
							ptr += 4;
						}
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] += 1;
							ptr -= 3;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] -= 1;
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] += 1;
							ptr += 5;
						}
						ptr -= 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] += 1;
							ptr -= 6;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr -= 3;
									cells[ptr] += 1;
									ptr += 3;
								}
								ptr -= 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
									ptr += 3;
									cells[ptr] += 1;
									ptr += 1;
									cells[ptr] += 1;
									ptr -= 4;
								}
								cells[ptr] += 1;
								ptr += 9;
							}
							ptr -= 8;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
						}
						ptr += 9;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 9;
								cells[ptr] += 1;
								ptr -= 9;
							}
							ptr -= 11;
						}
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr -= 2;
						cells[ptr] += 1;
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								ptr -= 1;
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] -= 1;
								ptr -= 6;
								cells[ptr] += 1;
								ptr += 6;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
							ptr += 4;
						}
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] += 1;
							ptr -= 3;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 36;
							cells[ptr] += 1;
							ptr += 36;
						}
						ptr += 5;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					cells[ptr] += 15;
					while(cells[ptr] != 0) {
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 9;
						cells[ptr] -= 1;
						ptr -= 9;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 9;
						cells[ptr] -= 1;
					}
					cells[ptr] += 1;
					ptr += 21;
					cells[ptr] += 1;
					ptr -= 3;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 3;
							cells[ptr] -= 1;
							ptr += 3;
						}
						cells[ptr] += 1;
						ptr -= 3;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 3;
							cells[ptr] -= 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 4;
								cells[ptr] += 1;
								ptr += 4;
							}
							ptr -= 4;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 4;
								cells[ptr] += 1;
								ptr -= 13;
								while(cells[ptr] != 0) {
									ptr -= 9;
								}
								ptr += 4;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr += 5;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
						}
						cells[ptr] += 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] -= 1;
							ptr += 4;
						}
						cells[ptr] += 1;
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] -= 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] += 1;
								ptr += 3;
							}
							ptr -= 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 3;
								cells[ptr] += 1;
								ptr -= 12;
								while(cells[ptr] != 0) {
									ptr -= 9;
								}
								ptr += 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr += 6;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr -= 1;
							}
						}
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								ptr += 9;
							}
							ptr -= 8;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 2;
					cells[ptr] -= 1;
					ptr += 2;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 4;
						cells[ptr] += 1;
						ptr += 4;
					}
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 4;
						cells[ptr] += 1;
						ptr -= 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 2;
					}
					ptr += 2;
				}
				ptr -= 2;
				cells[ptr] += 1;
				ptr += 4;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr -= 4;
					cells[ptr] -= 1;
					ptr += 4;
				}
				cells[ptr] += 1;
				ptr -= 4;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 4;
					cells[ptr] -= 1;
					ptr -= 6;
					System.out.print((char)cells[ptr]);
					ptr += 2;
				}
				ptr += 4;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr -= 7;
					System.out.print((char)cells[ptr]);
					ptr += 7;
				}
				ptr -= 3;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 3;
				while(cells[ptr] != 0) {
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 3;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 4;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 1;
				cells[ptr] += 11;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 9;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
				}
				ptr += 4;
				cells[ptr] += 1;
				ptr += 9;
				cells[ptr] += 1;
				ptr -= 14;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr -= 7;
					cells[ptr] += 1;
					ptr += 7;
				}
				ptr -= 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 7;
					cells[ptr] += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr += 2;
					while(cells[ptr] != 0) {
						ptr += 9;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 6;
							cells[ptr] += 1;
							ptr += 6;
						}
						ptr -= 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 6;
							cells[ptr] += 1;
							ptr -= 7;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
							ptr += 7;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							cells[ptr] += 1;
							ptr += 3;
						}
						ptr -= 10;
					}
				}
				ptr += 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr -= 7;
					cells[ptr] += 1;
					ptr += 7;
				}
				ptr -= 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 7;
					cells[ptr] += 1;
					ptr += 2;
					while(cells[ptr] != 0) {
						ptr += 1;
						cells[ptr] += 1;
						ptr += 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 4;
							cells[ptr] -= 1;
							ptr += 4;
						}
						ptr -= 4;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 4;
							cells[ptr] += 1;
							ptr -= 4;
						}
						ptr += 8;
					}
					ptr -= 2;
					cells[ptr] += 1;
					ptr -= 7;
					while(cells[ptr] != 0) {
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 2;
							cells[ptr] += 1;
							ptr -= 2;
						}
						ptr -= 14;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 9;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 7;
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								ptr -= 1;
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] += 1;
								ptr += 3;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
							ptr += 7;
						}
						ptr -= 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 6;
							cells[ptr] += 1;
							ptr -= 6;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 7;
					cells[ptr] -= 1;
					ptr -= 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					cells[ptr] += 1;
					ptr -= 3;
				}
				cells[ptr] += 1;
				ptr += 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr -= 7;
					cells[ptr] -= 1;
					ptr += 7;
				}
				cells[ptr] += 1;
				ptr -= 7;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 7;
					cells[ptr] -= 1;
					ptr += 2;
					while(cells[ptr] != 0) {
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 2;
							cells[ptr] += 1;
							ptr -= 2;
						}
						ptr += 4;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						ptr -= 1;
						cells[ptr] -= 1;
						ptr += 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 7;
							cells[ptr] += 1;
							ptr += 1;
							while(cells[ptr] != 0) {
								ptr -= 1;
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] -= 1;
								ptr -= 3;
								cells[ptr] += 1;
								ptr += 3;
							}
							ptr -= 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
							ptr += 7;
						}
						ptr -= 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 6;
							cells[ptr] += 1;
							ptr -= 6;
						}
						ptr -= 1;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 1;
					cells[ptr] += 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr += 9;
					}
					ptr += 4;
					cells[ptr] += 1;
					ptr -= 5;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 9;
					while(cells[ptr] != 0) {
						ptr += 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 5;
							cells[ptr] -= 1;
							ptr += 5;
						}
						cells[ptr] += 1;
						ptr -= 5;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 5;
							cells[ptr] -= 1;
							ptr += 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 7;
								cells[ptr] += 1;
								ptr += 7;
							}
							ptr -= 7;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 7;
								cells[ptr] += 1;
								ptr -= 16;
								while(cells[ptr] != 0) {
									ptr -= 9;
								}
								ptr += 4;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr += 5;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr += 1;
								cells[ptr] += 1;
								ptr -= 1;
							}
						}
						cells[ptr] += 1;
						ptr += 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 7;
							cells[ptr] -= 1;
							ptr += 7;
						}
						cells[ptr] += 1;
						ptr -= 7;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 7;
							cells[ptr] -= 1;
							ptr -= 2;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr -= 5;
								cells[ptr] += 1;
								ptr += 5;
							}
							ptr -= 5;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
								ptr += 5;
								cells[ptr] += 1;
								ptr -= 14;
								while(cells[ptr] != 0) {
									ptr -= 9;
								}
								ptr += 3;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr += 6;
								while(cells[ptr] != 0) {
									ptr += 9;
								}
								ptr += 1;
								while(cells[ptr] != 0) {
									cells[ptr] -= 1;
								}
								cells[ptr] += 1;
								ptr -= 1;
							}
						}
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 1;
							while(cells[ptr] != 0) {
								ptr += 9;
							}
							ptr -= 8;
						}
						ptr += 8;
					}
					ptr -= 9;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
					ptr += 4;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 3;
					cells[ptr] += 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 9;
							cells[ptr] += 1;
							ptr -= 9;
						}
						ptr += 9;
					}
					ptr += 4;
					cells[ptr] -= 1;
					ptr -= 5;
					while(cells[ptr] != 0) {
						ptr -= 9;
					}
				}
				ptr += 3;
			}
			ptr -= 4;
			System.out.print((char)cells[ptr]);
			ptr += 10;
			while(cells[ptr] != 0) {
				ptr += 6;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 3;
			}
			ptr -= 9;
			while(cells[ptr] != 0) {
				ptr -= 9;
			}
			ptr += 1;
			cells[ptr] += 10;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					ptr += 9;
					cells[ptr] += 1;
					ptr -= 9;
				}
				ptr += 9;
			}
			ptr += 5;
			cells[ptr] += 1;
			ptr += 9;
			cells[ptr] += 1;
			ptr -= 15;
			while(cells[ptr] != 0) {
				ptr -= 9;
			}
			ptr += 8;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				ptr -= 8;
				cells[ptr] += 1;
				ptr += 8;
			}
			ptr -= 8;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				ptr += 8;
				cells[ptr] += 1;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr += 1;
				while(cells[ptr] != 0) {
					ptr += 9;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr += 8;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 7;
						cells[ptr] += 1;
						ptr += 7;
					}
					ptr -= 7;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 7;
						cells[ptr] += 1;
						ptr -= 8;
						while(cells[ptr] != 0) {
							ptr -= 9;
						}
						ptr += 8;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
						}
						cells[ptr] += 1;
						ptr += 2;
					}
					ptr -= 10;
				}
			}
			ptr += 8;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				ptr -= 8;
				cells[ptr] += 1;
				ptr += 8;
			}
			ptr -= 8;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				ptr += 8;
				cells[ptr] += 1;
				ptr += 1;
				while(cells[ptr] != 0) {
					ptr += 1;
					cells[ptr] += 1;
					ptr += 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 5;
						cells[ptr] -= 1;
						ptr += 5;
					}
					ptr -= 5;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 5;
						cells[ptr] += 1;
						ptr -= 5;
					}
					ptr += 8;
				}
				ptr -= 1;
				cells[ptr] += 1;
				ptr -= 8;
				while(cells[ptr] != 0) {
					ptr += 6;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 2;
						cells[ptr] += 1;
						ptr -= 2;
					}
					ptr -= 15;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 9;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 1;
					cells[ptr] -= 1;
					ptr += 8;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 8;
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							ptr -= 1;
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] -= 1;
							ptr -= 2;
							cells[ptr] += 1;
							ptr += 2;
						}
						ptr -= 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 8;
					}
					ptr -= 7;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 7;
						cells[ptr] += 1;
						ptr -= 7;
					}
					ptr -= 1;
					cells[ptr] += 1;
					ptr -= 9;
				}
				ptr += 8;
				cells[ptr] -= 1;
				ptr -= 5;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				cells[ptr] += 1;
				ptr -= 3;
			}
			cells[ptr] += 1;
			ptr += 8;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				ptr -= 8;
				cells[ptr] -= 1;
				ptr += 8;
			}
			cells[ptr] += 1;
			ptr -= 8;
			while(cells[ptr] != 0) {
				cells[ptr] -= 1;
				ptr += 8;
				cells[ptr] -= 1;
				ptr += 1;
				while(cells[ptr] != 0) {
					ptr += 6;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 2;
						cells[ptr] += 1;
						ptr -= 2;
					}
					ptr += 3;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
					}
					ptr -= 1;
					cells[ptr] -= 1;
					ptr += 8;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 8;
						cells[ptr] += 1;
						ptr += 1;
						while(cells[ptr] != 0) {
							ptr -= 1;
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] -= 1;
							ptr -= 2;
							cells[ptr] += 1;
							ptr += 2;
						}
						ptr -= 1;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 1;
							cells[ptr] += 1;
							ptr -= 1;
						}
						ptr += 8;
					}
					ptr -= 7;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 7;
						cells[ptr] += 1;
						ptr -= 7;
					}
					ptr -= 1;
					cells[ptr] += 1;
					ptr -= 9;
				}
				ptr += 1;
				cells[ptr] += 5;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 9;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
				}
				ptr += 5;
				cells[ptr] += 1;
				ptr += 27;
				cells[ptr] += 1;
				ptr -= 6;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 9;
				while(cells[ptr] != 0) {
					ptr += 6;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 6;
						cells[ptr] -= 1;
						ptr += 6;
					}
					cells[ptr] += 1;
					ptr -= 6;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 6;
						cells[ptr] -= 1;
						ptr += 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 8;
							cells[ptr] += 1;
							ptr += 8;
						}
						ptr -= 8;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 8;
							cells[ptr] += 1;
							ptr -= 17;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
							ptr += 4;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							cells[ptr] += 1;
							ptr += 5;
							while(cells[ptr] != 0) {
								ptr += 9;
							}
							ptr += 1;
							cells[ptr] += 1;
							ptr -= 1;
						}
					}
					cells[ptr] += 1;
					ptr += 8;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 8;
						cells[ptr] -= 1;
						ptr += 8;
					}
					cells[ptr] += 1;
					ptr -= 8;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 8;
						cells[ptr] -= 1;
						ptr -= 2;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr -= 6;
							cells[ptr] += 1;
							ptr += 6;
						}
						ptr -= 6;
						while(cells[ptr] != 0) {
							cells[ptr] -= 1;
							ptr += 6;
							cells[ptr] += 1;
							ptr -= 15;
							while(cells[ptr] != 0) {
								ptr -= 9;
							}
							ptr += 3;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							cells[ptr] += 1;
							ptr += 6;
							while(cells[ptr] != 0) {
								ptr += 9;
							}
							ptr += 1;
							while(cells[ptr] != 0) {
								cells[ptr] -= 1;
							}
							cells[ptr] += 1;
							ptr -= 1;
						}
					}
					cells[ptr] += 1;
					ptr += 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr -= 1;
						while(cells[ptr] != 0) {
							ptr += 9;
						}
						ptr -= 8;
					}
					ptr += 8;
				}
				ptr -= 9;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
				ptr += 4;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
				}
				ptr -= 3;
				cells[ptr] += 5;
				while(cells[ptr] != 0) {
					cells[ptr] -= 1;
					while(cells[ptr] != 0) {
						cells[ptr] -= 1;
						ptr += 9;
						cells[ptr] += 1;
						ptr -= 9;
					}
					ptr += 9;
				}
				ptr += 5;
				cells[ptr] -= 1;
				ptr += 27;
				cells[ptr] -= 1;
				ptr -= 6;
				while(cells[ptr] != 0) {
					ptr -= 9;
				}
			}
			ptr += 3;
		}

	}
}
