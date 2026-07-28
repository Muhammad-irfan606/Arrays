******************************************************************BRUTE-FORCE APPROACH*********************************
class Main{
    public static int max_consecutives(int []arr){
        int max_ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]==1){
                    count++;
                    max_ans=Math.max(max_ans,count);
                }else{
                    break;
                }
            }
        }return max_ans;
        
    }
    
    public static void main(String[]args){
        int []arr={1,1,1,0,1,1,1,1};
        System.out.println(max_consecutives(arr));
    }
}

******************************************************OPTIMIZED*********************
class Main{
    public static int max_consecutives(int []arr){
        int n=arr.length;
        int max_ans=0;
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==1){
                count++;
                max_ans=Math.max(max_ans,count);
            }else{
                count=0;
            }
        }return max_ans;
    }
    public static void main(String []args){
        int []arr={1,1,1,0,1,1,1,1};
        System.out.println(max_consecutives(arr));
        
    }
}























