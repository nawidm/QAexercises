package Exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashmapsAnagrams {
	
	private ArrayList<String> words = new ArrayList<String>();
	private HashMap<String, ArrayList<String>> allAnagrams = new HashMap<String, ArrayList<String>>();
	
	public void read(File f) {
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = "";
			while((line = br.readLine()) != null) {
				words.add(line);
			}
			br.close();
		} catch(Exception e) {
			
		}
	}
	
	public String sort(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
	}

	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(ArrayList<String> words) {
		this.words = words;
	}
	
	public String getMostAnagrams() {
		for(String s : words) {
			if(allAnagrams.containsKey(sort(s))) {
				allAnagrams.get(sort(s)).add(s);
			} else {
				ArrayList<String> anagrams = new ArrayList<String>();
				anagrams.add(s);
				allAnagrams.put(sort(s), anagrams);
			}
		}
		
		int currentHighest = 0;
		String wordMostAnagrams = "";
		for(String word : allAnagrams.keySet()) {
			int numberAnagramsThisWord = allAnagrams.get(word).size();
			if(numberAnagramsThisWord > currentHighest) {
				currentHighest = numberAnagramsThisWord;
				wordMostAnagrams = word;
			} else if(numberAnagramsThisWord == currentHighest) {
				if(wordMostAnagrams.length() < word.length()) {
					wordMostAnagrams = word;
				} else if(wordMostAnagrams.length() == word.length()) {
					wordMostAnagrams += " and "+word;
				} 
			}
		}
		System.out.println(currentHighest);
		return wordMostAnagrams;
	}
	
	public static void main(String[] args) {
		HashmapsAnagrams test = new HashmapsAnagrams();
		File f = new File("Anagrams.txt");
		test.read(f);
		System.out.println(test.getMostAnagrams());
	}
}
