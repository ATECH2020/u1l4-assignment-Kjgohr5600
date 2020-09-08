import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
      //a represents amount of students for aClass.
      //b represents amount of students for bClass.
      //c represents amount of students for cClass.
        //Reads ints from user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int desksA;
        int desksB;
        int desksC;
        

      //desks for class a
      if ( a % 2 == 0)
      {
        desksA = a / 2;
      } else {
        desksA = (a / 2) + 1;
      }

      if (b % 2 == 0)
      {
        desksB = a / 2;
      }else{
        desksB = (a / 2) + 1;        
      }

      if (c % 2 == 0)
      {
        desksC = c / 2;
      }else{
        desksC = (c / 2) + 1;
      }
       
      int desksFinal = desksA + desksB + desksC;

      System.out.print(desksFinal);

      
        /*
         *  your code goes here
         */


        // closing the scanner object
        scanner.close();
    }
}