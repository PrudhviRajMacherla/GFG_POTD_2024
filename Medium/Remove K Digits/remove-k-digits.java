//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String num, int k) {
        // Stack<Character> st = new Stack<>();
        // for(char ch:S.toCharArray())
        // {
        //     while(!st.empty()&&k>0 &&st.peek()>ch)
        //     {
        //         st.pop();
        //         k-=1;
        //     }
        //     if(!st.empty()||ch!='0')
        //     {
        //         st.push(ch);
        //     }
        // }
        // while(!st.empty()&&k>0)
        // {
        //     st.pop();
        //     k-=1;
        // }
        // if(st.empty())
        // {
        //     return "0";
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!st.empty())
        // {
        //     sb.insert(0,st.pop());
        // }
        // return sb.toString();
           int len = num.length();
        //corner case
        if(k==len)        
            return "0";
            
        Stack<Character> stack = new Stack<>();
        int i =0;
        while(i<num.length()){
            //whenever meet a digit which is less than the previous digit, discard the previous one
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        
        // corner case like "1111"
        while(k>0){
            stack.pop();
            k--;            
        }
        
        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        
        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}