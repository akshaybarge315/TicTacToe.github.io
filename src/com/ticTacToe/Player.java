package com.ticTacToe;

//Abstract Player class representing a player in the game
public abstract class Player{
	String name;  // Player's name
	char mark;  // Player's mark (X or O)
	
	abstract void makeMove();  // Abstract method for making a move
	
	// Method to check if a move is valid in the current board configuration
	boolean isValidMove(int row, int col) {
		if(row >= 0 && row < 3 && col >= 0 && col < 3) {
			if(TicTacToe.board[row][col] == ' ') {
				return true;  // Valid move if the cell is empty
			}
		}
		return false;  // Invalid move
	}	
}
