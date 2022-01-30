package src.MyPack;

class PrintBlocks
{

	//Print block 1
	void printBlk1()
	{
			for(int r =1; r<=5; r++)
			{
				//Pattern 1
				for(int c=5; c>r; c--)
				{
					System.out.print(" ");
				}
				
				for(int c=1; c<=r; c++)
				{
					System.out.print("*");
				}
				
				//Print box of spaces
				for(int c= 1; c<=5; c++)
				{
					System.out.print(" ");
				}
				
				//Pattern 2
				for(int c=1; c<=r; c++)
				{
					System.out.print("*");
				}
				for(int c=5; c>r; c--)
				{
					System.out.print(" ");
				}
				
				//pattern3
				for(int c=5; c>r; c--)
				{
					System.out.print(" ");
				}
				
				for(int c=1; c<=r; c++)
				{
					System.out.print("*");
				}
				
				//Print box of spaces
				for(int c= 1; c<=5; c++)
				{
					System.out.print(" ");
				}
				
			    //Pattern 4
				for(int c=1; c<=r; c++)
				{
					System.out.print("*");
				}
				for(int c=5; c>r; c--)
				{
					System.out.print(" ");
				}
				
				System.out.println();
			}
	}
	
	//Print block2
	void printBlk2()
	{
		for(int r= 1; r<=5; r++)
		{
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			
			//Print box of spaces
			for(int c= 1; c<=5; c++)
			{
				System.out.print(" ");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			//Print box of spaces
			for(int c= 1; c<=5; c++)
			{
				System.out.print(" ");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void printBlk3()
	{
		for(int r =1; r<=5; r++)
		{
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			 //Pattern 2
			for(int c=1; c<=r; c++)
			{
				System.out.print("*");
			}
			for(int c=5; c>r; c--)
			{
				System.out.print(" ");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
		
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			//Pattern 3
			for(int c=5; c>r; c--)
			{
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++)
			{
				System.out.print("*");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	//Print block4
	void printBlk4()
	{
		for(int r =1; r<=5; r++)
		{
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	// Print Block 5
	void printBlk5()
	{
		for(int r=1; r<=5; r++)
		{
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			//pattern2
			for(int c=5; c>=r; c--)
			{
				System.out.print("*");
			}
			for(int c=1; c<r; c++)
			{
				System.out.print(" ");
			}
			
			//Pattern3
			for(int c=1; c<r; c++)
			{
				System.out.print(" ");
			}
			for(int c=5; c>=r; c--)
			{
				System.out.print("*");
				
			}
			//pattern4
			for(int c=5; c>=r; c--)
			{
				System.out.print("*");
			}
			for(int c=1; c<r; c++)
			{
				System.out.print(" ");
			}
			
			//Pattern5
			for(int c=1; c<r; c++)
			{
				System.out.print(" ");
			}
			for(int c=5; c>=r; c--)
			{
				System.out.print("*");
				
			}
			//Print box of *
			for(int c= 1; c<=5; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	void printBlk6()
	{
		for(int r =1; r<=5; r++)
		{
			//Pattern1
			for(int c=1; c<r; c++)
			{
				System.out.print(" ");
			}
			for(int c=5; c>=r; c--)
			{
				System.out.print("*");
				
			}
			//Print box of spaces
			for(int c= 1; c<=5; c++)
			{
				System.out.print(" ");
			}
			//Print box of spaces
			for(int c= 1; c<=5; c++)
			{
				System.out.print(" ");
			}
			//Print box of spaces
			for(int c= 1; c<=5; c++)
			{
				System.out.print(" ");
			}
			//Print box of spaces
			for(int c= 1; c<=5; c++)
			{
				System.out.print(" ");
			}
			
			//pattern2
			for(int c=5; c>=r; c--)
			{
				System.out.print("*");
			}
			for(int c=1; c<r; c++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}

public class PatternAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintBlocks pb = new PrintBlocks();
		pb.printBlk1();
		pb.printBlk2();
		pb.printBlk3();
		pb.printBlk4();
		pb.printBlk5();
		pb.printBlk6();
		

	}

}
