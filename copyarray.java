public class copyarray {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int copy[]=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            copy[i]=arr[i];
        }
        for(int i:copy){
            System.out.print(i+" ");
        }
    }
}
