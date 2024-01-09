//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        //kmp-algo
        String str=pat+"#"+txt;
        int[] lps = new int[str.length()];
        for(int i=1;i<str.length();i++)   // constructing an lps array
        {
            int x=lps[i-1];
            while(str.charAt(i)!=str.charAt(x))
            {
                if(x==0)
                {
                    x=-1;
                    break;
                }
                x=lps[x-1];
            }
            lps[i]=x+1;
        }
        ArrayList<Integer> al = new ArrayList<>();
        int m=pat.length();
        for(int i=m,j=1;i<str.length();i++,j++)
        {
            if(lps[i]==m)
            {
                al.add(j-m);
            }
        }
        if(al.size()==0)
        {
            al.add(-1);
        }
        return al;
    }
}