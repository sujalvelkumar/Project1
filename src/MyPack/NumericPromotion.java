package src.MyPack;

class Overloading{
	void add(int a, int b)
	{
		System.out.println("calling add int int");
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println("calling add double double");
		System.out.println(a+b);
	}
}
public class NumericPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a =10, b=15;
			Overloading o = new Overloading();
			o.add(a,b); // int int
			o.add(20.4, 89.6);// double double
			o.add(a, 12.4f);// int float numeric promotion
			o.add(54.8, a); // double int numeric promotion
	}

}
