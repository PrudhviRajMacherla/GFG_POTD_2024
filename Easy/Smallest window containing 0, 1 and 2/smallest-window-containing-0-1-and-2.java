//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
       int z_c=0,o_c=0,t_c=0;
       int res=Integer.MAX_VALUE;
       int i=0,j=0;
       while(i<S.length())
       {
           char ch=S.charAt(i);
           i++;
           if(ch=='0')
           {
               z_c+=1;
           }
           else if(ch=='1')
           {
               o_c+=1;
           }
           else
           {
               t_c+=1;
           }
           while(z_c>0&&o_c>0&&t_c>0)
           {
               res=Math.min(i-j,res);
               char ch1=S.charAt(j);
               j+=1;
               if(ch1=='0')
               {
                   z_c-=1;
               }
               else if(ch1=='1')
               {
                   o_c-=1;
               }
               else
               {
                   t_c-=1;
               }
           }
       }
       return res==Integer.MAX_VALUE?-1:res;
    }
};
