package Class05;

public class teststudent
{
		static String schoolname;
	public static void main(String[] args)
	{
		student s=new student();
		student t=new student();
		s.student("clanned", "男", 18);
		s.setAge(s.getAge()+1);
		if(s.getAge()<20) {
		s.outinfo();
		}
		graduatestudent g=new graduatestudent();
		g.graduatestudent("clanned", "男", 18, "网瘾戒除与治疗", "杨教授");
		g.outinfo();
		setschool();
	}
	public static void setschool()
	{
		schoolname="先疯";
		System.out.println("学校名为："+schoolname);
	}
}
