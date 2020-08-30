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
		
		switch(menu1) {
			case "1" :
				while(game == true) {
				System.out.println(" ----------- ");
				System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
				System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
				System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
				System.out.println(" ----------- ");
				String tokenChoice = user.nextLine();
				int token = Integer.parseInt(tokenChoice);
				gameBoard.set(token, "X");
				System.out.println(" -------- ");
				System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
				System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
				System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
				System.out.println(" -------- ");
				break;
				}
			case "2" : 
				System.out.println("Thank you for playing!");
				break;
		}
//		while(game == true) {
//			System.out.println(" -------- ");
//			System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
//			System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
//			System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
//			System.out.println(" -------- ");
//		}
	}
}
