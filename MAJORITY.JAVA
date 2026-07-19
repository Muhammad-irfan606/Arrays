class  Main{
    public static  int majorityelements(int []arr){
        int candidate=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
                if(count==0){
                    candidate=arr[i];
                    count+=1;
                }
            }
        }return candidate;
    }
    public static void main(String []args){
        int []arr ={2,2,1,3,1,2,2};
        System.out.println("MAJORITY ELEMENTS : "+majorityelements(arr));
    }
}
