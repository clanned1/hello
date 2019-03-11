package bank;

import java.util.Scanner;

public class bank1
{
/*	1.银行业务办理程序
	2.欢迎，开户，存款，取款。在完成开户，存款取款后，都要提示余额信息
	3.退出的时候，提醒用户：携带好随身物品，欢迎下次光临*/
	static String user;//用户变量
	static double usermoney=0;//用户输入金额变量
	static int flag;//主菜单变量
	static double total=0;//用户总余额变量
	static double t;//接收取款金额变量
	public static void main(String[] args)
	{
		System.out.println("欢迎使用银行业务办理系统"+"\n"+"1.开户"+"\n"+"2.存款"+"\n"+"3.取款"+"\n"+"4.退出");
		while(flag!=4)
		{
		System.out.println("1.开户"+"\n"+"2.存款"+"\n"+"3.取款"+"\n"+"4.退出");
		System.out.print("请输入菜单序号选择需要办理的业务：");
		Scanner a=new Scanner(System.in);
		flag=a.nextInt();
		if(flag==1)
		{
			kaihu();
		}
		if(flag==2)
		{
			if(user==null)
			{
					System.out.println("\n"+"请先开户才能进行存款"+"\n");
			}
			else
			{
			total+=chuankuan();
			System.out.println("\n"+"存款成功！账户 "+ user +" 当前余额为："+total+"\n");
			}
		}
		if(flag==3)
		{			
			t = qukuan();
			if(total==0)
			{
				System.out.println("\n"+"账户余额为0，不能进行取款"+"\n");
			}
			else if(t>total)
			{
				System.out.println("\n"+"输入的取款金额大于账户余额，请重新输入"+"\n");
			}
			else
				{
				total-=t;
				System.out.println("\n"+"取款成功！账户 "+ user +" 当前余额为："+total+"\n");				
				}
		}
		if(flag==4)
		{
			System.out.println("\n"+"已退出系统，请携带好随身物品，欢迎下次光临"+"\n");
		}
		}
	}
	static void kaihu()
	{
		if(user!=null)
		{
			System.out.println("不能重复开户");
		}
		else
		{
		System.out.println("请输入用户名：");
		Scanner b=new Scanner(System.in);
		user=b.nextLine();
		System.out.println("\n"+"开户成功"+"\n"+"你的用户名为："+user+"\n"+"你的余额为："+usermoney+"\n");	
		}
	}
	static double chuankuan()
	{
		System.out.println("请输入存款金额：");	
		Scanner c=new Scanner(System.in);
		usermoney=c.nextInt();
		return usermoney;
	}
	static double qukuan()
	{
		if(user!=null) 
		{
		System.out.println("请输入取款金额：");	
		Scanner d=new Scanner(System.in);
		usermoney=d.nextInt();
		return usermoney;
		}
		else
		{
			System.out.println("\n"+"请先开户才能进行取款"+"\n");
		}
		return 0;
	}
}
