public class ArmstrongNo {
    public static void main(String args[]){
        int num = 121;
        System.out.println(armstrongNumber(num));
    }
    static boolean armstrongNumber(int n) {
        int num = n;
        int armStrong = 0;
        while(n > 0){
            int lastDigit = n % 10;
            armStrong = armStrong + (lastDigit*lastDigit*lastDigit);
            n /= 10;
        }
        return num == armStrong;
    }
}
