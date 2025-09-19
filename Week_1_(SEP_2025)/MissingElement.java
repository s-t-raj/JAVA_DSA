public class MissingElement {
    public static void main(String args[]){
        int[] arr = {1,2,3,5};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int arr[]) {
        long totalSum = ((long)(arr.length+1)*((arr.length+1)+1))/2;
        long arrSum = 0;
        for (int num : arr){
            arrSum += num;
        }
        return (int)(totalSum - arrSum);
    }
}
