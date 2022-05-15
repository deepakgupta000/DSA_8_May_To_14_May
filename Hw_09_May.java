package com.DSA_8_May_To_14_May;

public class Hw_09_May {
	
	public static void main(String[] args) {
		int[]arr= {1,4,2,5,3};
		
		System.out.println(sumOddLengthSubarrays(arr));
		System.out.println(maxSubArraySum(arr));

	}
	
	public static int sumOddLengthSubarrays(int[] arr) {   
        int total = 0;
        int n =  arr.length;
        
        for(int i = 1; i<=n; i+=2){
            for(int j=0; j+i <=n; j+=1 )
            {
                for(int k=j; k < j+j; k+=1)
                    total+=arr[k];
            }
        }
        return total;
    }
	
	
	public static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}
