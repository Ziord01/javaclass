package Bag01;

public class Practice {
	public static void main(String[] args)
	{
		int a =10;//��������ʼ������
		short x,y=10,z=20;//ͬʱ�����������
		x =(short)(y+z);//����ΪʲôҪǿ��ת���� ��Ϊ���ܴ�intת��Ϊshort
		System.out.println("x��ֵ�ǣ�"+x);
		long b =12345678987654321l;/*������������ΪʲôҪ�ӡ�l���ַ� ��֮ǰ��long��ƥ��*/
		System.out.println("b��ֵ�ǣ�"+b);
		b=a;	//��������ת��
		byte c;
		c=(byte)a;
		System.out.println("c��ֵ�ǣ�"+c);
			double pi=3.14159;
			float f=2.7f;
			System.out.println("pi="+pi);
			System.out.println("f="+f);
			int n=15,d=4;
			f=n/d;//f����洢��ֵ��ʲô
			System.out.println("f��ֵ�ǣ�"+f);
			int radius=10;
			double area=pi*radius*radius;//area�洢��ֵ��ʲô
			System.out.println("area="+area);
	}

}
