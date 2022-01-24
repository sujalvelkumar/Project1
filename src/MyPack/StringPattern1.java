package src.MyPack;

public class StringPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 1; j<=5; j++)
		{
			for(int i = 0; i<j; i++)
			{
				System.out.print(" ");
			}
		
			for(int i = 5; i>=j; i--)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
