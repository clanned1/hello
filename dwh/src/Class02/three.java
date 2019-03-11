package Class02;

public class three
{
	private int b1;
	private int b2;
	private int b3;
	public int getB1()
	{
		return b1;
	}
	public void setB1(int b1)
	{
		this.b1 = b1;
	}
	public int getB2()
	{
		return b2;
	}
	public void setB2(int b2)
	{
		this.b2 = b2;
	}
	public int getB3()
	{
		return b3;
	}
	public void setB3(int b3)
	{
		this.b3 = b3;
	}
	void zouc()
	{
		System.out.println("三角形周长为"+(b1+b2+b3));
	}
}
