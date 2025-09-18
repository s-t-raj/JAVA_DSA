public class SecondLargestNo {
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5};
        System.out.println(getSecondLargest(arr));
    }
    
    static int getSecondLargest(int[] arr) {
        if(arr==null||arr.length < 2){
            return -1;
        }
        
        int firstElement = arr[0];
        int secondElement = -1;
        
        for(int i = 1; i < arr.length ; i++){
            if(firstElement < arr[i]){
                secondElement = firstElement;
                firstElement = arr[i];
            }
            else if(firstElement != arr[i] && secondElement < arr[i]){
                secondElement = arr[i];
            }
        }
        return secondElement;
    }
}

