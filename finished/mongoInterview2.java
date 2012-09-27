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
		String word = "parrot";
		String[] words = {"parot", "ferret", "rrotpa", "aro", "rortap", "paarroot"};
		System.out.println(Arrays.toString(findAnagrams(word, words)));

	}
	
	static String[] findAnagrams(String word, String[] words) {
		
		ArrayList<String> anagrams = new ArrayList<String>();
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
		
		return anagrams.toArray(new String[anagrams.size()]);
	}
}
