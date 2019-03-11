package Class05;

public class Animal2
{
		String name1;
		int size;
		void Animal2()
		{
			System.out.println("身长："+size);
		}
}
 class an extends Animal2
 {
	 void a()
	 {
		 super.Animal2();
	 }
 }
 class t
 {
	 public static void main(String[] args)
	{
		Animal2 a=new Animal2();
		a.Animal2();
	}
 }