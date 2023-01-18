package day07loop;

public class Loop06 {

    public static void main(String[] args) {

        // Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

        int a = 30, b = 40, c = 0;

        for (int i = a*b; i>0; i--){
            if (a%i==0 && b%i==0){
                c = i;
                break;
            }
        }

        System.out.println("Greatest Common Divisor is: " + c);
        System.out.println("Least Common Multiple is: " + (a*b)/c);
















    }
}
