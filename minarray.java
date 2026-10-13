public class minarray {
    public  static void main(String[]args){
        int arr[]={8,2,9,4,5};
        int min=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum array element : "+min);
    }
}
