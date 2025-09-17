class RevNumber{
    public static void main(String args[]){
        int num = 123;
        System.out.println(revNumber(num));
    }
    static int revNumber(int num){
        int reversed = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }
        return reversed;
    }
}