//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int result = solution.max_courses(n, total, cost);
            System.out.println(result);
        }
    }
}

// } Driver Code Ends




//User function Template for Java
class Solution {
    public int max_courses(int n, int total, int[] cost) {
        int[][] dp = new int[n+1][total+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        for(int i=n-1;i>-1;i--)
        {
            for(int j=0;j<total+1;j++)
            {
                int take=0,notake=0;
                notake=dp[i+1][j];
                if(cost[i]<=j){
                    int rem=j-cost[i]+(cost[i]*9)/10;
                    take=1+dp[i+1][rem];
                }
                dp[i][j]=Math.max(take,notake);
            }
        }
        return dp[0][total];
      
    }
}

