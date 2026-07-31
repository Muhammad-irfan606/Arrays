class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount =0;
        int start=0;
        int max_Ones=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0){
                zerocount++;
            }while(zerocount>k){
                if(nums[start]==0){
                    zerocount--;
                }start++;
            }max_Ones=Math.max(max_Ones,end-start+1);
            }return max_Ones;
    }
}
