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
       int z_idx=-1;
       int o_idx=-1;
       int t_idx=-1;
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<S.length();i++)
       {
           if(S.charAt(i)=='0')
                z_idx=i;
            else if(S.charAt(i)=='1')
                o_idx=i;
            else
                t_idx=i;
            
            if(o_idx!=-1&&t_idx!=-1&&z_idx!=-1)
            {
                int min=Math.min(o_idx,Math.min(t_idx,z_idx));
                int max=Math.max(o_idx,Math.max(t_idx,z_idx));
                ans=Math.min(ans,max-min+1);
            }
       }
       return ans==Integer.MAX_VALUE?-1:ans;
    }
};
