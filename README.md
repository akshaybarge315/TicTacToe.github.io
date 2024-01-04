# Tic Tac Toe Game in Java

This repository contains a simple implementation of the classic Tic Tac Toe game in Java.

## How to Play

1. **Game Board:**
   - The game board is a 3x3 grid.
   - Player 1 ('X') competes against an AI opponent ('O').

2. **Gameplay:**
   - Players take turns to place their marks on the board by entering row and column numbers (0-2).
   - Input format: Row number (0-2) followed by column number (0-2).
   - The game alternates between human (Player 1) and AI (Player 2) turns.
   - The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins.
   - If the board fills without a winner, the game ends in a draw.

## How to Run

1. **Compile:**
   - Compile all `.java` files (`TicTacToe.java`, `Player.java`, `HumanPlayer.java`, `AIPlayer.java`, `LaunchGame.java`).

2. **Run the Game:**
   - Execute the `LaunchGame` class.
   - Enter your name.
   - Follow the console prompts to enter your moves.

## Additional Information

- **Error Handling:** The game handles invalid inputs and prevents moves in occupied cells.
- **AI Behavior:** The AI player selects random valid moves during its turn.
- **Code Structure:** The code is organized into separate classes for the game logic, players, and the main launcher.
