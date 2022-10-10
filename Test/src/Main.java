//make a hangman game with 4 answers
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] answers = {"apple", "banana", "orange", "grape"};
        String answer = answers[rand.nextInt(answers.length)];
        String[] answerArray = answer.split("");
        String[] guessArray = new String[answerArray.length];
        for (int i = 0; i < answerArray.length; i++) {
            guessArray[i] = "_";
        }
        int guessCount = 0;
        int guessLimit = 5;
        boolean outOfGuesses = false;
        while (!outOfGuesses) {
            System.out.println("Guess a letter");
            String guess = input.next();
            for (int i = 0; i < answerArray.length; i++) {
                if (guess.equals(answerArray[i])) {
                    guessArray[i] = guess;
                }
            }
            guessCount++;
            if (guessCount >= guessLimit) {
                outOfGuesses = true;
            }
            for (int i = 0; i < guessArray.length; i++) {
                System.out.print(guessArray[i]);
            }
            System.out.println();
        }
        if (outOfGuesses) {
            System.out.println("You lose");
        } else {
            System.out.println("You win");
        }
    }
}