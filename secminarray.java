public class secminarray {
    public static void main(String[] args){
        int arr[]={1,8,20,4,51};
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            } else if (arr[i] < secmin && arr[i] != min) {
                secmin = arr[i];
            }
        }
        System.out.println("Second Maximum Array Element: "+secmin);
    }
}    
