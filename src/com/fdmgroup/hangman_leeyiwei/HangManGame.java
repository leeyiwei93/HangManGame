package com.fdmgroup.hangman_leeyiwei;

public class HangManGame {

	    private String wordToGuess;
	    private StringBuilder guessedWord;
	    private int maxAttempts;
	    private int remainingAttempts;

	    public HangManGame(String wordToGuess, int maxAttempts) {
	        this.wordToGuess = wordToGuess.toUpperCase();
	        this.maxAttempts = maxAttempts;
	        this.remainingAttempts = maxAttempts;
	        this.guessedWord = new StringBuilder("-".repeat(wordToGuess.length()));
	    }

	    //making the guess part of the hangman game
	    public boolean makeGuess(char guess) {
	        boolean guessStatus = false;

	        for (int i = 0; i < wordToGuess.length(); i++) {
	            if (wordToGuess.charAt(i) == guess) {
	                guessedWord.setCharAt(i, guess);
	                guessStatus = true;
	            }
	        }

	        return guessStatus;
	    }

	    public boolean isGameOver() {
	    	if (remainingAttempts <= 0 || guessedWord.indexOf("-") == -1) {
				return true;
			}
	    	return false;
	    }
	    public String getWordToGuess() {
	    	return wordToGuess;
	    }

	    public String getGuessedWord() {
	        return guessedWord.toString();
	    }

	    public int getRemainingAttempts() {
	        return remainingAttempts;
	    }

	    public void decreaseRemainingAttempts() {
	        remainingAttempts--;
	    }
	
	}


