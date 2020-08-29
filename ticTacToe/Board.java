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
		}
		
		gameBoard.set(0, "X");
		gameBoard.set(5, "O");
		
		System.out.print(gameBoard.get(0));
		
		boolean game = true;
		
		while(game == true) {
			
		}
	}
}
