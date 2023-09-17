package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {


        // Array
        String[] words = {"programming", "java", "hangman", "computer", "array", "loop"};
        String wordToGuess;
        Scanner scanner = new Scanner(System.in);
        boolean alreadyPlayed = false;
        do {

            if (alreadyPlayed) {
                System.out.println("Do you want to play again? (y/n)");
                char answer = scanner.next().charAt(0);
                if (answer == 'n') {
                    scanner.close();
                    break;
                }
            }

            // get word from array
            wordToGuess = getRandomWord(words);
            playGame(wordToGuess, scanner);
            alreadyPlayed = true;

        } while (true);

    }

    public static String getRandomWord(String[] words) {
        //0.01 to 0.99
        int randomIndex = (int) (Math.random() * words.length);
//        randomIndex = 1;
        return words[randomIndex];
    }

    public static void playGame(String wordToGuess, Scanner scanner) {

        // Create a char array to track the guessed characters
        char[] guessedCharacters = new char[wordToGuess.length()];
        for (int i = 0; i < guessedCharacters.length; i++) {
            guessedCharacters[i] = '_';
        }

        int attemptsLeft = 6;
        boolean isGameOver = false;

        while (isGameOver == false) {
            System.out.println("\nAttempts Left: " + attemptsLeft);
            System.out.println("Word: " + new String(guessedCharacters));
            System.out.print("Enter a character: ");
            char guess = scanner.next().charAt(0);

            boolean isGuessCorrect = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedCharacters[i] = guess;
                    isGuessCorrect = true;
                }
            }

            if (!isGuessCorrect) {
                attemptsLeft--;
            }

            if (attemptsLeft == 0 || new String(guessedCharacters).equals(wordToGuess)) {
                isGameOver = true;
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("\nGame Over! The word was: " + wordToGuess);
        } else {
            System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
        }

    }
}

