public class secmaxarray {
    public static void main(String[] args){
        int arr[]={1,2,20,4,51};
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if (arr[i] > secmax && arr[i] != max)
                {
                secmax = arr[i];
            }
        }
        System.out.println("Second Maximum Array Element: "+secmax);
    }
}    
