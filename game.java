import java.util.Random;
import java.util.Scanner;

class game {

    public static void main ( String [] arg ) {
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int random_num = 1+random.nextInt(11);

        System.out.print("Guess a number from 1 to 10: ");
        int guess = scanner.nextInt();
        int num_guess = 0;

        while(num_guess < 3 ) {

            boolean lessThan = guess < random_num;
            boolean greaterThan = guess > random_num;

            // user guess one is less than answer
            if(lessThan) {
                num_guess++;
                System.out.print("Secret number is greater than " + guess + ". Please enter a higher number to guess correctly: ");
                int userGuessTwo = scanner.nextInt();

                // user guess two is greater than answer
                if(userGuessTwo < random_num) {
                    num_guess++;
                    System.out.print("Secret number is still less than " + guess + ". Please enter a lower number to guess correctly: ");
                    int userGuessThree = scanner.nextInt();

                    // user guess three is greater than answer
                    if(userGuessThree > random_num) {
                        num_guess = 0;
                        System.out.print("Sorry you have 3 wrong guesses.");
                        break;
                    }

                    // user guess three is less than answer
                    else if (userGuessThree < random_num) {
                        num_guess = 0;
                        System.out.print("Sorry you have 3 wrong guesses.");
                        break;
                    }

                    //  user guess three is the correct answer
                    else {
                        System.out.print("Congratulations, your guess number " + random_num + " is correct.");
                        num_guess = 0;
                        break;
                    }
                }

            }


            // user guess one is greater than answer
            else if(greaterThan) {
                num_guess++;
                System.out.print("Secret number is less than " + guess + ". Please enter a lower number to guess correctly: ");
                int greaterThanAnsTwo = scanner.nextInt();

                // user guess two is greater than answer
                if(greaterThanAnsTwo > random_num) {
                    num_guess++;
                    System.out.print("Secret number is still less than " + guess + ". Please enter a lower number to guess correctly: ");
                    int greaterThanAnsThree = scanner.nextInt();

                    // user guess three is greater than answer
                    if(greaterThanAnsThree > random_num) {
                        num_guess = 0;
                        System.out.print("Sorry you have 3 wrong guesses.");
                        break;
                    }

                    // user guess three is less than answer
                    else if (greaterThanAnsThree < random_num) {
                        num_guess = 0;
                        System.out.print("Sorry you have 3 wrong guesses.");
                        break;
                    }

                    //  user guess three is the correct answer
                    else {
                        System.out.print("Congratulations, your guess number " + random_num + " is correct.");
                        num_guess = 0;
                        break;
                    }
                }

            }
            // user guess one is correct answer
            else {
                System.out.print("Congratulations, your guess number " + random_num + " is correct.");
                num_guess = 0;
                break;
            }



        }

        if(num_guess > 2){
            System.out.print("Sorry you are unable to correctly guess the number which is " + random_num + ".");
            num_guess = 0;
        }
        
    }
}