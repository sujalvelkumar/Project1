package src.MyPack;

abstract class Bird
{
	abstract void fly();
	
	abstract void eat();
	void play()
	{
		System.out.println("hi i am playing");
	}
	
}
class Eagle extends Bird
{
	void fly()
	{
		System.out.println("Eagle fly at high altitude in the sky");
	}
	void eat()
	{
		System.out.println("Eagle eat small animals and snake");
	}
}
class Sparrow extends Bird
{
	void fly()
	{
		System.out.println("sparrow fly at low altitude in the sky");
	}
	void eat()
	{
		System.out.println("Sparrow eat insects and grains");
	}
}
class GoldenEagle extends Eagle
{
	void fly()
	{
		System.out.println("Golden Eagle fly over the sea");
	}
	void eat()
	{
		System.out.println("Golden Eagle eats fish");
	}
}
class SerpantEagle extends Eagle
{
	void fly()
	{
		System.out.println("Serpant Eagle fly over the mountain");
	}
	void eat()
	{
		System.out.println("Serpant Eagle eats insects");
	}
}
class OpBird
{
	static void permit(Bird b)
	{
		b.fly();
		b.eat();
	}
	
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldenEagle ge= new GoldenEagle();
		SerpantEagle se = new SerpantEagle();
		Sparrow sp= new Sparrow();
//		Bird b;
//		b=ge;
//		b.eat();
//		b.fly();
//		b= se;
//		b.eat();b.fly();
//		b=sp;
//		b.eat();b.fly();
//		ge.eat();
		OpBird.permit(ge);
		OpBird.permit(se);
		OpBird.permit(sp);
	}

}
