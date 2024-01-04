package com.ticTacToe;

import java.util.Scanner;

//Main class for launching the game
public class LaunchGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Create a TicTacToe game instance
		TicTacToe t = new TicTacToe();
		
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		
		HumanPlayer p1 = new HumanPlayer(name, 'X');  // Create a human player
		AIPlayer p2 = new AIPlayer("AI", 'O');  // Create an AI player
		
		Player cp;
		cp = p1;  // Set the current player to player 1
		
		
		// Game loop
		while(true) {
			System.out.println(cp.name + " turn");
			cp.makeMove();  // Current player makes a move
			TicTacToe.displayBoard();  // Display the updated board
			
			// Check win or draw conditions
			if(TicTacToe.checkColWin() || TicTacToe.checkDiagWin() || TicTacToe.checkRowWin()) {
				System.out.println(cp.name + " has Won");
				break;
			}else if(TicTacToe.checkDraw()) {
				System.out.println("Game Draw");
				break;
			}else {
				// Switch to the other player for the next turn
				if(cp == p1) {
					cp = p2;
				}else {
					cp = p1;
				}
			}
		}
	}
}