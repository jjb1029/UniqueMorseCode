package com.jorden.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public int uniqueMorseCodeReprsentations(String[] words) {
		String[] morseCodes = {".-","-...","-.-.","-..",".","..-.",
				"--.","....","..",".---","-.-",".-..","--","-.",
				"---",".--.","--.-",".-.","...","-","..-","...-",
				".--","-..-","-.--","--.."};
		Set<String> set = new HashSet<String>();
		for(int i = 0; i < words.length; i++) {
			String representation = "";
			for(int j = 0; j < words[i].length(); j++) {
				char ch = words[i].charAt(j);
				int pos = ch - 'a';
				representation += morseCodes[pos];
			}
			set.add(representation);
		}
		return set.size();
		
	}
	
}
