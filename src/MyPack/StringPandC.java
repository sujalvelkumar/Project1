package src.MyPack;

public class StringPandC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello"; // stored in constant pool
		String s2 = "Hello";// stored in constant pool
		String s3 = new String("Hi Everyone"); //Stored in String pool
		String s4 = new String("Hi Everyone"); //Stored in String pool
		
		// Checking for constant pool for reference and string value
		if(s1 == s2) 
		{
			System.out.println("Ref in constant pool");
			System.out.println("Ref are equal");
		}
		else
		{
			System.out.println("Ref in constant pool");
			System.out.println("Ref are not equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("Strings in constant pool");
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings in constant pool");
			System.out.println("Strings are not equal");
		}
		// Checking for String pool for reference and string value
		if(s3 == s4) 
		{
			System.out.println("Ref in String pool");
			System.out.println("Ref are equal");
		}
		else
		{
			System.out.println("Ref in String pool");
			System.out.println("Ref are not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("Strings in String pool");
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings in String pool");
			System.out.println("Strings are not equal");
		}
		// Checking for one assigned in String pool and other assigned in constant poolfor reference and string value
		
		if(s1 == s4) 
		{
			System.out.println("One Ref from String pool and other from Constant pool");
			System.out.println("Ref are equal");
		}
		else
		{
			System.out.println("One Ref from String pool and other from Constant pool");
			System.out.println("Ref are not equal");
		}
		if(s1.equals(s4))
		{
			System.out.println("One string from String pool and other from Constant pool");
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("One string from String pool and other from Constant pool");
			System.out.println("Strings are not equal");
		}
	}

}
