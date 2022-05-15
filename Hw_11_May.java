package com.DSA_8_May_To_14_May;

public class Hw_11_May {
	
	public static void main(String[] args) {

		String s = "ab123t5";
		String str="Pr!ogr#am%m*in&g Lan?#guag(e";  
		String resultStr="";
		
		int sum = 1;
		
		String str3="12as%^y&";
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);   
			
			if(ch.isDigit(ch)) {
				int x = ch.getNumericValue(ch);
				sum = sum*x;
			}
		}
		
		System.out.println(sum);
		
		//*********************************************************8
		System.out.println(removeSC(str,resultStr));
		
		count(str3);

	}
	
	private static void count(String aldisp_str) {
		char ch;
		int alph=0,digi=0,spl=0;
		for(int i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("Number of Alphabet  " + alph);
		System.out.println("Number of Digit " + digi);
		System.out.println("Number of Special " + spl);
		
	}

	public static String removeSC(String str,String resultStr) {
		for (int i=0;i<str.length();i++)  
		{  
		  
		if (str.charAt(i)>64 && str.charAt(i)<=122) 
		{  
		
		resultStr=resultStr+str.charAt(i);  
		}  
		}
		return resultStr;  
	}

}
