package src.MyPack;
class Demo
{
	int a, b;
	Demo()
	{
		this(10,20);
		System.out.println("In zero Parameterized Constructor");
	}
	Demo(int a, int b)
	{
		
		System.out.println("In Parameterized Constructor");
		this.a =a;
		this.b = b;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class LocalChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo D = new Demo();
		D.disp();

	}

}
