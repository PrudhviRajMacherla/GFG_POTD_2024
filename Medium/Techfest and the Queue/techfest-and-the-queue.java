//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long count(long n)
    {
        long freq=0;
        if(n<=1)
        {
            return freq;
        }
        while(n%2==0)
        {
            freq+=1;
            n=n/2;
        }
        while(n%3==0)
        {
            freq+=1;
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6)
        {
            while(n%i==0)
            {
                freq+=1;
                n=n/i;
            }
            while(n%(i+2)==0)
            {
                freq+=1;
                n=n/(i+2);
            }
        }
        if(n>3)
        {
            freq+=1;
        }
        return freq;
    }
    public static long sumOfPowers(long a, long b) {
        long ans=0;
        for(long val=a;val<=b;val++)
        {
            ans+=count(val);
        }
        return ans;
    }
}
        
