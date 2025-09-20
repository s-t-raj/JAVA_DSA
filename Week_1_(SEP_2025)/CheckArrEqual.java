import java.util.Arrays;

public class CheckArrEqual {
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,5,4};
        System.out.println(checkEqual(arr1, arr2));
    }
    public static boolean checkEqual(int[] a, int[] b) {
        if(a.length != b.length){
            return false;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        
        return true;
    }
}
