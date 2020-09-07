import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
      int hourDegree = scanner.nextInt();


      int passedHrs = hourDegree / 30;
      int degPassed = passedHrs * 30;
      int passedMin = hourDegree - degPassed;
      int minDegree = (30 - passedMin) * 6;
      System.out.print(minDegree);


        //Reads ints from user

      
        /*
         *  your code goes here
         */

        // closing the scanner object
        scanner.close();
    }
}