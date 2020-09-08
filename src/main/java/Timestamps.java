import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
          
        /*
         *  your code goes here
         */
          int secHours1 = hours1 * 3600; //conv hrs to sec
          int secHours2 = hours2 * 3600;//same as abv
          int secMinutes1 = minutes1 * 60;//conv min sec
          int secMinutes2 = minutes2 * 60;//same as abv
          int secSeconds1 = seconds1 * 1;//conv sec to sec
          int secSeconds2 = seconds2 * 1;//same as abv

          int resultHours = secHours2 - secHours1;
          int resultMinutes = secMinutes2 - secMinutes1;
          int resultsSeconds = secSeconds2 - secSeconds1;

          int resultFinal = resultHours + resultMinutes + resultsSeconds;

          System.out.print(resultFinal);

        // closing the scanner object
        scanner.close();
    }
}