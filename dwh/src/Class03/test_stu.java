package Class03;

import java.util.Scanner;

public class test_stu
{
	public static void main(String[] args)
	{
		String n;
		student s=new student();
		s.setAge(19);
		s.setHeight(170);
		s.setName("张三");
		s.setHello("你好");
		s.per();
		System.out.println("请输入新名字：");
		s.setName("abc");
		s.per();
	}
}
