package src.MyPack;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="Java is a programming Language";
		String s2 ="It is a simple programming language";
		String s3=s1.concat(s2);
		System.out.println(s3);
		//Mutable string
		StringBuffer sb1 = new StringBuffer("sujal");
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb1.append("gangaSujddddalsujalsujall"));
		System.out.println(sb1.capacity());
		System.out.println(sb1.append("sujalsujall"));
		System.out.println(sb2.append("sujalsujall"));
		System.out.println("sb1="+sb1.capacity());
		System.out.println("sb2="+sb2.capacity());
		//String builder is same as StringBuffer.
		sb1.append(sb2);
		System.out.println(sb1.capacity());
		
	}

}
