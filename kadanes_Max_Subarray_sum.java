class Main{
    public static void max_SubarraySum(int[]arr){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
    }
    System.out.println("our maximum subarray sum is:"+ms);

}

    public static void main(String[]args){
        int []arr={-2,-3,4,-1,-2,1,5,-3};
        max_SubarraySum(arr);
    }
}
