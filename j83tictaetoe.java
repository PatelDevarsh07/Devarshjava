package java1;

import java.util.Scanner;

public class j83tictaetoe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ar[]= {'_','_','_','_','_','_','_','_','_'};
		int turn=1;
		int pos;
		while(turn<10)
		{
			if(turn%2==0)
			{
				System.out.println("Player2 ur turn");
				pos=sc.nextInt();
				ar[pos-1]='X';
			}
			else
			{
				System.out.println("Player1 ur turn");
				pos=sc.nextInt();
				ar[pos-1]='O';
			}
			if(ar[0]==ar[1]&&ar[1]==ar[2]&&ar[0]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[0]==ar[1]&&ar[1]==ar[2]&&ar[0]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			else if(ar[3]==ar[4]&&ar[4]==ar[5]&&ar[3]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[3]==ar[4]&&ar[4]==ar[5]&&ar[3]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			else if(ar[6]==ar[7]&&ar[7]==ar[8]&&ar[6]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[6]==ar[7]&&ar[7]==ar[8]&&ar[6]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			else if(ar[0]==ar[3]&&ar[3]==ar[6]&&ar[0]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[0]==ar[3]&&ar[3]==ar[6]&&ar[0]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			else if(ar[1]==ar[4]&&ar[4]==ar[7]&&ar[1]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[1]==ar[4]&&ar[4]==ar[7]&&ar[1]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			else if(ar[2]==ar[5]&&ar[5]==ar[8]&&ar[2]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[2]==ar[5]&&ar[5]==ar[8]&&ar[2]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			else if(ar[0]==ar[4]&&ar[4]==ar[8]&&ar[0]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[0]==ar[4]&&ar[4]==ar[8]&&ar[0]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			else if(ar[2]==ar[4]&&ar[4]==ar[6]&&ar[2]=='O')
			{
				System.out.println("Player1 is winner");
				turn=15;
			}
			else if(ar[2]==ar[4]&&ar[4]==ar[6]&&ar[2]=='X')
			{
				System.out.println("Player2 is winner");
				turn=15;
			}
			
		System.out.println("AFTER"+turn+" ");
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]+" ");
		System.out.println(ar[3]+" "+ar[4]+" "+ar[5]+" ");
		System.out.println(ar[6]+" "+ar[7]+" "+ar[8]+" ");
		turn++;		
		}
		if(turn==10)
		{
			System.out.println("tie");
		}
	}
}
