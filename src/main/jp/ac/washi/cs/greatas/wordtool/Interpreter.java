package jp.ac.washi.cs.greatas.wordtool;

import java.util.Scanner;

public class Interpreter {
	
	Dictionary _dictionary;
	
	// constructor
	public Interpreter(Dictionary dictionary) {
		_dictionary = dictionary;
	}
	
	public void run(Scanner sc) {
		String command = sc.next();
		while(!command.equals("q")) {
			if(_dictionary.isContain(command)) {
				System.out.println(_dictionary.getMeaning(command));
			}
			else {
				System.out.println("Not registered.");
			}
			command = sc.next();
		}
	}
}
