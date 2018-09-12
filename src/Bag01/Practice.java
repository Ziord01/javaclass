package Bag01;

public class Practice {
	public static void main(String[] args)
	{
		int a =10;//声明并初始化变量
		short x,y=10,z=20;//同时声明多个变量
		x =(short)(y+z);//这里为什么要强制转换？ 因为不能从int转换为short
		System.out.println("x的值是："+x);
		long b =12345678987654321l;/*常量后面这里为什么要加“l”字符 与之前的long相匹配*/
		System.out.println("b的值是："+b);
		b=a;	//隐形类型转换
		byte c;
		c=(byte)a;
		System.out.println("c的值是："+c);
			double pi=3.14159;
			float f=2.7f;
			System.out.println("pi="+pi);
			System.out.println("f="+f);
			int n=15,d=4;
			f=n/d;//f里面存储的值是什么
			System.out.println("f的值是："+f);
			int radius=10;
			double area=pi*radius*radius;//area存储的值是什么
			System.out.println("area="+area);
	}

}
