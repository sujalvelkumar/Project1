package HotelBill;

public class Bill 
{
String itemName;
float price,quantity,subTotal;

	Bill(String itemName, float price, float quantity, float subTotal)
	{
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}
	public String toString()
	{
		return(itemName+"          "+price+"           "+quantity+"         $"+subTotal);
	}
}
