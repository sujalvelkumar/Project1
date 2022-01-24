package src.MyPack;

class Parent11
{
	void pocketMoney()
	{
		System.out.println("Pocket money is 20$");
	}
}
class Child11 extends Parent11
{
	int a; int b;
	@Override
	void pocketMoney()
	{
		System.out.println("Pocket money is 200$");
	}
	void drinkAlchole()
	{
		System.out.println("Alchole");
	}
}
public class inher2 {

	public static void main(String[] args) {
		Parent11 p = new Child11();
		p.pocketMoney();
//		System.out.println(p.a);
		// TODO Auto-generated method stub
		((Child11) p).drinkAlchole();

	}

}
