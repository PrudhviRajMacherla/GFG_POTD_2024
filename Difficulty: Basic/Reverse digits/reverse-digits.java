// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int num=0;
        while(n>0){
            num=num*10+(n%10);
            n=n/10;
        }
        return num;
    }
}