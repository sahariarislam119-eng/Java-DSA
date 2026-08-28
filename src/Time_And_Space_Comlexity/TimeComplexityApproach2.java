package Time_And_Space_Comlexity;

public class TimeComplexityApproach2 {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,3,2,4};
        boolean[] flag = new boolean[arr.length];
        for(int i=1;i<arr.length;i++){
            if(flag[arr[i]]==true){
                System.out.println("Duplicate element = "+arr[i]);
                break;
            }
            else flag[arr[i]] = true;
        }
    }
}
