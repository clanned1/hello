package Class05;

public class Animal1
{
	String name1;
	int size;
	void Animal1()
	{
		System.out.println("身长："+size);
	}
	void ff()
	{
		System.out.println("I fly");
	}
}
	class pig extends Animal1
	{
		String name;
		void fff()
		{
			System.out.println("名字为："+name+"身长为："+size+"父类名字为："+name1);
		}
	}