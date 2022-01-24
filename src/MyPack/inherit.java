package src.MyPack;
class Parent
{
	int a = 12;
	int b = 16;
}
class Child extends Parent
{
	void change(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
}
class GrandChild extends Child
{
	
}
public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		GrandChild gc = new GrandChild();
		c.change(22,44);
		System.out.print(gc.a);
		
	}

}
