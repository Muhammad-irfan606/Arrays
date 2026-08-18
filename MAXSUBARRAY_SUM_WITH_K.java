*******************************************************MAX SUBARRAY SUM OF SIZE K*******************************(BRUTE FORCE APPRAOCH)**************
class Main{
    public static int max_subsum(int []arr,int k){
        int maxsum=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<k+i;j++){
                sum+=arr[j];
                maxsum=Math.max(sum,maxsum);
            }
        }return maxsum;
    }
    public static void main(String []args){
        int []arr={1,4,2,10,23,3,1,0,20};
        int k=4;
        System.out.println(max_subsum(arr,k));
    }
}

***************************************************OPTIMIZED APPROACH       TIME COMPLEXITY---(O(n))*****************************************
class Main{
    public static void main(String []args){
        int []arr={1,4,2,10,23,3,1,0,20};
        int k=4;
       System.out.println(max_subarraysum(arr,k));
    }
    public static int max_subarraysum(int []arr,int k){
        int n=arr.length;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
          } int max_ans=windowsum;
            for(int j=k;j<n;j++){
                windowsum+=arr[j];
                windowsum-=arr[j-k];
                max_ans=Math.max(max_ans,windowsum);
            }return max_ans;
        }
    }
