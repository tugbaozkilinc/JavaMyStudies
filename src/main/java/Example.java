import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 integers");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int min = Math.min(s1, s2);
        int max = Math.max(s1, s2);
        for(int i = 2; i<min; i++){
            if (max%i==0 || min%i==0){
                System.out.print(i + " ");

            }

        }














    }
}
