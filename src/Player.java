package src;

public class Player {
  private String name;
  private int wrongAttempts;

  // Constructor initializes player's name and attempts
  public Player(String name) {
    this.name = name;
    this.wrongAttempts = 0;
  }

  // Method to increase wrong attempts
  public void increaseWrongAttempts() {
    wrongAttempts++;
  }

  // Method to get the current number of wrong attempts
  public int getWrongAttempts() {
    return wrongAttempts;
  }

  // Method to get the player's name
  public String getName() {
    return name;
  }

  // Method to check if the player has lost (too many wrong attempts)
  public boolean hasLost() {
    return wrongAttempts >= 6; // Max wrong attempts allowed is 6
  }

  // Reset wrong attempts at the beginning of each level
  public void resetWrongAttempts() {
    wrongAttempts = 0;
  }
}
