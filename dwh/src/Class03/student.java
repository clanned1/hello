package Class03;

import java.util.Scanner;

public class student
{
	private String name;
	private int height;
	private int age;
	private String sex;
	private String hello;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getHello()
	{
		return hello;
	}
	public void setHello(String hello)
	{
		this.hello = hello;
	}
	void per()
	{
		System.out.println(hello);
		System.out.println("名字："+name);
		System.out.println("身高："+height);
		System.out.println("年龄："+age);
	}
}
