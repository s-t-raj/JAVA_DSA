public class ArraySearch {
    public static void main(String args[]){
        int [] arr ={2,3,5,10};
        int target = 3;
        System.out.println(search(arr, target));
    }
    static int search(int arr[], int x) {
        for (int i = 0 ; i < arr.length ;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
