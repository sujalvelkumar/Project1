package src.MyPack;

import java.util.Scanner;
class alphabet
{
	
	static int height = 5;
	 
	static int width = (2 * height) - 1;
	 
	static int abs(int d)
	{
	    return d < 0 ? -1 * d : d;
	}
	//Print A
	static void printA()
	{
	    int n = width / 2, i, j;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j <= width; j++)
	        {
	            if (j == n || j == (width - n)
	                || (i == height / 2 && j > n
	                    && j < (width - n)))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	        n--;
	    }
	    System.out.printf("\n\n"); 
	}
	
	// Print B
	static void printB()
	{
	    int i, j, half = (height / 2);
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < width; j++)
	        {
	            if ((i == 0 || i == height - 1 || i == half)
	                && j < (width - 2))
	                System.out.printf("*");
	            else if (j == (width - 2)
	                    && !(i == 0 || i == height - 1
	                        || i == half))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//print C
	static void printC()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < (height - 1); j++)
	        {
	            if (i == 0 || i == height - 1)
	                System.out.printf("*");
	            else
	                continue;
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//Print D
	static void printD()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < height; j++)
	        {
	            if ((i == 0 || i == height - 1)
	                && j < height - 1)
	                System.out.printf("*");
	            else if (j == height - 1 && i != 0
	                    && i != height - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//Print E
	static void printE()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < height; j++)
	        {
	            if ((i == 0 || i == height - 1)
	                || (i == height / 2
	                    && j <= height / 2))
	                System.out.printf("*");
	            else
	                continue;
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//Print F
	static void printF()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < height; j++)
	        {
	            if ((i == 0) || (i == height / 2
	                        && j <= height / 2))
	                System.out.printf("*");
	            else
	                continue;
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//print G
	static void printG()
	{
	    int i, j;
	    width--;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < width; j++)
	        {
	            if ((i == 0 || i == height - 1)
	                && (j == 0 || j == width - 1))
	                System.out.printf(" ");
	            else if (j == 0)
	                System.out.printf("*");
	            else if (i == 0 && j <= height)
	                System.out.printf("*");
	            else if (i == height / 2
	                    && j > height / 2)
	                System.out.printf("*");
	            else if (i > height / 2
	                    && j == width - 1)
	                System.out.printf("*");
	            else if (i == height - 1
	                    && j < width)
	            	System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//Print H
	static void printH()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < height; j++)
	        {
	            if ((j == height - 1)
	                || (i == height / 2))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	 
		
	//Print I
	static void printI()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < height; j++)
	        {
	            if (i == 0 || i == height - 1)
	                System.out.printf("*");
	            else if (j == height / 2)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	 		
	//Print J
	static void printJ()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < height; j++)
	        {
	            if (i == height - 1 && (j > 0
	                && j < height - 1))
	                System.out.printf("*");
	            else if ((j == height - 1
	                    && i != height - 1)
	                    || (i > (height / 2) - 1
	                    && j == 0 && i != height - 1))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//print K
	static void printK()
	{
	    int i, j, half = height / 2, dummy = half;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= half; j++)
	        {
	            if (j == abs(dummy))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	        dummy--;
	    }
	    System.out.printf("\n\n");
	}
	
	//Print L
	static void printL()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= height; j++)
	        {
	            if (i == height - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
		
	//Print M
	static void printM()
	{
	    int i, j, counter = 0;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= height; j++)
	        {
	            if (j == height)
	                System.out.printf("*");
	            else if (j == counter
	                    || j == height - counter - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        if (counter == height / 2)
	        {
	            counter = -99999;
	        }
	        else
	            counter++;
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
		
	//Print N
	static void printN()
	{
	    int i, j, counter = 0;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= height; j++)
	        {
	            if (j == height)
	                System.out.printf("*");
	            else if (j == counter)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        counter++;
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//print O
	static void printO()
	{
	    int i, j, space = (height / 3);
	    int width = height / 2 + height / 5 + space + space;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j <= width; j++)
	        {
	            if (j == width - abs(space)
	                || j == abs(space))
	                System.out.printf("*");
	            else if ((i == 0
	                    || i == height - 1)
	                    && j > abs(space)
	                    && j < width - abs(space))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        if (space != 0
	            && i < height / 2)
	        {
	            space--;
	        }
	        else if (i >= (height / 2 + height / 5))
	            space--;
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//Print P
	static void printP()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < height; j++)
	        {
	            if ((i == 0 || i == height / 2)
	                && j < height - 1)
	                System.out.printf("*");
	            else if (i < height / 2
	                    && j == height - 1 && i != 0)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
		
	//Print Q
	static void printQ()
	{
	    printO();
	    int i, j, d = height;
	    for (i = 0; i < height / 2; i++)
	    {
	        for (j = 0; j <= d; j++)
	        {
	            if (j == d)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	        d++;
	    }
	    System.out.printf("\n\n");
	}
		
	//Print R
	static void printR()
	{
	    int i, j, half = (height / 2);
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < width; j++)
	        {
	            if ((i == 0 || i == half)
	                && j < (width - 2))
	                System.out.printf("*");
	            else if (j == (width - 2)
	                    && !(i == 0 || i == half))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//print S
	static void printS()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < height; j++)
	        {
	            if ((i == 0 || i == height / 2
	                || i == height - 1))
	                System.out.printf("*");
	            else if (i < height / 2
	                    && j == 0)
	                System.out.printf("*");
	            else if (i > height / 2
	                    && j == height - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//Print T
	static void printT()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < height; j++)
	        {
	            if (i == 0)
	                System.out.printf("*");
	            else if (j == height / 2)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
		
	//Print U
	static void printU()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        if (i != 0 && i != height - 1)
	            System.out.printf("*");
	        else
	            System.out.printf(" ");
	        for (j = 0; j < height; j++)
	        {
	            if (((i == height - 1)
	                && j >= 0
	                && j < height - 1))
	                System.out.printf("*");
	            else if (j == height - 1 && i != 0
	                    && i != height - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
		
	//Print V
	static void printV()
	{
	    int i, j, counter = 0;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j <= width; j++)
	        {
	            if (j == counter
	                || j == width - counter - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        counter++;
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//print W
	static void printW()
	{
	    int i, j, counter = height / 2;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= height; j++)
	        {
	            if (j == height)
	                System.out.printf("*");
	            else if ((i >= height / 2)
	                    && (j == counter
	                    || j == height - counter - 1))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        if (i >= height / 2)
	        {
	            counter++;
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
	
	//Print X
	static void printX()
	{
	    int i, j, counter = 0;
	    for (i = 0; i <= height; i++)
	    {
	        for (j = 0; j <= height; j++)
	        {
	            if (j == counter
	                || j == height - counter)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        counter++;
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
	}
		
	//Print Y
	static void printY()
	{
	    int i, j, counter = 0;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j <= height; j++)
	        {
	            if (j == counter
	                || j == height - counter
	                && i <= height / 2)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	        if (i < height / 2)
	            counter++;
	    }
	    System.out.printf("\n\n");
	}
		
	//Print Z
	static void printZ()
	{
	    int i, j, counter = height - 1;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j < height; j++)
	        {
	            if (i == 0 || i == height - 1
	                || j == counter)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        counter--;
	        System.out.printf("\n");
	    }
	    System.out.printf("\n\n");
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


public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabet alpha = new alphabet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String str = sc.nextLine();
		if(!(str.isEmpty()) && !(alpha.isNumber(str)) && !(alpha.hasSpecialCharacter(str)))
		{
			str = str.toLowerCase();
			for(int i =0; i<str.length(); i++)
			{
				if(str.charAt(i)== 'a')
				{
				//	System.out.println(i);
				//	System.out.println("I am in A");
					alpha.printA();
				}
				else if(str.charAt(i)== 'b')
				{
					alpha.printB();
				}
				else if(str.charAt(i)== 'c')
				{
					alpha.printC();
				}
				else if(str.charAt(i)== 'd')
				{
					alpha.printD();
				}	
				else if(str.charAt(i)== 'e')
				{
					alpha.printE();
				}	
				else if(str.charAt(i)== 'f')
				{
					alpha.printF();
				}	
				else if(str.charAt(i)== 'g')
				{
					alpha.printG();
				}	
				else if(str.charAt(i)== 'h')
				{
					alpha.printH();
				}	
				else if(str.charAt(i)== 'i')
				{
					alpha.printI();
				}	
				else if(str.charAt(i)== 'j')
				{
					alpha.printJ();
				}	
				else if(str.charAt(i)== 'k')
				{
					alpha.printK();
				}	
				else if(str.charAt(i)== 'l')
				{
					alpha.printL();
				}	
				else if(str.charAt(i)== 'm')
				{
					alpha.printM();
				}	
				else if(str.charAt(i)== 'n')
				{
					alpha.printN();
				}	
				else if(str.charAt(i)== 'o')
				{
					alpha.printO();
				}	
				else if(str.charAt(i)== 'p')
				{
					alpha.printP();
				}	
				else if(str.charAt(i)== 'q')
				{
					alpha.printQ();
				}	
				else if(str.charAt(i)== 'r')
				{
					alpha.printR();
				}	
				else if(str.charAt(i)== 's')
				{
					alpha.printS();
				}	
				else if(str.charAt(i)== 't')
				{
					alpha.printT();
				}	
				else if(str.charAt(i)== 'u')
				{
					alpha.printU();
				}	
				else if(str.charAt(i)== 'v')
				{
					alpha.printV();
				}	
				else if(str.charAt(i)== 'w')
				{
					alpha.printW();
				}	
				else if(str.charAt(i)== 'x')
				{
					alpha.printX();
				}	
				else if(str.charAt(i)== 'y')
				{
					alpha.printY();
				}	
				else if(str.charAt(i) == 'z')
				{
					alpha.printZ();
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
	


