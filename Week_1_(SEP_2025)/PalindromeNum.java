class PalindromeNum {
    public static void main(String args[]){
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num){
        int originalNum = num;
        int rev = 0;
        while(num != 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }
        return rev == originalNum;
    }
}
