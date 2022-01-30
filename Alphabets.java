package src.MyPack;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the r*c ");
		int n= sc.nextInt();
		//Print A
		for(int r = 1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 && r>n/2 || c==n && r>n/2 || r==n/2 || c+r== (n/2)+1 || c-r == n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Print B
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || r==1 && c<(n/2)+1 || c==7 && (r>1 && r<n/2) || r==5 && c!=n || c==n && (r>(n/2)&& r<n) || r==n && c!=n)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print C		
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 && r!=1 && r!=n || r==1 && c!=1 || r==n && c!=1)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print D
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || r==1 && c!=n ||c==n && r!=1 && r!=n || r==n && c!=n)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print E
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1|| r==1 || r==n || r==n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print F
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || r==1 || r==n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print G
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 && c!=1 || c==1 && r!=1 && r!=n || r==n && c!=1 && c!=n ||c==n && r>n/2 || r==5 && c!=n && c> n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print H
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || c==n || r==5)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Print I
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 || r==n || c== n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print J
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 || c==n/2 && r!=n || r==n && c<n/2 && c!=1 || c==1 && r>n/2 && r!=n)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print K
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || c+r== (3*n)/4 || r-c ==(n/2) )
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print L
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || r==n )
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print M
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || c==n || c==r && r<=n/2 && c<= n/2 || c+r == n+1 && c>=n/2 && r<=n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print N
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || c==n || c==r )
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print O
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 && r!=1 && r!=n || c==n && r!=1 && r!=n || r==1 && c!=1 && c!=n || r==n && c!=1 && c!=n)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print P
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 && r!=1 || r==1 && c!=1 && c!=n || c==n && r<n/2 && r!=1 || r==n/2 && c!=n)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print Q
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 && c<=(3*n)/4 || r==(3*n)/4 && c<=(3*n)/4 || c==1 && r<=(3*n)/4 || c==(3*n)/4 && r<=(3*n)/4 || r==c && r>=n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print R
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 && r!=1 || r==1 && c!=1 && c!=n || c==n && r<n/2 && r!=1 || r==n/2 && c!=n || r==c && r>=n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print S
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 && c!=1 && c!=n || r==n/2 && c!=1 && c!=n || r==n && c!=1 && c!=n || c==1 && r!=1 && r<n/2 || c==n && r!=n && r>n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print U
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 && r!=n || c==n && r!=n || r==n && c!=1 && c!=n)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print V
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 && r<=n/2 || c==n && r<=n/2 || r-c == n/2 || r+c==((3*n)/2)+1 )
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print W
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==1 || c==n || c==r && r>=n/2 || c+r == n+1 && r>=n/2 )
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print X
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==r || c==n-r+1)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Print Y
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(c==r && r<=n/2 ||c+r == n && r<n/2 || c==n/2 && r>n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Print Z
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 || r==n || c==(n-r)+1)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
