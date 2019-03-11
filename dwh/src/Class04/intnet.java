package Class04;
public class intnet
{
	int userid;
	int password;
	String email;
	public intnet(int a,int b,String c)
	{
		this.userid=a;
		this.password=b;
		this.email=c;
	}
	void demo()
	{
		System.out.println("用户名："+userid);
		System.out.println("密码："+password);
		System.out.println("邮箱地址："+email);
	}
}
