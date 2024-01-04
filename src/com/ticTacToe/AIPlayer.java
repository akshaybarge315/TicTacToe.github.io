package com.ticTacToe;

import java.util.Random;
import java.util.Scanner;

//AIPlayer class representing an AI player
class AIPlayer extends Player{
	
	// Constructor to initialize the player's name and mark
	AIPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	// Method for the AI player to make a move
	void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		do {
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);
		}while(!isValidMove(row, col));
		
		TicTacToe.placeMark(row, col, mark);
	}
}