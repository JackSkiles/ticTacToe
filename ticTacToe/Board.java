package ticTacToe;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	public static void main(String[] args) {
			
		Scanner user = new Scanner(System.in);
		
		ArrayList<CpuPlayer> gameList = new ArrayList();
		ArrayList gameBoard = new ArrayList(6);
		
		for(int i = 0; i < 9; i++) {
			gameBoard.add(i);
			gameBoard.set(i, " ");
		}
		
		
		System.out.println(" ----------- ");
		System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
		System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
		System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
		System.out.println(" ----------- ");
		
		boolean game = true;
		
		System.out.println("Welcome to TicTacToe! Type 1 to start a game or 2 to exit.");
		
		String menu1 = user.nextLine();
		
		boolean player = true;
		String playerToken = "X";
		
		switch(menu1) {
			case "1" :
				while(game == true) {
					System.out.println(" ----------- ");
					System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
					System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
					System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
					System.out.println(" ----------- ");
					if (player == true) {
						System.out.println("Player1 turn");
						playerToken = "X";
						String squareChoice = user.nextLine();
						int token = Integer.parseInt(squareChoice);
						gameBoard.set(token, "X");
						player = false;
					} else if (player == false) {
						System.out.println("Player2 turn");
						playerToken = "O";
						String squareChoice = user.nextLine();
						int token = Integer.parseInt(squareChoice);
						gameBoard.set(token, "O");
						player = true;
					}
					if(gameBoard.get(0) == playerToken && gameBoard.get(1) == playerToken && gameBoard.get(2) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(0) == playerToken && gameBoard.get(3) == playerToken && gameBoard.get(6) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(0) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(8) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(1) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(7) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(2) == playerToken && gameBoard.get(5) == playerToken && gameBoard.get(8) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(2) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(6) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(0) == playerToken && gameBoard.get(3) == playerToken && gameBoard.get(6) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(3) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(5) == playerToken) {
						System.out.println("X wins");
						break;
					} else if(gameBoard.get(6) == playerToken && gameBoard.get(7) == playerToken && gameBoard.get(8) == playerToken) {
						System.out.println("X wins");
						break;
					}

				}
			case "2" : 
				System.out.println("Thank you for playing!");
				break;
		}
		System.out.println(" ----------- ");
		System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
		System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
		System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
		System.out.println(" ----------- ");
//		while(game == true) {
//			System.out.println(" -------- ");
//			System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
//			System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
//			System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
//			System.out.println(" -------- ");
//		}
	}
}
