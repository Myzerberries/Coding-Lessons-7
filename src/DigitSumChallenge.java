public class DigitSumChallenge {

    public static void main(String[] args){
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number){
        if(number < 0){
            return -1;
        }

        int addDigits = 0;
        int lastDigit = number;
        while(true){
            lastDigit %= 10;
            addDigits += lastDigit;
            if(number / 10 == 0){
                break;
            }
            number /= 10;
            lastDigit = number;
        }
        return addDigits;
    }

}
