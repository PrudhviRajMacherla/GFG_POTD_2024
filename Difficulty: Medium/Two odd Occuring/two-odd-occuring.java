class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = arr[i]^ xor;
        }
        int bitMask = 1;
        while(true){
            if((bitMask&xor)!=0){
                break;
            }
            bitMask<<=1;
        }
        int fe = 0;
	    int se = 0;
	    for(int i=0;i<arr.length;i++){
	        if((bitMask & arr[i])==0){
	           // System.out.println("First"+arr[i]);
	            fe=fe ^ arr[i];
	        }
	        else{
	           // System.out.println("Second"+arr[i]);
	            se= se ^ arr[i];
	        }
	    }
        ArrayList<Integer> al = new ArrayList<>();
        if(fe>se){
            al.add(fe);
            al.add(se);
        }
        else{
            al.add(se);
            al.add(fe);
        }
        return al;
    }
}
