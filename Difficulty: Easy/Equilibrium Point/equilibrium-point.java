class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int[] leftsum = new int[arr.length];
        int[] rightsum = new int[arr.length];
        
        for(int i=1;i<leftsum.length;i++){
            leftsum[i]=arr[i-1]+leftsum[i-1];
        }
        
        for(int i=leftsum.length-2;i>=0;i--){
            rightsum[i]=arr[i+1]+rightsum[i+1];
        }
        
        for(int i=0;i<arr.length;i++){
            if(leftsum[i]==rightsum[i]){
                return i;
            }
        }
        return -1;
        
    }
}
