//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        int i=0,j=0;
        long running_sum=0,prev=0,max=0;
        while(i<k)
        {
            running_sum=running_sum+a[i++];//This maintain the atleast size of array
        }
        max=running_sum;
        while(i<n)
        {
            running_sum=running_sum+a[i++];
            prev=prev+a[j++];
            
            max=Math.max(running_sum,max);
            if(prev<0)
            {
                running_sum=running_sum-prev;
                prev=0;
                max=Math.max(running_sum,max);
            }
        }
        return max;
    }
}