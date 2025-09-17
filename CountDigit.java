class CountDigit {
    public static void main(String args[]){
        int num = 123452;
        System.out.println(countDigitOfAnNumber(num));
    }
    static int countDigitOfAnNumber(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
