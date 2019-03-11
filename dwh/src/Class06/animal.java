package Class06;
public abstract class animal
{
	abstract void eat(); 
}
class cat extends animal
{
	void eat()
	{
		System.out.println("猫吃鱼");
	}
}
class dog extends animal
{
	void eat()
	{
		System.out.println("狗吃骨头");
	}
}
