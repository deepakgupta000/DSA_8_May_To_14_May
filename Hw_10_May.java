package com.DSA_8_May_To_14_May;

import java.util.HashMap;
import java.util.Map;

public class Hw_10_May {

public static void main(String[] args) {
		
		String s = "hequickbrownfoxjumpsoverthelazydovbvbfbvfbdvbfvbsdb";
		
		int temp[] = new int[26];
		
		s = s.toUpperCase();
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			int ascii = ch;
			
			//Convert it onto a small value
			
			int x = ascii - 'A';  // if ch = A, 65 -65 = 0
			
			temp[x] = temp[x]+1;
			
		}
		
		for(int i =0;i<temp.length;i++) {
			if(temp[i]==0) {
				System.out.println("false");
				return;
			}
		}
		
		System.out.println("true");
		
		//************************************************8
		
		String X = "tommarvoloriddle";       
        String Y = "iamlordvoldemort";        
 
        if (isAnagram(X, Y)) {
            System.out.print("Anagram");
        }
        else {
            System.out.print("Not an Anagram");
        }

	}
	
	
	public static boolean isAnagram(String X, String Y)
    {
       
        if (X == null || Y == null) {
            return false;
        }
 
                if (X.length() != Y.length()) {
            return false;
        }
 
        
        Map<Character, Integer> freq = new HashMap<>();
 
     
        for (char c: X.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
 
    
        for (char c: Y.toCharArray())
        {
            
            if (!freq.containsKey(c)) {
                return false;
            }
 
        
            freq.put(c, freq.get(c) - 1);
 
        
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }
        return freq.isEmpty();
    }
}
