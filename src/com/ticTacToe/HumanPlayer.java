package com.ticTacToe;

import java.util.Scanner;

//HumanPlayer class representing a human player
public class HumanPlayer extends Player{

	// Constructor to initialize the player's name and mark
	HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	// Method for the human player to make a move
	void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		
		do {
	        try {
	            System.out.println("Enter the row and column (0-2):");
	            System.out.print("Row: ");
	            row = sc.nextInt();
	            System.out.print("Column: ");
	            col = sc.nextInt();
	            
	            // Check if the input values are within the valid range
	            if (row < 0 || row > 2 || col < 0 || col > 2) {
	                System.out.println("Please enter values between 0 and 2.");
	                continue; // Continue the loop to prompt for input again
	            }
	            
	            // Check if the selected cell is already occupied
	            if (!isValidMove(row, col)) {
	                System.out.println("That cell is already occupied. Choose another.");
	                continue; // Continue the loop to prompt for input again
	            }
	            
	            // If the input values are valid, place the mark on the board
	            TicTacToe.placeMark(row, col, mark);
	            break; // Exit the loop as the move is successfully made
	            
	        } catch (java.util.InputMismatchException e) {
	            // Handle non-integer inputs
	            System.out.println("Please enter valid integer values for row and column.");
	            sc.nextLine(); // Clear the input buffer
	        }
	    } while (true);
	}
}