package Time_And_Space_Comlexity;

public class TimeComplexityApproach2Optimized {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,3,2,4};
        int n = arr.length-1;
        int sum=(n*(n+1))/2,arrSum=0;
        for(int i=0;i<arr.length;i++){
            arrSum += arr[i];
        }
        System.out.println("Duplicate element = "+(arrSum-sum));
    }
}
