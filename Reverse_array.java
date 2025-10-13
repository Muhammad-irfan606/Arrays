public class reverse_Array{
    public static void reverse(int []arr){
        int first=0;int last=arr.length-1;
        while(first<last){
            int temp=arr[last];
            arr [last]=arr[first];
            arr [first]=temp;
            first++;
            last--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        int []arr={2,4,6,8,10};
        reverse(arr);
    }
}






