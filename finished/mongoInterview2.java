package finished;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Find all anagrams in a list of words
 * @author yamilasusta
 *
 */

public class mongoInterview2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word = "abc";
		String[] words = {"bbb", "bca", "rrotpa", "aac", "rortap", "paarroot"};
		System.out.println(Arrays.toString(findAnagrams(word, words)));

	}
	
	static String[] findAnagrams(String word, String[] words) {
		
		
		char[] letters = new char[26];
		for (int i = 0; i < word.length(); i++) 
			letters[Math.abs(49-(word.charAt(i) - '0'))] += 1;
		
		ArrayList<String> anagrams = new ArrayList<String>();
		int key = word.length();
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() == key) {
				char[] parse = new char[26];
				for (int j = 0; j < words[i].length(); j++) 
					parse[Math.abs(49-(words[i].charAt(j) - '0'))] += 1;
				boolean flag = true;
				for (int j = 0; j < parse.length; j++)
					if(parse[j] != letters[j]) flag = false;
				if(flag)
					anagrams.add(words[i]);
				
			}
		}
		
		/*
		int key = word.length();
		int index = 0;
		
		//Build index
		for (int i = 0; i < word.length(); i++) 
			index += word.charAt(i) + '0';
		
		//Find possible anagrams
		for (int i = 0; i < words.length; i++) {
			//Must be same length to be anagram
			if(words[i].length() == key) {
				int value = 0;
				
				for (int j = 0; j < words[i].length(); j++) 
					value += words[i].charAt(j) + '0';
				
				if(value == index) anagrams.add(words[i]);
			}
		}
		*/
		return anagrams.toArray(new String[anagrams.size()]);
	}
}
