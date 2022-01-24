package src.MyPack;
class Demo4
{
	static int count = 0;
	static 
	{
		System.out.println("Static block 1");
	}
	static 
	{
		System.out.println("Static block 2");
	}
	static 
	{
		System.out.println("Static block 3");
	}
	{
		System.out.println("non Static block 1");
	}
	{
		System.out.println("non Static block 2");
	}
	{
		System.out.println("non Static block 3");
	}
	Demo4()
	{
		
	}
	Demo4(int a)
		{
			System.out.println("a=" +a);
		}
	
}
public class StaticExm2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("This is main");
		Demo4 d4 = new Demo4();
		Demo4 d5 = new Demo4(30);
	}
}

