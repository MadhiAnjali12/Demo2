package com.project;

import java.util.Scanner;

public class Tic_Tac_Toe_Application {

	static char[][] board = new char[3][3];
	static char CurrentPlayer = 'X';
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		getInitialisation();
		while (true) {
			getDisplay();
			player();

			if (checkWin()) {
				getDisplay();
				System.out.println(" Player " + CurrentPlayer + " wins!");
				break;
			}

			if (checkDraw()) {
				getDisplay();
				System.out.println(" It's a draw!");
				break;
			}

			switchPlayer();
		}
	}

	private static void getInitialisation() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}

		}

	}

	private static void getDisplay() {
		System.out.println("---------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.print(" |");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + "|");

			}
			System.out.println();
			System.out.println("-----------");
		}
	}

	private static void player() {
		int row, col;
		while (true) {
			System.out.println("player"+ " " + CurrentPlayer + " " + "enter the row:");
			row = sc.nextInt();
			System.out.println("player" +" "  + CurrentPlayer  + " " +"enter the col:");
			col = sc.nextInt();
			if (isValidMove(row, col)) {
				board[row][col] = CurrentPlayer;
				break;
			} else {
				System.out.println(" Invalid move. Try again!");
			}
		}
	}

	private static boolean isValidMove(int row, int col) {
		return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
	}

	// 5. Check Win
	private static boolean checkWin() {

		// Rows
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == CurrentPlayer && board[i][1] == CurrentPlayer && board[i][2] == CurrentPlayer) {
				return true;
			}
		}

		// Columns
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == CurrentPlayer && board[1][j] == CurrentPlayer && board[2][j] == CurrentPlayer) {
				return true;
			}
		}

		// Diagonal
		if (board[0][0] == CurrentPlayer && board[1][1] == CurrentPlayer && board[2][2] == CurrentPlayer) {
			return true;
		}

		// diagonal
		if (board[0][2] == CurrentPlayer && board[1][1] == CurrentPlayer && board[2][0] == CurrentPlayer) {
			return true;
		}

		return false;
	}

	private static boolean checkDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	private static void switchPlayer() {
		CurrentPlayer = (CurrentPlayer == 'X') ? 'O' : 'X';
	}

}
