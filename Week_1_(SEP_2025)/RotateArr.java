public class RotateArr {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int d = 2;
        rotateArr(arr, d);
        System.out.println(arr);
    }
     static void rotateArr(int arr[], int d) {
        while(d>0){
            for(int i = arr.length-1; i >= 0; i--){
                int temp = arr[i];
                arr[i] = arr[arr.length-1];
                arr[arr.length-1] = temp;
            }
            d--;
        }
        
    }
}
