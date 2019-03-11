package Class05;


class monkey
{
	monkey(String s)
	{
		
	}
	public void speak()
	{
		System.out.println("咿咿呀呀");
	}
}
class people extends monkey
{
	people(String s)
	{
		super(s);
	}
	public void speak()
	{
		System.out.println("不错嘛");
	}
	public void think()
	{
		System.out.println("别说话，认真思考");
	}
}
public class Animal3
{
	public static void main(String[] args)
	{
		monkey m=new monkey("s");
		people p=new people("p");
		m.speak();
		p.speak();
		p.think();
	}
}