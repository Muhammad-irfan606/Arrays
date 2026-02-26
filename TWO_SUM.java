.....................................................................(TWO SUM PROBLEM)..............................................................................................................................
//BRUTE FORCE(APPROACH)...........................(TIME COMPLEXITY-O(n^2)
class Main{
    public static void two_sum(int[]arr,int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    public static void main(String[]args){
        int []arr={2,7,11,15,27};
        int target=22;
        two_sum(arr,target);
    }
}

// Next approach for two sum problem..............................(Time Complexity-O(nlogn)
class Main{
    public static void two_sum(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            int x=target-arr[i];

        int start=i+1;
        int end=arr.length-1;
        
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
               System.out.println("two sum found:"+i+","+mid);
               return;
            }else if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        }System.out.println("two sum not found");
    }
    public static void main(String[]args){
        int []arr={2,7,11,15,27};
        int target=22;
        two_sum(arr,target);
    }
}
//best approach for two - sum problem ---------------Time complexity(o(n))
class Main{
    public static void two_sum(int []arr,int target){
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            if(arr[first]+arr[last]==target){
               System.out.println("two sum found:"+first+","+last);
               break;
            }else if(arr[first]+arr[last]>target){
               last=last-1;
            }else{
                first=first+1;
            }
        }
    }
    public static void main(String []args){
        int []arr={2,7,11,15,27};
        int target=22;
        two_sum(arr,target);
        }
    }
























