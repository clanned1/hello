package Class;

		// TODO Auto-generated method stub
	public	class Cat
		{
			public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public int getSize()
		{
			return size;
		}
		public void setSize(int size)
		{
			if(size<0)
			{
				System.out.println("输入错误");
			}
			else{this.size = size;}
		}
			private String name;
			private int size;
		 void a()
		{
		System.out.println("我叫"+name+"我的身长有"+size);			
		}
		
	}
