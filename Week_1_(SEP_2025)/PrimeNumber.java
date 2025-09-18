class PrimeNumber{
    public static void main(String args[]){
        int num = 10;
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n) {
        if(n < 2){
            return false;
        }

        // reduce the iteration 
        //Math.sqrt(n) is very efficient check skip the dupilcate checks

        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if((n % i)==0){
                return false;
            }
        }
        return true;
    }
}