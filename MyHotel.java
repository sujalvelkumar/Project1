package HotelBill;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyHotel extends BasicHotel
{
	ArrayList<Bill> array = new ArrayList <Bill>();
	Scanner sc = new Scanner(System.in);
	String name, email, choice, itemName;
	int item, quantity;
	float price;
	char ch ='Y';
	float grandTotal, subTotal;
	float tip, serviceCharge;
	
	
	@Override
	void dispMenu()
	{
		System.out.println();
		System.out.println("\t\t*****************************");
		System.out.println("\t\t             Menu            ");
		System.out.println("\t\t*****************************");
		System.out.println("\t\tSlNo      ItemName      Price");
		System.out.println("\t\t*****************************");
		System.out.println("\t\t*****************************");
		System.out.println("\t\t1.        Coffee           $1");
		System.out.println("\t\t2.        Pastery          $5");
		System.out.println("\t\t3.        Water            $2");
		System.out.println("\t\t4.        Tea              $1");
		System.out.println("\t\t*****************************");
	}
	
		
	@Override
	void getUserDetails()
	{
		System.out.println("Enter the User Name");
		name = sc.nextLine();
		System.out.println("Eneter the User EmaiId");
		email = sc.nextLine();
		
	}
	
	@Override
	void getUserInput()
	{
		while(ch == 'Y')
		{
			System.out.println("Select the item of your choice:");
			item= sc.nextInt();
			System.out.println("Enter the item Quantity");
			quantity = sc.nextInt();
			calculate();
			System.out.println("Do you want more? (Y/N)");
			choice= sc.next();
			choice= choice.toUpperCase();
			ch = choice.charAt(0);
		}
		serviceCharge= 0.1f*grandTotal;
		tip();
		grandTotal+=serviceCharge;
	}
	@Override
	void calculate()
	{
		switch(item)
		{
		case 1:
			itemName = "Coffee";
			price = 1;
			subTotal = quantity*price;
			break;
			
		case 2:
			itemName = "Pastry";
			price = 5;
			subTotal = quantity*price;
			break;
			
		case 3:
			itemName = "Water ";
			price = 2;
			subTotal = quantity*price;
			break;
			
		case 4:
			itemName = "Tea   ";
			price = 1;
			subTotal = quantity*price;
			break;
					
		default:System.out.println("Invalid entry");
				
		}
		array.add(new Bill(itemName, price, quantity, subTotal));
		grandTotal = grandTotal +subTotal;
		
	}
	
	@Override
	void print()
	{
		System.out.println("\n\n\n\n\n\n");
		System.out.println("-------------------------------------------------");
		System.out.println("           Bill No : "    +(new Random()).nextInt(20000 + 1));
		System.out.println("           Name    :"+name);
		System.out.println("           Emial   :"+email);
		System.out.println("-------------------------------------------------");
		System.out.println("ItemName      Price      Quantity      subTotal  ");
		System.out.println("-------------------------------------------------");
		for(Bill b : array)
		{
			System.out.println(b.toString());
		}
		System.out.println("Tip                                       $" +tip);
		System.out.println("Service Charge                            $" +serviceCharge);
		System.out.println("-------------------------------------------------");
		System.out.println("GrandTotal                                $"+grandTotal);
	}
	void tip()
	{
		
		System.out.println("Do you wish to give  10% tip of your total for service");
		choice= sc.next();
		choice= choice.toUpperCase();
		ch = choice.charAt(0);
		if(ch == 'Y')
		{
			tip = 0.1f * grandTotal;
			grandTotal+= tip;
		}
				
	}
}
