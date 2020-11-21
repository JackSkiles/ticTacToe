package ticTacToe;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainBoard implements ActionListener{
	
	JFrame frame;
	JTextField textField;
	ImageIcon image1;
	ImageIcon image2;
	JButton button;
	JLabel label;
	String move = "";
	
	public MainBoard() {
		
		textField = new JTextField(3);
		textField.setText("Choose you space number");
		textField.addActionListener(this);
		JButton button = new JButton("Submit");
		button.addActionListener(this);
		JFrame frame = new JFrame("Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
//	frame.setLayout(new FlowLayout());
		JPanel mainBoard = new JPanel(new BorderLayout());
		mainBoard.setBounds(50,50,500,500);	
	
		Scanner user = new Scanner(System.in);
		CpuPlayer cpu1 = new CpuPlayer();

		int upperBound = 8;
		
		cpu1.firstMove = 0;
		cpu1.secondMove = 0;
		cpu1.thirdMove = 0;
		cpu1.losingSpace1 = 0;
		cpu1.losingSpace2 = 0;
		cpu1.losingSpace3 = 0;
		
		String winningCombo1 = "012";
		String winningCombo2 = "036";
		String winningCombo3 = "048";
		String winningCombo4 = "147";
		String winningCombo5 = "258";
		String winningCombo6 = "246";
		String winningCombo7 = "036";
		String winningCombo8 = "345";
		String winningCombo9 = "678";
		
		boolean game = true;
		boolean win = false;
		boolean player = true;
		boolean turn1 = true;
		boolean turn2 = true;
		String playerToken = "X";
		
		ArrayList<CpuPlayer> gameList = new ArrayList();
		ArrayList gameBoard = new ArrayList();
		ArrayList winningMove = new ArrayList();
		
		winningMove.add(winningCombo1);
		winningMove.add(winningCombo2);
		winningMove.add(winningCombo3);
		winningMove.add(winningCombo4);
		winningMove.add(winningCombo5);
		winningMove.add(winningCombo6);
		winningMove.add(winningCombo7);
		winningMove.add(winningCombo8);
		winningMove.add(winningCombo9);
		
		System.out.println(winningMove);
		
		for(int i = 0; i < 9; i++) {
			gameBoard.add(i);
			gameBoard.set(i, i);
		}
		
		System.out.println(" ----------- ");
		JTextArea boardTop = new JTextArea(" ----------- \n"
		+ "| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |\n"
		+ "| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |\n"
		+ "| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |\n"
		+ " ----------- ");
		mainBoard.add(boardTop, BorderLayout.PAGE_START);
//		mainBoard.add(main);
		mainBoard.add(textField, BorderLayout.CENTER);
		mainBoard.add(button, BorderLayout.PAGE_END);
		frame.add(mainBoard);
		frame.setVisible(true);

		System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
		System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
		System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
		System.out.println(" ----------- ");
		
		
		System.out.println("Welcome to TicTacToe! Type 1 to start a game or 2 to exit.");
		
		String menu1 = user.nextLine();
		
		switch(menu1) {
			case "1" :
				while(game == true) {
					boardTop.setText(" ----------- \n"
							+ "| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |\n"
							+ "| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |\n"
							+ "| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |\n"
							+ " ----------- ");
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
						// Random rand = new Random();
//						String squareChoice = user.nextLine();
						// int token = rand.nextInt(upperBound);
						for(int i = 0; i < 9; i++) {
							if (player == true) {
								break;
							} else if (gameBoard.get(i) == "X" || gameBoard.get(i) == "O") {
								System.out.println("Space already taken");
							} else if(turn1 = true) {
								cpu1.firstMove = 0;
								gameBoard.set(i, "O");
								turn1 = false;
								player = true;
							} else if(turn2 = true) {
								cpu1.secondMove = i;
								if((cpu1.firstMove + 1) == cpu1.secondMove || (cpu1.firstMove + 4) == cpu1.secondMove || (cpu1.firstMove + 3) == cpu1.secondMove || (cpu1.firstMove + 8) == cpu1.secondMove){
									gameBoard.set(i, "O");
									player = true;
								} else {
									break;
								}						
							}
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
	
	public void actionPerformed(ActionEvent e) {
		move = textField.getText();
		System.out.println("Hello");
		
	}
}
