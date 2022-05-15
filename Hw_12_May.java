package com.DSA_8_May_To_14_May;

public class Hw_12_May {

	public static void main(String[] args) {
        String str[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                    };
 
        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
        
        char str1[] = {'a', 'b', 'c'};
        subString(str1, str.length);

	}
	
	
	
	public static String printSequence(String arr[],String input)
    {
        String output = "";
     
        // length of input string
        int n = input.length();
        for (int i = 0; i < n; i++)
        {
            if (input.charAt(i) == ' ')
                output = output + "0";
     
            else
            {
                
                int position = input.charAt(i) - 'A';
                output = output + arr[position];
            }
        }
     
        return output;
    }
	
	
	public static void subString(char str[], int n) {
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                 
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }
 
                System.out.println();
            }
        }
    }
}
