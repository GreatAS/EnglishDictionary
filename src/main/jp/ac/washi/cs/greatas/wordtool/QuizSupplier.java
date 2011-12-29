package jp.ac.washi.cs.greatas.wordtool;

import java.io.BufferedReader;
import java.io.IOException;

public class QuizSupplier {
	
	Dictionary _dictionary;
	
	// constructor
	public QuizSupplier(Dictionary dictionary) {
		_dictionary = dictionary;
	}
	
	public void run(BufferedReader reader) throws IOException {
		System.out.printf(">> Please type enter.\n>> ");
		int size = _dictionary.getSize();
		
		String command = reader.readLine();
		while(!command.equals("q")) {
			int d = (int)(Math.random()*size);
			System.out.println(">> " + _dictionary.getWordFromId(d));
			System.out.printf(">> ");
			command = reader.readLine();
		}	
	}
}
