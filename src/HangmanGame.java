package src;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
  private ArrayList<String> wordList;
  private Scanner scanner;
  private int totalHints = 5; // Shared hints for the entire game

  public HangmanGame() {
    wordList = new ArrayList<>();
    scanner = new Scanner(System.in);
    populateWords();
  }

  private void populateWords() {
    wordList.add("java");
    wordList.add("object");
    wordList.add("inheritance");
    wordList.add("polymorphism");
    wordList.add("encapsulation");
    wordList.add("abstraction");
  }

  private boolean playLevel(int level, String wordToGuess) {
    Word word = new Word(wordToGuess);
    int wrongAttempts = 0;
    int maxAttempts = 6;

    System.out.println("\033[34m--- Level " + level + " ---\033[0m");
    System.out.println("The word to guess has " + wordToGuess.length() + " letters.");
    System.out.println("Current word: " + word.getDisplayWord());
    System.out.println("");

    while (!word.isGuessed() && wrongAttempts < maxAttempts) {
      System.out.println("\033[34mWrong attempts: " + wrongAttempts + "/" + maxAttempts + "\033[0m");
      System.out.println("\033[34mHints available: " + totalHints + "/5\033[0m\n");
      System.out.print("Guess a letter or type 'hint' for a hint: ");
      String input = scanner.nextLine().trim().toLowerCase();

      if (input.equals("hint")) {
        if (totalHints > 0) {
          char hint = word.revealHint();
          totalHints--;
          System.out.println("\033[34mHint: The letter '" + hint + "' is in the word.\033[0m");
        } else {
          System.out.println("\033[31mNo hints left!\033[0m");
        }
      } else if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
        char guess = input.charAt(0);
        if (word.revealLetter(guess)) {
          System.out.println("\033[32m\nGood guess!\033[0m\n");
        } else {
          System.out.println("\033[31mWrong guess!\033[0m");
          wrongAttempts++;
        }
      } else {
        System.out.println("\033[31m\nInvalid input. Please enter a single letter or 'hint'.\033[0m\n");
      }

      System.out.println("Current word: " + word.getDisplayWord());
    }

    if (word.isGuessed()) {
      System.out.println("\033[32mCongratulations! You guessed the word: " + wordToGuess + "\033[0m\n");
      return true; // Player passed the level
    } else {
      System.out.println("\033[31mGame over! The word was: " + wordToGuess + "\033[0m");
      return false; // Player failed the level
    }
  }

  public void startGame() {
    boolean wonGame = true;

    for (int level = 1; level <= wordList.size(); level++) {
      String wordToGuess = wordList.get(level - 1);
      if (!playLevel(level, wordToGuess)) {
        wonGame = false;
        break; // End the game if the player fails any level
      }

      // Notify about remaining hints
      if (totalHints == 0 && level != wordList.size()) {
        System.out.println("\033[34mYou have no hints left for the remaining levels!\033[0m");
      }
    }

    if (wonGame) {
      System.out.println("\033[32mHooray! you completed all levels!\033[0m");
    }
  }

  public static void main(String[] args) {
    HangmanGame game = new HangmanGame();
    game.startGame();
  }
}
