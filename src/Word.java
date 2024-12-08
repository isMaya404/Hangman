package src;

import java.util.Random;

public class Word {
  private String word;
  private StringBuilder displayWord;
  private int hintsUsed;

  public Word(String word) {
    this.word = word;
    this.displayWord = new StringBuilder("_".repeat(word.length()));
    this.hintsUsed = 0; // Initialize hints used to 0
  }

  public String getWord() {
    return word;
  }

  public String getDisplayWord() {
    return displayWord.toString();
  }

  public boolean isGuessed() {
    return !displayWord.toString().contains("_");
  }

  public boolean revealLetter(char letter) {
    boolean found = false;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == letter && displayWord.charAt(i) == '_') {
        displayWord.setCharAt(i, letter);
        found = true;
      }
    }
    return found;
  }

  public char revealHint() {
    if (hintsUsed >= 3) {
      System.out.println("No hints left!");
      return ' ';
    }

    Random random = new Random();
    while (true) {
      int index = random.nextInt(word.length());
      if (displayWord.charAt(index) == '_') {
        char hint = word.charAt(index);
        revealLetter(hint); // Reveal the hint in the word
        hintsUsed++; // Increment hints used
        return hint;
      }
    }
  }

  public int getHintsUsed() {
    return hintsUsed;
  }
}
