package jp.ac.washi.cs.greatas.wordtool;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataLoader {
	
	private DataLoader() {
		
	}
	
	public static Dictionary loadDictionary(String fileName) throws IOException {
		Dictionary dir = Dictionary.getInstance();
		
		BufferedReader br;
		br = new BufferedReader(
				new InputStreamReader(
					new FileInputStream(fileName)));
				
		String line;
		while((line = br.readLine()) != null) {
			String[] words = line.split(",");
			dir.setWords(words[0], words[1]);
		}
		
		return dir;
	}
}
