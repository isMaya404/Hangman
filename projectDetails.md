Title: Hangman Game

Leader: Jeremiah Francia
Members: 


I. Introduction:

The Hangman game is a classic word-guessing game where players aim to reveal a hidden word by guessing its letters. In this implementation, the game is designed using object-oriented programming principles and incorporates multiple levels of increasing difficulty. Players have a limited number of incorrect guesses and a shared pool of hints that they can use throughout the game. The game challenges players' vocabulary and deductive skills while offering a structured and fun experience.

II. Objective:

The objective of this project is to create a simple Hangman game in Java using OOP principles such as encapsulation and abstraction. The game consists of:

1.    Multiple levels of increasing difficulty.
2.    A global hints pool shared across levels.
3.    A user-friendly interface with color-coded feedback.
4.    The ability to reset to level 1 upon game over, ensuring replayability.


III. Flowchart:

--------------------------------
|  Legend: Name (Shape - Type) |
--------------------------------




                   Start (Oval - Start/End)
                             |
             Initialize Game (Rectangle - Process)
                             |
          Level Loop Begins (Parallelogram - Input/Output)
                             |
        +--------------------+--------------------+
        |                                         |
  Level Exists? (Diamond - Decision)        End (You Win!) (Oval - Start/End)
        |
        v
  Start Level (Rectangle - Process)
        |
        |
  Gameplay Loop Begins (Parallelogram - Input/Output)
        |
        |
        +--------------------+-------------------------------------------------------------------+
        |                                                                                        |
        |                                                                                        |
Word Guessed or Max Attempts Reached? (Diamond - Decision)                      Continue Gameplay (Rectangle - Process)
        |                                                                                        |
        |                                                                                        |
        +--------------------+                                            Input Letter or Hint (Parallelogram - Input/Output)
        |                    |                                                                   |
  Word Guessed? (Diamond - Decision)                                          Max Attempts Reached? (Diamond - Decision)  
        |                    |                                                                   |
        |                    |                                                                   |
   Congratulations (Rectangle - Process)                                           Game Over (Rectangle - Process)
        |                    |                                                                   |
        |                    |                                                                   |
     Next Level (Rectangle - Process)                                           Reset to Level 1 (Rectangle - Process)  
                             |
                             |
                             |
                     +---------------------------------------------------+
                     |                                                   |
               Valid Input (Diamond - Decision)           Invalid Input (Rectangle - Process)
                     |
                     |
                     |
         +-----------+-------------------------------------------------------------------------+
         |                                                                                     |
    Hint Requested (Rectangle - Process)                                      Letter Guessed (Rectangle - Process)
         |                                                                                     |
    Show Hint (Rectangle - Process)                                            Correct or Wrong (Diamond - Decision)
         |                                                                                     |
    Update Display (Rectangle - Process)                                        Update Display (Rectangle - Process)
                                  |
                                  |
                                  |
                         +--------+----------------------------------------------+
                         |                                                       |
              Word Guessed? (Diamond - Decision)              Max Attempts Reached? (Diamond - Decision)
                         |                                                       |
                Next Level (Rectangle - Process)                Reset to Level 1 (Rectangle - Process)



IV. Setup

compile and run with:

bash
```
javac -d out *.java
java -cp out HangmanGame 


```

note: must have java compiler properly setup

