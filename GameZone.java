import java.util.Scanner;
import java.util.Random;
public class GameZone {
    /** welcome function*/
    public static void welcome(){
        System.out.println("***************************");
        System.out.println("   Welcome to Game Zone");
        System.out.println("***************************");
    }
    /** brings up table of options */
        public static void table(){
            System.out.println("What would you like to play?");
            System.out.println("1. Twenty-one");
            System.out.println("2. Rock Paper Scissors");
            System.out.println("3. Neither - I'm done!");
        }
        /** goodbye function */
        public static void goodbye(){
            System.out.println("Thank you for playing!");
        }
        /** main */
        public static void main(final String[] args) {
            welcome();
            table();
            int number = 1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the number of the game you want to play. ");
            number = sc.nextInt();
            /** repeats until user picks 3 */
            while (number == 1 || number == 2){
            /** game 21 */
            if (number == 1) {
                Random rnd = new Random();
                int total = 0;
                String again = "y";
                int dealer = rnd.nextInt(7) + 13;
                while (again.equalsIgnoreCase("y")){
                    int player = rnd.nextInt(11) + 1;
                    total = total + player;
                    System.out.printf("You drew %d.\n", (player));
                    System.out.printf("Your current total is %d.\n", (total));
                    if (total > 21){
                        System.out.println("You busted!\n");
                        again = "n"; 
                    }
                    else if (total == 21) {
                        System.out.println("You won!\n");
                        again = "n";
                    }
                    else {
                    System.out.print("Do you want to draw another card? ");
                    again = sc.next().trim();
                    }
                }
                    
                if (total >= 21) {
                    System.out.print("");
                }
                else if (total < 21){
                    System.out.printf("The dealer drew %d.\n", (dealer));
                if (total == dealer){
                    System.out.println("It's a tie.\n");
                } else if (total > dealer){
                    System.out.println("You win!\n");
                } else if (total < dealer){
                    System.out.println("You lose. :(\n");
                }
            }
                /** rock paper scissors */
            } else if (number == 2) {
                Random rnd = new Random();
                int x = rnd.nextInt(2);
                int y = rnd.nextInt(2);
                if (x == 0 && y == 0){
                    System.out.println("You played Paper, and the computer played Paper.");
                    System.out.println("It's a tie.\n");
                } else if (x == 1 && y == 1){
                    System.out.println("You player Rock, and the computer played Rock.");
                    System.out.println("It's a tie.\n");
                } else if (x == 2 && y == 2){
                    System.out.println("You played Scissors, and the computer played Scissors.");
                    System.out.println("It's a tie.\n");
                } else if ( x == 0 && y == 1){
                    System.out.println("You played Paper, and the computer played Rock.");
                    System.out.println("You win!\n");
                } else if (x == 1 && y == 2){
                    System.out.println("You played Rock, and the computer played Scissors.");
                    System.out.println("You lose. :(\n");
                } else if (x == 2 && y == 0){
                    System.out.println("You played Scissors, and the computer played Paper.");
                    System.out.println("You win!\n");
                } else if (x == 0 && y == 2){
                    System.out.println("You played Paper, and the computer played Scissors.");
                    System.out.println("You lose. :(\n");
                } else if (x == 1 && y == 0){
                    System.out.println("You played Rock, and the computer played Paper.");
                    System.out.println("You lose. :(\n");
                } else if (x == 2 && y == 1){
                    System.out.println("You played Scissors, and the computer played Rock.");
                    System.out.println("You lose. :(\n");
                }    
        }
        table(); 
        System.out.print("Please enter the number of the game you want to play. ");
            number = sc.nextInt();
    } 
    goodbye();
    }
}