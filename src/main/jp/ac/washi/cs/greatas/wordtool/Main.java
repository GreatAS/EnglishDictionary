package jp.ac.washi.cs.greatas.wordtool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dictionary dir = null;
		try {
			dir = DataLoader.loadDictionary("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
//		Interpreter itp = new Interpreter(dir);
//		Scanner sc = new Scanner(System.in);
//		itp.run(sc);

		QuizSupplier qs = new QuizSupplier(dir);
		try {
			qs.run(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(">> system end.");
	}
}
