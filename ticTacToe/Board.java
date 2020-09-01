package ticTacToe;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Board {
	public static void main(String[] args) {
			
		Scanner user = new Scanner(System.in);
		CpuPlayer cpu1 = new CpuPlayer();
		
		int upperBound = 8;
		
		cpu1.losingSpace1 = 0;
		cpu1.losingSpace2 = 0;
		cpu1.losingSpace3 = 0;
		
		boolean game = true;
		boolean win = false;
		boolean player = true;
		String playerToken = "X";
		
		ArrayList<CpuPlayer> gameList = new ArrayList();
		ArrayList gameBoard = new ArrayList(6);
		
		for(int i = 0; i < 9; i++) {
			gameBoard.add(i);
			gameBoard.set(i, i);
		}
		
		System.out.println(" ----------- ");
		System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
		System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
		System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
		System.out.println(" ----------- ");
		
		
		System.out.println("Welcome to TicTacToe! Type 1 to start a game or 2 to exit.");
		
		String menu1 = user.nextLine();
		
		
		switch(menu1) {
			case "1" :
				while(game == true) {
					System.out.println(" ----------- ");
					System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
					System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
					System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
					System.out.println(" ----------- ");
					if (win == true) {
						System.out.println(playerToken + " Wins!");
						for(int i = 0; i < 9; i++) {
							gameBoard.add(i);
							gameBoard.set(i, i);
						}
						player = true;
					}
					if (player == true) {
						System.out.println("Player1 turn");
						playerToken = "X";
						String squareChoice = user.nextLine();
						int token = Integer.parseInt(squareChoice);
						if (gameBoard.get(token) == "X" || gameBoard.get(token) == "O") {
							System.out.println("Space already taken");
						} else {
							gameBoard.set(token, "X");
							player = false;		
						}
					} else if (player == false) {
						System.out.println("Player2 turn");
						playerToken = "O";
						Random rand = new Random();
//						String squareChoice = user.nextLine();
						int token = rand.nextInt(upperBound);
						if (gameBoard.get(token) == "X" || gameBoard.get(token) == "O") {
							System.out.println("Space already taken");
						} else {
							gameBoard.set(token, "O");
							player = true;		
						}
					}
					if(gameBoard.get(0) == playerToken && gameBoard.get(1) == playerToken && gameBoard.get(2) == playerToken) {
						win = true;
					} else if(gameBoard.get(0) == playerToken && gameBoard.get(3) == playerToken && gameBoard.get(6) == playerToken) {
						win = true;						
					} else if(gameBoard.get(0) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(8) == playerToken) {
						win = true;						
					} else if(gameBoard.get(1) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(7) == playerToken) {
						win = true;
					} else if(gameBoard.get(2) == playerToken && gameBoard.get(5) == playerToken && gameBoard.get(8) == playerToken) {
						win = true;
					} else if(gameBoard.get(2) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(6) == playerToken) {
						win = true;
					} else if(gameBoard.get(0) == playerToken && gameBoard.get(3) == playerToken && gameBoard.get(6) == playerToken) {
						win = true;
					} else if(gameBoard.get(3) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(5) == playerToken) {
						win = true;
					} else if(gameBoard.get(6) == playerToken && gameBoard.get(7) == playerToken && gameBoard.get(8) == playerToken) {
						win = true;
					}
				}
			case "2" : 
				System.out.println("Thank you for playing!");
				break;
		}
	}
}
