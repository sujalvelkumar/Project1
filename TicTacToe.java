package src.MyPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Game{
	
	//Display the Board to user
	static void DisplayBoard(char board[][])
	{
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	//Make changes to Board according to the input
	static void insert(int pos, char board[][], char ch)
	{
		if(ch=='X')
			TicTacToe.allUserPos.add(pos);
		else
			TicTacToe.allCpuPos.add(pos);
		
		switch(pos)
		{
			case 1: board[0][0]= ch;
					break;
			case 2: board[0][2]=ch;
					break;
			case 3: board[0][4]=ch;
					break;
			case 4: board[2][0]=ch;
					break;
			case 5: board[2][2]=ch;
					break;
			case 6: board[2][4]=ch;
					break;
			case 7: board[4][0]=ch;
					break;
			case 8: board[4][2]=ch;
					break;
			case 9: board[4][4]=ch;
					break;
			
		}
				
	}
	//check if there is a winner or game is draw
	static void checkWinner(int num)
	{
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List diag1 = Arrays.asList(1,5,9);
		List diag2 = Arrays.asList(3,5,7);
		
		List<List> winCon=new ArrayList<List>();
		winCon.add(topRow);
		winCon.add(midRow);
		winCon.add(botRow);
		winCon.add(leftCol);
		winCon.add(midCol);
		winCon.add(rightCol);
		winCon.add(diag1);
		winCon.add(diag2);
		
		for(List l : winCon)
		{
			if(TicTacToe.allUserPos.containsAll(l))
			{
				if(num == 1)
					System.out.println("User is Winner");
				else
					System.out.println("user1 is winner");
				System.exit(0);
			}
			else if(TicTacToe.allCpuPos.containsAll(l))
			{
				if(num == 1)
					System.out.println("CPU is Winner");
				else 
					System.out.println("User2 is winner");
				System.exit(0);
			}			
		}
		if(TicTacToe.allUserPos.size() + TicTacToe.allCpuPos.size() == 9)
		{
			System.out.println("Its a Draw");
			System.exit(0);
		}
		
	}
	
}
public class TicTacToe {
	
	static  ArrayList allUserPos = new ArrayList (); 
	static  ArrayList allCpuPos = new ArrayList ();
	
	public static void main(String[] args) {
		
		//		Input Variable
		char[][]board = { {' ','|',' ','|',' '},
						  {'-','+','-','+','-'},
						  {' ','|',' ','|',' '},
						  {'-','+','-','+','-'},
						  {' ','|',' ','|',' '}
						};	
		
		int cpuPos = 0;
		Scanner sc = new Scanner(System.in);
		Game.DisplayBoard(board);
		
		System.out.println("**************TicTacToe**************");
		System.out.println("Enter : 1. to play with CPU");
		System.out.println("Enter : 2 to play with other user");
		int choice= sc.nextInt();
		
		
		while((allUserPos.size()+ allCpuPos.size()) < 9)
		{
			System.out.println("All User Pos Size" +allUserPos.size());
			System.out.println("All Cpu Pos Size" +allCpuPos.size());
			
			//Get Input from User.
			System.out.println("Enter the position you want place your x from 1 to 9");
			int userPos= sc.nextInt();
			while(allUserPos.contains(userPos) || allCpuPos.contains(userPos))
			{
				System.out.println("Pos already Taken");
				userPos = sc.nextInt();
			}
			Game.insert(userPos, board, 'X');
			Game.DisplayBoard(board);
			System.out.println(allUserPos);
			Game.checkWinner(choice);
			
			//Get Input from CPU
				if(choice == 1)
				{
					Random r = new Random();
					cpuPos= r.nextInt(9) +1;
					while(allUserPos.contains(cpuPos) || allCpuPos.contains(cpuPos))
					{
						System.out.println("Pos already Taken");
						cpuPos = r.nextInt(9) +1;
					}
				}
				//Input from User2
				else if(choice ==2)
				{
					System.out.println("Enter the position you want place your x from 1 to 9");
					cpuPos= sc.nextInt();
					while(allUserPos.contains(cpuPos) || allCpuPos.contains(cpuPos))
					{
						System.out.println("Pos already Taken");
						cpuPos = sc.nextInt();
					}
				}
				System.out.println(cpuPos);
				
				Game.insert(cpuPos, board, 'O');
				Game.DisplayBoard(board);
				System.out.println(allCpuPos);
				Game.checkWinner(choice);
		}
	}

}
