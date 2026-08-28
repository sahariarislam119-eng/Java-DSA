package Time_And_Space_Comlexity;

public class TimeComplexityApproach1 {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,3,2,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    System.out.println("Duplicate element = "+arr[i]);
                    break;
                }
            }
        }
    }
}
