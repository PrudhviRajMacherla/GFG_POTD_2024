//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.singleElement(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int singleElement(int[] arr , int N) {
        Set<Integer> st = new HashSet<>();
        for(int e:arr)
        {
            st.add(e);
        }
        int set_sum=0;
        for(int i:st)
        {
            set_sum+=i;
        }
        int ans_sum=0;
        for(int j:arr)
        {
            ans_sum+=j;
        }
        return ((3*set_sum)-ans_sum)/2;
    }
    
}