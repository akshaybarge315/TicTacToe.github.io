package com.ticTacToe;

//The TicTacToe class represents the game board and contains methods for managing the game.
public class TicTacToe{
	
	static char[][] board; // Represents the game board as a 3x3 grid
	
	// Constructor for initializing the game board
	public TicTacToe() {
		board = new char[3][3]; // Create a 3x3 grid
		initBoard(); // Initialize the board with empty spaces
	}
	
	// Method to initialize the board with empty spaces
	void initBoard() {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = ' ';  // Set each cell to an empty space
			}
		}
	}
	
	// Method to display the current state of the game board
	static void displayBoard() {
		System.out.println("-------------");
		for(int i=0; i<board.length; i++) {
			System.out.print("| ");
			for(int j=0; j<board[i].length; j++) {
				System.out.print(board[i][j] + " | ");  // Print each cell value
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	// Method to place a mark (X or O) on the board at a specified position
	static void placeMark(int row, int col, char mark) {
		if(row >= 0 && row < 3 && col >= 0 && row < 3) {
			board[row][col] = mark;  // Set the specified cell with the given mark
		}
	}
	
	
	// Methods for checking win conditions
	
	// Check if any row has the same mark and is not empty
	static boolean checkRowWin() {
		for(int j=0; j<3; j++) {
			if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true;
			}
		}
		return false;
	}
	
	// Check if any column has the same mark and is not empty
	static boolean checkColWin() {
		for(int i=0; i<3; i++) {
			if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;
	}
	
	// Check if any diagonal has the same mark and is not empty
	static boolean checkDiagWin() {
		if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return true;
		}
		return false;
	}
	
	// Check if the game is a draw
	static boolean checkDraw() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}
