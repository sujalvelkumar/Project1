package src.MyPack;
class plane
{
	void takeoff()
	{
		System.out.println("plane is taking off");
	
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void landing()
	{
		System.out.println("plane is landing");
	}
}
class CargoPlane extends plane
{
	void fly()
	{
		System.out.println("Cargoplane is flying at low altutude");
	}
	void carrycargo()
	{
		System.out.println("carries cargo");
	}
}
class PassengerPlane extends plane
{
	void fly()
	{
		System.out.println("Passengerplane is flying at Medium altutude");
	}
}
class FighterPlane extends plane
{
	void fly()
	{
		System.out.println("FighterPLane is flying at high altutude");
	}
	
}
class Oper
{
	static void permit(plane p)
	{
		p.fly();
		p.landing();
		p.takeoff();
	}
}
public class OverRid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane c =new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
//		plane  pl = new plane();
//		c.fly();
//		c.landing();
//		c.takeoff();
//		
//		p.fly();
//		p.landing();
//		p.takeoff();
//		
//		f.fly();
//		f.landing();
//		f.takeoff();
//		
//		pl.fly();
//		pl.landing();
//		pl.takeoff();
//		
		Oper.permit(f);
		Oper.permit(c);
		Oper.permit(p);
	}

}
