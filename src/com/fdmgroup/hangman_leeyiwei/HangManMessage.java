package com.fdmgroup.hangman_leeyiwei;

public class HangManMessage {
	//display current status of the word
	public static void displayWordState(HangManGame hangmanGame) {
        System.out.println("The word now looks like this: " + hangmanGame.getGuessedWord());
    }
	
    //check win or lose conditions
    public static void displayResult(HangManGame hangmanGame) {
        if (hangmanGame.getGuessedWord().indexOf("-") == -1) {
            System.out.println("You guessed the word: " + hangmanGame.getGuessedWord());
            System.out.println("You win.");
        } else {
        	System.out.println("You're completely hung.");
            System.out.println("The word was: " + hangmanGame.getWordToGuess());
            System.out.println("You lose.");
        }
    }
    
    public static void displayNumberOfGuess(int remainingAttempts) {
    	if (remainingAttempts > 1) {
    		System.out.println("You have " + remainingAttempts + " guesses left.");
		}else {
			System.out.println("You have only one guess left.");
		}
    }

    public static void displayIncorrectGuess(char guess) {
        System.out.println("There are no " + guess + "'s in the word.");
    }
    
    public static void displayCorrectGuess() {
        System.out.println("That guess is correct.");
    }
    
}
