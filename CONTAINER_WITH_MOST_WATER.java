***********************************BRUTE_FORCE_APPROACH*********************************TIMECOMPLEXITY - o(n^2)
class Main{
    public static int max_Water(int []height){
        int maxwaterstorage=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int storingcapacity=Math.min(height[i],height[j]);
                int width=j-i;
                int area=storingcapacity*width;
                int ans=Math.max(area,maxwaterstorage);
            }
        }return ans;
    }
    
    public static void main(String[]args){
        int []height ={1,8,6,2,5,4,8,3,7};
        System.out.println(max_Water(height));
    }
}


************************************************************OPTIMIZED APPOARCH********************TIME_COMPLEXITY(O(n)
class Main{
    public static int maxwater(int []height){
        int maxwater=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int capacity=Math.min(height[left],height[right]);
            int width = right -left;
            int area=capacity*width;
            maxwater=Math.max(maxwater,area);
            
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }return maxwater;
    }
    public static void main(String []args){
        int []height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxwater(height));
    }
}


