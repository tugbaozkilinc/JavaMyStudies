package switchs;

public class Switch {

    public static void main(String[] args) {

        /*
          Type a code to display the number of days in a given month of a given year.
          Example: The number of days in February 2000 was 29.
        */

        int numOfMonth = 2;
        int numOfYear = 2000;
        int numOfDay = 0;

        switch (numOfMonth){
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numOfDay = 31;
                break;
            case 4: case 6: case 9:
            case 11:
                numOfDay = 30;
                break;
            case 2:
                if (numOfYear%4==0 && numOfYear%100==0 || numOfYear%400==0){
                    numOfDay = 29;
                } else {
                    numOfDay = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
        }

        System.out.println("Number of days: " + numOfDay);


    }
}
