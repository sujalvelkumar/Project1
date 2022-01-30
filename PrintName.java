package src.MyPack;

import java.util.Scanner;
class alphabet
{
	
	//Print A
	static void printA(int n)
	{
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
	}
	
	// Print B
	static void printB(int n)
	{
	   
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
	}
	
	//print C
	static void printC(int n)
	{
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
	}
	
	//Print D
	static void printD(int n)
	{
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
	}
	
	//Print E
	static void printE(int n)
	{
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
	}
	
	//Print F
	static void printF(int n)
	{
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
	}
	
	//print G
	static void printG(int n)
	{
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
	}
	
	//Print H
	static void printH(int n)
	{
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
	}
	 
		
	//Print I
	static void printI(int n)
	{
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
	}
	 		
	//Print J
	static void printJ(int n)
	{
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
	}
	
	//print K
	static void printK(int n)
	{
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
	}
	
	//Print L
	static void printL(int n)
	{
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
	}
		
	//Print M
	static void printM(int n)
	{
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
	}
		
	//Print N
	static void printN(int n)
	{
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
	}
	
	//print O
	static void printO(int n)
	{
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
	}
	
	//Print P
	static void printP(int n)
	{
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
	}
		
	//Print Q
	static void printQ(int n)
	{
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
	}
		
	//Print R
	static void printR(int n)
	{
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
	}
	
	//print S
	static void printS(int n)
	{
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
	}
	
	//Print T
	static void printT(int n)
	{
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n; c++)
			{
				if(r==1 || c==n/2)
				{	
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
		
	//Print U
	static void printU(int n)
	{
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
	}
		
	//Print V
	static void printV(int n)
	{
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
		
	}
	
	//print W
	static void printW(int n)
	{
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
	}
	
	//Print X
	static void printX(int n)
	{
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
	}
		
	//Print Y
	static void printY(int n)
	{
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
	}
		
	//Print Z
	static void printZ(int n)
	{
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
		System.out.println();
	}
	
	//check if entered string has numeric value
	 static boolean isNumber(String s)
	    {
	        for (int i = 0; i < s.length(); i++)
	        {
	        	if (Character.isDigit(s.charAt(i)) == true)
	                return true;
	        }    
	        return false;
	    }
	 
	 //check if entered string has special characters
	 static boolean hasSpecialCharacter(String s)
	    {
		 String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
	        for (int i = 0; i < s.length(); i++)
	        {
	        	char ch = s.charAt(i);
	        	if (specialCharactersString.contains(Character.toString(ch)))
	                return true;
	        }    
	        return false;
	    }
	
}


public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabet alpha = new alphabet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String str = sc.nextLine();
		System.out.println("Enter the R*C");
		int num = sc.nextInt();
		if(!(str.isEmpty()) && !(alpha.isNumber(str)) && !(alpha.hasSpecialCharacter(str)))
		{
			str = str.toLowerCase();
			for(int i =0; i<str.length(); i++)
			{
				if(str.charAt(i)== 'a')
				{
				//	System.out.println(i);
				//	System.out.println("I am in A");
					alpha.printA(num);
				}
				else if(str.charAt(i)== 'b')
				{
					alpha.printB(num);
				}
				else if(str.charAt(i)== 'c')
				{
					alpha.printC(num);
				}
				else if(str.charAt(i)== 'd')
				{
					alpha.printD(num);
				}	
				else if(str.charAt(i)== 'e')
				{
					alpha.printE(num);
				}	
				else if(str.charAt(i)== 'f')
				{
					alpha.printF(num);
				}	
				else if(str.charAt(i)== 'g')
				{
					alpha.printG(num);
				}	
				else if(str.charAt(i)== 'h')
				{
					alpha.printH(num);
				}	
				else if(str.charAt(i)== 'i')
				{
					alpha.printI(num);
				}	
				else if(str.charAt(i)== 'j')
				{
					alpha.printJ(num);
				}	
				else if(str.charAt(i)== 'k')
				{
					alpha.printK(num);
				}	
				else if(str.charAt(i)== 'l')
				{
					alpha.printL(num);
				}	
				else if(str.charAt(i)== 'm')
				{
					alpha.printM(num);
				}	
				else if(str.charAt(i)== 'n')
				{
					alpha.printN(num);
				}	
				else if(str.charAt(i)== 'o')
				{
					alpha.printO(num);
				}	
				else if(str.charAt(i)== 'p')
				{
					alpha.printP(num);
				}	
				else if(str.charAt(i)== 'q')
				{
					alpha.printQ(num);
				}	
				else if(str.charAt(i)== 'r')
				{
					alpha.printR(num);
				}	
				else if(str.charAt(i)== 's')
				{
					alpha.printS(num);
				}	
				else if(str.charAt(i)== 't')
				{
					alpha.printT(num);
				}	
				else if(str.charAt(i)== 'u')
				{
					alpha.printU(num);
				}	
				else if(str.charAt(i)== 'v')
				{
					alpha.printV(num);
				}	
				else if(str.charAt(i)== 'w')
				{
					alpha.printW(num);
				}	
				else if(str.charAt(i)== 'x')
				{
					alpha.printX(num);
				}	
				else if(str.charAt(i)== 'y')
				{
					alpha.printY(num);
				}	
				else if(str.charAt(i) == 'z')
				{
					alpha.printZ(num);
				}
				else 
				{
					System.out.println(" ");
				}
			}
		}
		else
		{
			System.out.println("Entered name is invalid");
		}
	}
}
	


