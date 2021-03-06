package ticTacToe;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MainBoard implements ActionListener{
	
	JFrame frame;
	JTextField textField;
	ImageIcon image1;
	ImageIcon image2;
	JButton button;
	JLabel label;
	String move = "";
	boolean playerTurn = false;
	
	
	public MainBoard() {
		
	
		textField = new JTextField(3);
		
//		textField.setText("Choose you space number");
		textField.addActionListener(this);
		JButton button = new JButton("Submit");
		button.addActionListener(this);
		JFrame frame = new JFrame("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLayout(new FlowLayout());
		frame.setResizable(false);
//		JLabel O = new JLabel();
//		O.setBounds(395,395,200,200);
		Icon OImg = new ImageIcon(this.getClass().getResource("/o.png"));
		Icon XImg = new ImageIcon(this.getClass().getResource("/x.png"));
//	frame.setLayout(new FlowLayout());
		JPanel mainBoard = new JPanel(new BorderLayout());
		mainBoard.setBounds(150,550,300,50);	
	
		Scanner user = new Scanner(System.in);
		CpuPlayer cpu1 = new CpuPlayer();

		int upperBound = 8;
	    frame.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/background.png"))));
		String menu1 = JOptionPane.showInputDialog(
				
				null,
				"Enter 1 to play, or 2 to exit: ",
				"TicTacToe",
				JOptionPane.PLAIN_MESSAGE
				
				
				);
//		O.setIcon(OImg);
//		frame.add(O);
		frame.pack();
		JLabel winBanner = new JLabel();
		winBanner.setBounds(220,0,200,40);
		winBanner.setFont(new Font("Serif", Font.BOLD, 48));
		winBanner.setForeground(Color.white);
		frame.add(winBanner);
		JLabel FirstImg = new JLabel();
		FirstImg.setBounds(25,25,200,200);
		JLabel SecondImg = new JLabel();
		SecondImg.setBounds(210,25,200,200);
		JLabel ThirdImg = new JLabel();
		ThirdImg.setBounds(395,25,200,200);
		JLabel FourthImg = new JLabel();
		FourthImg.setBounds(25,210,200,200);
		JLabel FithImg = new JLabel();
		FithImg.setBounds(210,210,200,200);
		JLabel SixthImg = new JLabel();
		SixthImg.setBounds(395,210,200,200);
		JLabel SeventhImg = new JLabel();
		SeventhImg.setBounds(25,395,200,200);
		JLabel EigthImg = new JLabel();
		EigthImg.setBounds(210,395,200,200);
		JLabel NinthImg = new JLabel();
		NinthImg.setBounds(395,395,200,200);
//		cpu1.firstMove = 0;
//		cpu1.secondMove = 0;
//		cpu1.thirdMove = 0;
//		cpu1.losingSpace1 = 0;
//		cpu1.losingSpace2 = 0;
//		cpu1.losingSpace3 = 0;
//		
//		String winningCombo1 = "012";
//		String winningCombo2 = "036";
//		String winningCombo3 = "048";
//		String winningCombo4 = "147";
//		String winningCombo5 = "258";
//		String winningCombo6 = "246";
//		String winningCombo7 = "036";
//		String winningCombo8 = "345";
//		String winningCombo9 = "678";
//		
		boolean game = true;
		boolean win = false;
		boolean player = true;
		boolean turn1 = true;
		boolean turn2 = true;
		String playerToken = "X";
		
		ArrayList<CpuPlayer> gameList = new ArrayList();
		ArrayList gameBoard = new ArrayList();
		ArrayList winningMove = new ArrayList();
		
//		winningMove.add(winningCombo1);
//		winningMove.add(winningCombo2);
//		winningMove.add(winningCombo3);
//		winningMove.add(winningCombo4);
//		winningMove.add(winningCombo5);
//		winningMove.add(winningCombo6);
//		winningMove.add(winningCombo7);
//		winningMove.add(winningCombo8);
//		winningMove.add(winningCombo9);
		
		System.out.println(winningMove);
		
		for(int i = 0; i < 9; i++) {
			gameBoard.add(i);
			gameBoard.set(i, i);
		}
		
		System.out.println(" ----------- ");
//		JTextArea boardTop = new JTextArea(" ----------- \n"
//		+ "| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |\n"
//		+ "| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |\n"
//		+ "| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |\n"
//		+ " ----------- ");
//		mainBoard.add(boardTop, BorderLayout.PAGE_START);
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
		
		switch(menu1) {
			case "1" :
				while(game == true) {
					System.out.println(" ----------- ");
					System.out.println("| " + gameBoard.get(0) + " | " + gameBoard.get(1) + " | " + gameBoard.get(2) + " |");
					System.out.println("| " + gameBoard.get(3) + " | " + gameBoard.get(4) + " | " + gameBoard.get(5) + " |");
					System.out.println("| " + gameBoard.get(6) + " | " + gameBoard.get(7) + " | " + gameBoard.get(8) + " |");
					System.out.println(" ----------- ");
					if (win == true) {
						winBanner.setText(playerToken + " Wins!");
						frame.add(winBanner);
						for(int i = 0; i < 9; i++) {
							gameBoard.add(i);
							gameBoard.set(i, i);
						}
						String menu2 = JOptionPane.showInputDialog(
								
								null,
								playerToken + " Wins! \nEnter 1 to play again, 2 to exit: ",
								"TicTacToe",
								JOptionPane.PLAIN_MESSAGE
								
								
								);
						switch(menu2) {
						case "1" :
							win = false;
							player = true;
							frame.remove(FirstImg);
							frame.remove(SecondImg);
							frame.remove(ThirdImg);
							frame.remove(FourthImg);
							frame.remove(FithImg);
							frame.remove(SixthImg);
							frame.remove(SeventhImg);
							frame.remove(EigthImg);
							frame.remove(NinthImg);
							frame.remove(winBanner);
							frame.validate();
							frame.repaint();
							continue;							
						case "2" :
							break;
						}
						if(win == true) {
							break;
						}
					}
					if (player == true && playerTurn == true) {
						try {
							System.out.println("Player1 turn");
							playerToken = "X";
							String squareChoice = move;
							int token = Integer.parseInt(squareChoice);
							if (gameBoard.get(token) == "X" || gameBoard.get(token) == "O") {
								System.out.println("Space already taken");
								textField.setText("");
							} else {
								gameBoard.set(token, "X");
								switch (token) {
								case 0:
									FirstImg.setIcon(XImg);
									frame.add(FirstImg);
									break;
								case 1:
									SecondImg.setIcon(XImg);
									frame.add(SecondImg);
									break;
								case 2:
									ThirdImg.setIcon(XImg);
									frame.add(ThirdImg);
									break;
								case 3:
									FourthImg.setIcon(XImg);
									frame.add(FourthImg);
									break;
								case 4:
									FithImg.setIcon(XImg);
									frame.add(FithImg);
									break;
								case 5:
									SixthImg.setIcon(XImg);
									frame.add(SixthImg);
									break;
								case 6:
									SeventhImg.setIcon(XImg);
									frame.add(SeventhImg);
									break;
								case 7:
									EigthImg.setIcon(XImg);
									frame.add(EigthImg);
									break;
								case 8:
									NinthImg.setIcon(XImg);
									frame.add(NinthImg);
									break;
							}
							frame.repaint();
								player = false;	
								playerTurn = false;
								textField.setText("");
							}
						}
						catch(Exception e) {
							System.out.println("Please enter number");
						}
					} else if (player == true && playerTurn == false) {
						continue;
					} else if (player == false) {
						System.out.println("Player2 turn");
						playerToken = "O";
						Random rand = new Random();
//						String squareChoice = user.nextLine();
						int token = rand.nextInt(upperBound);
						if (gameBoard.get(token) == "X" || gameBoard.get(token) == "O") {
							System.out.println("Space already taken");
						} else if(turn2 = true){
							gameBoard.set(token, "O");
							switch (token) {
								case 0:
									FirstImg.setIcon(OImg);
									frame.add(FirstImg);
									break;
								case 1:
									SecondImg.setIcon(OImg);
									frame.add(SecondImg);
									break;
								case 2:
									ThirdImg.setIcon(OImg);
									frame.add(ThirdImg);
									break;
								case 3:
									FourthImg.setIcon(OImg);
									frame.add(FourthImg);
									break;
								case 4:
									FithImg.setIcon(OImg);
									frame.add(FithImg);
									break;
								case 5:
									SixthImg.setIcon(OImg);
									frame.add(SixthImg);
									break;
								case 6:
									SeventhImg.setIcon(OImg);
									frame.add(SeventhImg);
									break;
								case 7:
									EigthImg.setIcon(OImg);
									frame.add(EigthImg);
									break;
								case 8:
									NinthImg.setIcon(OImg);
									frame.add(NinthImg);
									break;
							}
							player = true;
							frame.repaint();
						} else {
							break;
						}
//						for(int i = 0; i < 9; i++) {
//							if (player == true) {
//								break;
//							} else if (gameBoard.get(i) == "X" || gameBoard.get(i) == "O") {
//								System.out.println("Space already taken");
//							} else if(turn1 = true) {
//								cpu1.firstMove = 0;
//								gameBoard.set(i, "O");
//								turn1 = false;
//								player = true;
//							} else if(turn2 = true) {
//								cpu1.secondMove = i;
//								if((cpu1.firstMove + 1) == cpu1.secondMove || (cpu1.firstMove + 4) == cpu1.secondMove || (cpu1.firstMove + 3) == cpu1.secondMove || (cpu1.firstMove + 8) == cpu1.secondMove){
//									gameBoard.set(i, "O");
//									player = true;
//								} else {
//									break;
//								}						
//							}
//						}
						
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
					} else if(gameBoard.get(0) == playerToken && gameBoard.get(3) == playerToken && gameBoard.get(6) == playerToken &&
							gameBoard.get(0) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(8) == playerToken &&
							gameBoard.get(1) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(7) == playerToken &&
							gameBoard.get(2) == playerToken && gameBoard.get(5) == playerToken && gameBoard.get(8) == playerToken &&
							gameBoard.get(2) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(6) == playerToken &&
							gameBoard.get(0) == playerToken && gameBoard.get(3) == playerToken && gameBoard.get(6) == playerToken &&
							gameBoard.get(3) == playerToken && gameBoard.get(4) == playerToken && gameBoard.get(5) == playerToken &&
							gameBoard.get(6) == playerToken && gameBoard.get(7) == playerToken && gameBoard.get(8) == playerToken
							) {
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
			playerTurn = true;
			System.out.println("Hello");			
	}
}
