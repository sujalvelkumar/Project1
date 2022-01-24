package src.MyPack;
class Demo3{
	static int a =10,b =20;
	int c =30, d =40;
	static
	{
		System.out.println("this is static block");
		System.out.println("a=" +a+ "b=" +b);
		}
	{
		System.out.println("this is non static block");
		System.out.println("a=" +a+ "b=" +b);
		}
	static void fun1()
	{
	System.out.println("this is static fun1");
	}	
	 void fun2()
	{
	System.out.println("this is  fun2");
	}	
	 Demo3()
	 {
		 System.out.println("In constructor");
	 }
	 
}
public class StaticExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3.fun1();
		Demo3 d3 = new Demo3();
		d3.fun2();
	}

}
