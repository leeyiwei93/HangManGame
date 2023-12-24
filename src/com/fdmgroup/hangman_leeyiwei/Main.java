package com.fdmgroup.hangman_leeyiwei;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		//Variables
		String[] words = {"COMPUTER", "CHICKEN", "INCOMPREHENSIBILITIES", "CURSED", "INTERNET", "JAVA"};
		String wordToGuess = words[(int)(Math.random()*words.length)];
        int maxAttempts = 8;
        
        //Creating new objects
        HangManGame hangmanGame = new HangManGame(wordToGuess, maxAttempts);
        Scanner playerInput= new Scanner(System.in);
        
        //Start of game
        System.out.println("Welcome to Hangman!");
        
        while (hangmanGame.isGameOver() == false) {
            HangManMessage.displayWordState(hangmanGame);
            
            HangManMessage.displayNumberOfGuess(hangmanGame.getRemainingAttempts());
            
            System.out.print("Enter a letter: ");
            char guess = playerInput.next().toUpperCase().charAt(0);

            if (hangmanGame.makeGuess(guess) == false) {
                HangManMessage.displayIncorrectGuess(guess);
                hangmanGame.decreaseRemainingAttempts();
            }else {
				HangManMessage.displayCorrectGuess();
			}
        }

        HangManMessage.displayResult(hangmanGame);
        playerInput.close();
    }
}