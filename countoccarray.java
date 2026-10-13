import java.util.Scanner;
public class countoccarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,3,3,4,4};
        int count=0;
        System.out.print("Enter key: ");
        int key=sc.nextInt();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println("no of times the element occured: "+count);
    }
}
