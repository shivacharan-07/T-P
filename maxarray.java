public class maxarray {
    public  static void main(String[]args){
        int arr[]={1,80,9,4,5};
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum array element : "+max);
    }
}
