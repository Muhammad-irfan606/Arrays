public class Main{
    public static int trapped_Water(int[]height){
        int n=height.length;
        //calculate left Max boundary
        int []leftmax=new int [n];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right Max Boundary
        int []rightmax=new int [height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //calculate Trapped water
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[]args){
        int []height={4,2,0,6,3,2,5};
        System.out.println(trapped_Water(height));
    }
}
