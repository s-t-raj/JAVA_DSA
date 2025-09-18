public class Factorial {
    public static void main(String args[]){
        int num = 2;
        System.out.println((num));
    }
    static int factorial(int n) {
        int factorial = 1;
        while(n > 1){
            factorial *= n;
            n--;
        }
        return factorial;
    }
}
