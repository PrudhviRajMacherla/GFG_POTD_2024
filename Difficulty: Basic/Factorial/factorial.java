class Solution {
    static int factorial(int n) {
        // code here
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}