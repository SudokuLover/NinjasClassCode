package lect24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class VerticalOrder {
	static Scanner s = new Scanner(System.in);

	final static int player1Symbol = 1;
	final static int player2Symbol = 2;

	public static void main(String[] args) {
		OthelloBoard b = new OthelloBoard();
		int n = s.nextInt();
		boolean p1Turn = true;
		while(n > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			boolean ans = false;
			if(p1Turn) {
				ans = b.move(player1Symbol, x, y);
			}
			else {
				ans = b.move(player2Symbol, x, y);
			}
			if(ans) {
				b.print();
				p1Turn = !p1Turn;
				n--;
			}
			else {
				System.out.println(ans);
			}
		}
	}
}





class OthelloBoard {

	private int board[][];
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;

	public OthelloBoard() {
		board = new int[8][8];
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;
	}

	public void print() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean move(int symbol, int x, int y){
	
		int opposite = symbol==1?2:1;
		boolean b= check(symbol,x,y,opposite);
		
		if(b)
		{
			board[x][y]=symbol;
		}
		return b;
	}
	public boolean check(int symbol, int x, int y,int opposite){
	
		boolean b=false;
		boolean flag=false;
		for(int i=x+1;i<8;i++)
		{
			if(board[i][y]==symbol)
			{
				b= true;
				break;
			}
			if(board[i][y]==' ')
			{
				b= false;
				break;
			}
		
		}
		if(b)
		{
			flag=true;
			for(int i=x+1;i<8;i++)
			{
				if(board[i][y]==symbol)
					{
						b= false;
						break;
					}
				else{
					board[i][y]=symbol;
				}
			}
		}
		for(int i=x-1;i>=0;i--)
		{
			if(board[i][y]==symbol)
				{
				b= true;
				break;
				}
			if(board[i][y]==' ')
			{
				b= false;
				break;
			}
		
		
		}
		
		if(b)
		{
			flag=true;
			for(int i=x-1;i>=0;i--)
			{
				if(board[i][y]==symbol)
					{
						b= false;
						break;
					}
				else{
					board[i][y]=symbol;
				}
			}
		}
		for(int i=y+1;i<8;i++)
		{

			if(board[x][i]==symbol)
				{
				b= true;
				break;
				}
			if(board[x][i]==' ')
			{
				b= false;
				break;
			}
	
		}
		if(b)
		{
			flag=true;
			for(int i=y+1;i<8;i++)
			{

				if(board[x][i]==symbol)
					{
						b= false;
						break;
					}
				else{
					board[x][i]=symbol;
				}
		
			}
			
		}
		for(int i=y-1;i>0;i--)
		{

			if(board[x][i]==symbol)
				{
					b= true;
					break;
				}
			if(board[x][i]==' ')
			{
				b= false;
				break;
			}
	
		}
		if(b)
		{
			flag=true;
			for(int i=y-1;i>=0;i--)
			{

				if(board[x][i]==symbol)
					{
						b= false;
						break;
					}
				else{
					board[x][i]=symbol;
				}
		
			}
			
		}		
		int i=x+1;
		int j=y+1;
		while(i<8 && j<8)
		{
			if(board[i][j]==symbol)
				{
				b= true;
				break;
				}
			if(board[i][j]==' ')
			{
				b= false;
				break;
			}
			i++;
			j++;
		}

		if(b)
		{
			flag=true;
			while(i<8 && j<8)
			{
				if(board[i][j]==symbol)
					{
						b=false;
						break;
					}
				else{
					board[i][j]=symbol;
				}
				i++;
				j++;
			}
			
		}
		
		i=x-1;
		j=y+1;
		while(i>=0 && j<8)
		{
			if(board[i][j]==symbol)
				{
					b= true;
					break;
				}
			if(board[i][j]==' ')
			{
				b= false;
				break;
			}
			i--;
			j++;
		}
		
		if(b)
		{
			flag=true;
			while(i>=0 && j<8)
			{
				if(board[i][j]==symbol)
					{
						b=false;
						break;
					}
				else{
					board[i][j]=symbol;
				}
				i--;
				j++;
			}
			
		}
		
		i=x-1;
		 j=y-1;
		while(i>=0 && j>=0)
		{
			if(board[i][j]==symbol)
				{
				b= true;
				break;
				}
			if(board[i][j]==' ')
			{
				b= false;
				break;
			}
			i--;
			j--;
		}
		if(b)
		{
			flag=true;
			while(i>=0 && j>=0)
			{
				if(board[i][j]==symbol)
					{
						b=false;
						break;
					}
				else{
					board[i][j]=symbol;
				}
				i--;
				j--;
			}
			
		}
		i=x+1;
		 j=y-1;
		while(j>=0 && i<8)
		{
			if(board[i][j]==symbol)
				{
					b= true;
					break;
				}
			if(board[i][j]==' ')
			{
				b= false;
				break;
			}
			i++;
			j--;
		}
		if(b)
		{
			flag=true;
			while(i<8 && j>=0)
			{
				if(board[i][j]==symbol)
					{
						b=false;
						break;
					}
				else{
					board[i][j]=symbol;
				}
				i++;
				j--;
			}
			
		}
	
		return flag;
	}

/*	public void makeChanges(int x1,int y1, int x2,int y2,int symbol,int opposite,int countX,int countY){
		
		while(x1<=x2 && y1<=y2)
		{
			if(board[x1][y1]==symbol)
				return ;
			else if(board[x1][y1]==opposite)
				board[x1][y1]=symbol;
			x1+=countX;
			y1+=countY;
		}
	
	}*/
}
