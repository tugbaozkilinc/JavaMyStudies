package specialnumbers;

public class ArmstrongNumber {

    public static void main(String[] args) {

           /*
             A number is called an Armstrong number if it equals the sum of the cube of its every digit.
             For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
             cube of every digit. Type a code to check if the given number is the Armstrong number or
             not.
           */

        // 1. yol:
        int number = 370;
        String s = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i<s.length(); i++){
            String ch = s.substring(i,i+1);
            sum = sum + Integer.valueOf(ch)*Integer.valueOf(ch)*Integer.valueOf(ch);
        }

        if (sum==number){
            System.out.println(number + " is armstrong number");
        } else {
            System.out.println(number + " is not armstrong number");
        }

        // 2. yol:
        int sumOfDigits = 0;
        int digit;

        for (int i = number; i>0; i/=10){
            digit = i%10;
            sumOfDigits = sumOfDigits + digit*digit*digit;
        }

        if (sumOfDigits==number){
            System.out.println(number + " is armstrong number");
        } else {
            System.out.println(number + " is not armstrong number");
        }


    }
}
