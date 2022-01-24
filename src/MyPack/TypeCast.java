package src.MyPack;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a =126;
		int b;
		b = a; //implicit conversion
		System.out.println(b);
		int c = 127;
		byte d;
		d = (byte)c; // explicit conversion
		System.out.println(d);
	}

}
