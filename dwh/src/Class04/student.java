package Class04;

public class student
{
	int studentno;
	String name;
	int score;
	public student(int a,String b,int c)
	{
		this.studentno=a;
		this.name=b;
		this.score=c;
	}
	void demo()
	{
		System.out.println(studentno);
		System.out.println(name);
		System.out.println(score);
	}
}