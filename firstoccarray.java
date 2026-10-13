import java.util.Scanner;
public class firstoccarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,2,5};
        System.out.print("Enter Key : ");
        int key=sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                System.out.println("index of the element: "+i);
                break;
            }
        }
        
    }
}
