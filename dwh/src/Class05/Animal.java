package Class05;

public class Animal
{
	String name;
	void shut() 
	{
		System.out.println("喵喵喵");
	}
}
	class dog extends Animal
	{
		public void printname()
		{
			System.out.println("name"+name);
	}
	public static void main(String[] args)
	{
		dog d=new dog();
		d.name="舔狗";
		d.printname();
		d.shut();
	}

}
