***********************************************PRODUCT LESS THAN K******************BRUTE_FORCE_APPROACH_________TC-O(n^3)
class Main{
    public static int prod_less_than_k(int []arr,int max){
        int count =0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int prod=1;
                for(int k=i;k<=j;k++){
                   prod*=arr[k];
                   }if(prod<max){
                    count++;
                }
            }
        }
    return count;
    }
    public static void main(String []args){
        int []arr={10,5,2,6};
        int max=100;
        System.out.println(prod_less_than_k(arr,max));
    }
}


******************************************************PRODUCT LESS THAN K******************BRUTE_FORCE_APPROACH_________TC-O(n^2)
class Main{
    public static int product(int []nums,int k){
      if(k<=1){
        return 0;
      }
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j>=0;j--){
                prod*=nums[j];
                if(prod<k){
                count++;
            }else{
                break;
            }
            }
    }return count;
    }
    public static void main(String []args){
        int []nums ={10,5,2,6};
        int k=100;
        System.out.println(product(nums,k));
    }
}
***************************************************PRODUCT LESS THAN K***********OPTIMIZED APPROACH***************TIME-COMPLEXITY O(n)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int left=0;
        int count=0;
        int prod=1;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }count+=right-left+1;
        }return count;
    }
}
  




















  
