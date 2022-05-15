package com.DSA_8_May_To_14_May;

import java.util.HashMap;

public class Hw_08_May {

	public static void main(String[] args) {
		String str = "0102010";
        System.out.println(getSubstringWithEqual012(str));
        
        String s1="aaaaaaabc";
        String s2="aaaaaaacb";
        
        System.out.println(buddyStrings(s1,s2));
        

	}
	
	private static int getSubstringWithEqual012(String str)
    {
 
        HashMap<String, Integer> map = new HashMap<>();
        map.put("0*0", 1);
 
        int zc = 0, oc = 0, tc = 0;
 
        int ans = 0;
 
        for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == '0')
                zc++;
            else if (str.charAt(i) == '1')
                oc++;
            else
                tc++;
 
           
            String key = (zc - oc) + "*" + (zc - tc);
           
            ans += map.getOrDefault(key, 0);
 
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
       
        return ans;
    }
	
	
	public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length() || A.isEmpty()) 
        	return false;
        
        if (!A.equals(B)) {
            int count = 0;
            char first = 'a', second = 'a';
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == B.charAt(i)) 
                	continue;
                if (count >= 2)
                	return false;
                if (count == 0) {
                    first = A.charAt(i);
                    second = B.charAt(i);
                    count++;
                    continue;
                }
                if (A.charAt(i) != second || B.charAt(i) != first)
                	return false;
                count++;
            }
            return count == 2;
        }

        if (A.length() > 26)
        	return true;
        int [] fre = new int[26];
        for (char c : A.toCharArray())
        {
            if (fre[c-'a'] == 1)
            	return true;
            fre[c-'a']++;
        }
        return false;
    }

}
