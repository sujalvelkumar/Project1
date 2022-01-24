package src.MyPack;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi Everyone";
		System.out.println(s); 
		String s1 = s.toUpperCase();
		System.out.println("Upper case:"+s.toUpperCase());
		System.out.println(s);// Didnt modify the s, as after modification it was not stored
		System.out.println(s1); // created the ref for new string
		System.out.println("Char at index 5\t"+s.charAt(5));
		System.out.println("Code point at index 5\t"+s.codePointAt(4));
		System.out.println("Comparing the string\t" +s.compareTo("hello evryone"));
		System.out.println("Concating the string"+s.concat("and good morning"));
		
	}

}
