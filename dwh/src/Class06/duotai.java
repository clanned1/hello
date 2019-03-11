package Class06;
 class file
{
	void info()
	{
		System.out.println("java");
	}
	void info(int a)
	{
		System.out.println("java");
	}
}
class videofile extends file
{
	void info()
	{
		System.out.println("python");
	}
}
public class duotai
{
	public static void main(String[] args)
	{
		final int i; 
		file f=new file();
		f=new videofile();
		f.info();
		videofile d=new videofile();
		videofile t=(videofile)d;
	}
}
