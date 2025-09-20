public class RotateArrBy1 {
   public static void main(String args[]){
        int[] arr ={1,2,3,4,5};
        rotate(arr);
        System.out.println(arr);
   }
   static void rotate(int[] arr) {
        for(int i = 0; i < arr.length ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length - 1] = temp;
        }
    } 
}
