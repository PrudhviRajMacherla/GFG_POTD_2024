//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
        // Code here
        long mod=(long)1e9+7;
        long o_b=1;//old building
        long o_s=1;//old space
        
        
        for(int i=2;i<=N;i++)
        {
           long n_b=o_s%mod;
           long n_s=(o_s+o_b)%mod;
           
           o_s=n_s;
           o_b=n_b;
        }
        
        long res=(o_s+o_b)%mod;
        return (int)((res*res)%mod);
    }
}