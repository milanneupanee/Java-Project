package ArreyInJava;
public class ReturnEvenSumArray {
    public static int sum(int[] num){
        int sums=0;
        for(int even:num ){
            if (even%2==0) {
                sums +=even;
            }
            /*
            * for(int i=0;i<num.length;i++){
            * if (num[i]%2==0){
            * }*/
        }
        return sums;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        int su=sum(nums);
        System.out.println(su);
    }
}
