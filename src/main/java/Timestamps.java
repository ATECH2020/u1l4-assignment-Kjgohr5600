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



      int hoursBefore = scanner.nextInt();
      int minutesBefore = scanner.nextInt();
      int secondsBefore = scanner.nextInt();
      int hoursAfter = scanner.nextInt();
      int minutesAfter = scanner.nextInt();
      int secondsAfter = scanner.nextInt();

      int hoursBefore * 3600;
      int hoursAfter * 3600;
      int minutesBefore * 60;
      int minutesAfter * 60;
      int secondsAfter * 1;
      int secondsBefore * 1;

      int resultHours = hoursAfter - hoursBefore;
      int resultMinutes = minutesAfter - minutesBefore;
      int resultsSeconds = secondsAfter - secondsBefore;

      int resultFinal = resultHours + resultMinutes + resultsSeconds;

      System.out.println(resultFinal);



      

    

          
        /*
         *  your code goes here
         */


        // closing the scanner object
        scanner.close();
    }
}