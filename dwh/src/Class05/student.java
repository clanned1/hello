package Class05;

public class student
{
	 String name;
	 String sex;
	 int age;
	void student(String name,String sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	void outinfo()
	{
		System.out.println("名字为："+name+"\n"+"性别为："+sex+"\n"+"年龄为："+age);
	}
}
class graduatestudent extends student
{
	String speeciallity;
	String teacher;
	void graduatestudent(String name,String sex,int age,String speeciallity,String teacher)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.speeciallity=speeciallity;
		this.teacher=teacher;
		//super(name,sex,age);
	}
	void outinfo()
	{
		System.out.println("专业为："+speeciallity+"\n"+"导师为："+teacher);
	}
}