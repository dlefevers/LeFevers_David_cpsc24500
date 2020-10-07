import java.util.Scanner;
import java.io.File;

public class baseballAnalyzer {
    public static void header() {
        System.out.println("***************************************");
        System.out.println("      Baseball Standings Analyzer      ");
        System.out.println("***************************************");
        System.out.println("");
    }
    public static void table() {
        System.out.println("");
        System.out.println("Which standings would you like to see?");
        System.out.println("1. AL East");
        System.out.println("2. AL Central");
        System.out.println("3. AL West");
        System.out.println("4. NL East");
        System.out.println("5. NL Central");
        System.out.println("6. NL West");
        System.out.println("7. Overall");
        System.out.println("8. Exit");
        System.out.println("");
    }
    public static void main(final String[] args) {
        header();
        int doAgain; 
        doAgain = 1;
        while (doAgain == 1) {
            table();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter one of the eight numbers above: ");
            int number = sc.nextInt();
            if (number == 1) {
                System.out.println("This works");
            } else if (number == 2) {
                System.out.println("This works"); 
            } else if (number == 3) {
                System.out.println("This works"); 
            } else if (number == 4) {
                System.out.println("This works"); 
            } else if (number == 5) {
                System.out.println("This works"); 
            } else if (number == 6) {
                System.out.println("This works"); 
            } else if (number == 7) {
                System.out.println("This works"); 
            } else if (number == 8) {
                System.out.println("Thank you for using this program! :)");
                doAgain = 2;
            }
        }
    }
}
