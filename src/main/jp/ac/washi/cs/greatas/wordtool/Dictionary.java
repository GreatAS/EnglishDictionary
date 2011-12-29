package jp.ac.washi.cs.greatas.wordtool;

import java.util.HashMap;
import java.util.Set;

public class Dictionary {
	
	private static int id = 0;
	
	private HashMap<Integer, String> _id2Word;
	private HashMap<String, String> _dictionary;
	private static Dictionary _instance;
	
	// constructor
	private Dictionary() {
		_id2Word = new HashMap<Integer, String>();
		_dictionary = new HashMap<String, String>();
	}
	
	// singleton
	public static Dictionary getInstance() {
		if(_instance == null) {
			_instance = new Dictionary();
		}
		return _instance;
	}
	
	public void setWords(String en, String jp) {
		_id2Word.put(id++, en);
		_dictionary.put(en, jp);
	}
	
	public int getSize() {
		return _id2Word.size();
	}
	
	public String getWordFromId(int id) {
		return _id2Word.get(id);
	}
	
	public Set<String> getWords() {
		return _dictionary.keySet();
	}
	
	public boolean isContain(String en) {
		return _dictionary.containsKey(en);
	}
	
	public String getMeaning(String en) {
		return _dictionary.get(en);
	}
}
