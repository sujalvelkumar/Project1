package src.MyPack;

public class HollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Start of Block 1
				for(int r =1; r<=5; r++)
				{
					//Print first pattern of *
					for(int c=5; c>=r; c--)
					{
						System.out.print(" ");
					}
					
					for(int c=1; c<=r; c++)
					{
						//For Hollow Pattern
						if(c==r || r==5 || c==1 )
						{
							System.out.print("*");
						}
							else
							System.out.print(" ");
					}
					//Print box of spaces
					for(int c= 1; c<=5; c++)
					{
						System.out.print(" ");
					}
					//Print second pattern of *
					for(int c=1; c<=r; c++)
					{
						if(c == 1 || r==5 || c==r)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					for(int c=5; c>=r; c--)
					{
						System.out.print(" ");
					}
					System.out.println();
				}
					//End of Block 1
					
					//Start of second block:
					
				for(int r=1; r<=5;r++)
				{
					//Print box of spaces
					for(int c =1; c<=6; c++)
					{
						System.out.print(" ");
					}
					//Print the box of *
					for(int c= 1; c<=5; c++)
					{
						if(r==1 || r==5 || c==1 || c==5)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					//Print the box of spaces
					for(int c =1; c<=5; c++)
					{
						System.out.print(" ");
					}
					System.out.println();
				}
				//End of Block2
				
				//Start of Block3
				
				for(int r=1; r<=5; r++)
				{
					//Print first pattern of *
					for(int c=1; c<=r; c++)
					{
						System.out.print(" ");
					}
					for(int c=5; c>=r; c--)
					{
						if(r==1 || c==5 || c==r)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					
					//Print box of Spaces
					for(int c= 1; c<=5; c++)
					{
						System.out.print(" ");
					}
					
					//Print second pattern of *
					for(int c=5; c>=r; c--)
					{
						if(r==1 || c==5 || c==r)
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					
					for(int c=1; c<=r; c++)
					{
						System.out.print(" ");
					}
					
					System.out.println();
				}

	}

}
