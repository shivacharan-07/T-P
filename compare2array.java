public class compare2array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,3,4,9};
        int elements=0;
        if(arr.length==arr1.length){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==arr1[i]){
                elements++;
            }
            else{
                System.out.println("Array is not equal");
                break;
            }
        }
        if(elements==arr.length){
            System.out.println("Arrays are equal");
        }
    }
    else{
        System.out.println("check the array length");
    }
    }
}
