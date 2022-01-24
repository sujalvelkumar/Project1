package src.MyPack;
class P1
{
	int a;
	int b;
	P1()
	{
		a = 12;
		b = 13;
	}
	P1(int a, int b)
	{
		this .a = a;
		this.b =b;
	}
}
class Ch extends P1{
	int c,d;
	
	Ch()
	{
		c= 2;
		d = 4;
	}
	Ch(int c, int d)
	{
		super(10,20);
		this .c = c;
		this.d = d;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
public class ConstInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch c = new Ch();
		Ch c1 = new Ch(10,20);
		c.disp();
		c1.disp();
	}

}
