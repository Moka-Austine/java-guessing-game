import java.util.Random;
import java.util.Scanner;

class game {

    public static void main ( String [] arg ) {
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int random_num = 1+random.nextInt(10);
        System.out.println(random_num);

        firstGuess: while(true) {
            System.out.print("Guess a number from 1 to 10: ");
            int guess = scanner.nextInt();

            int num_guess = 0;

            if(guess < 11 && guess > 0) {
                while(num_guess < 3 ) {

                    boolean lessThan = guess < random_num;
                    boolean greaterThan = guess > random_num;

                    // user guess one is less than answer
                    if(lessThan) {
                        num_guess++;
                        System.out.print("Secret number is greater than " + guess + ". Please enter a higher number to guess correctly: ");
                        int userGuessTwo = scanner.nextInt();

                        // user guess two is less than answer
                        if(userGuessTwo < random_num) {
                            num_guess++;
                            System.out.print("Secret number is greater than " + userGuessTwo + ". Please enter a higher number to guess correctly: ");
                            int userGuessThree = scanner.nextInt();

                            // user guess three is greater than answer
                            if(userGuessThree > random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break;
                            }

                            // user guess three is less than answer
                            else if (userGuessThree < random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break firstGuess;
                            }

                            //  user guess three is the correct answer
                            else {
                                System.out.print("Congratulations, your guess number " + random_num + " is correct.");
                                num_guess = 0;
                                break  ;
                            }
                        }

                        // user guess two is greater than answer============================================================
                        else if (userGuessTwo > random_num) {
                            num_guess++;
                            System.out.print("Secret number is less than " + userGuessTwo + ". Please enter a lower number to guess correctly: ");
                            int userGuessThree = scanner.nextInt();

                            // user guess three is greater than answer
                            if(userGuessThree > random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break;
                            }

                            // user guess three is less than answer
                            else if (userGuessThree < random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break;
                            }

                            //  user guess three is the correct answer
                            else {
                                System.out.print("Congratulations, your guess number " + userGuessThree + " is correct.");
                                num_guess = 0;
                                break  ;
                            }
                        }

                        //// user guess two is the correct  answer=============================================================
                        else {
                            System.out.print("Congratulations, your guess number " + userGuessTwo + " is correct.");
                            num_guess = 0;
                            break  ;
                        }

                    }


                    // user guess one is greater than answer
                    else if(greaterThan) {
                        num_guess++;
                        System.out.print("Secret number is less than " + guess + ". Please enter a lower number to guess correctly: ");
                        int userGuessTwo = scanner.nextInt();

                        // user guess two is less than answer
                        if(userGuessTwo < random_num) {
                            num_guess++;
                            System.out.print("Secret number is greater than " + userGuessTwo + ". Please enter a higher number to guess correctly: ");
                            int userGuessThree = scanner.nextInt();

                            // user guess three is greater than answer
                            if(userGuessThree > random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break;
                            }

                            // user guess three is less than answer
                            else if (userGuessThree < random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break;
                            }

                            //  user guess three is the correct answer
                            else {
                                System.out.print("Congratulations, your guess number " + random_num + " is correct.");
                                num_guess = 0;
                                break  ;
                            }
                        }

                        // user guess two is greater than answer============================================================
                        else if (userGuessTwo > random_num) {
                            num_guess++;
                            System.out.print("Secret number is less than " + userGuessTwo + ". Please enter a lower number to guess correctly: ");
                            int userGuessThree = scanner.nextInt();

                            // user guess three is greater than answer
                            if(userGuessThree > random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break;
                            }

                            // user guess three is less than answer
                            else if (userGuessThree < random_num) {
                                num_guess = num_guess + 2;
                                System.out.print("Sorry you have 3 wrong guesses.");
                                break;
                            }

                            //  user guess three is the correct answer
                            else {
                                System.out.print("Congratulations, your guess number " + userGuessThree + " is correct.");
                                num_guess = 0;
                                break  ;
                            }
                        }

                        //// user guess two is the correct  answer=============================================================
                        else {
                            System.out.print("Congratulations, your guess number " + userGuessTwo + " is correct.");
                            num_guess = 0;
                            break  ;
                        }


                    }
                    // user guess one is correct answer
                    else {
                        System.out.print("Congratulations, for guessing the number " + guess + " on your first trial.");
                        //num_guess = 0;
                        break firstGuess;
                    }



                }

                if(num_guess > 2){
                    System.out.println(" The secret number is " + random_num + ".\nWe wish you luck next time.");
                    random_num = 1+random.nextInt(10);
                }
            }
            /// ===================================begin from here======================================================================================
            else {
                System.out.print("Please enter a number between 1 to 10: ");
                int notValidInput = scanner.nextInt();

                int returning_notValidInput (){
                    int ans = notValidInput;
                    return ans;
                }
            }


        }

        
    }
}