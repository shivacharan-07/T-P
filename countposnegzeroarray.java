public class countposnegzeroarray {
    public static void main(String[] args) {
        int arr[]={0,1,2,-3,4,5};
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<=arr.length-1;i++){
            if (arr[i]>0) {
                positive++;
            }else if (arr[i]<0) {
                negative++;
            }else{
                zero++;
            }
        }
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("Zero: "+zero);
    }
}
