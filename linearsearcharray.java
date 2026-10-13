import java.util.Scanner;
public class linearsearcharray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Element Which You Want to Search: ");
        int key=sc.nextInt();

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                System.out.println("The Given Element is at Array Index "+i);
            }
        }
    }
}
