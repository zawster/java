package pack;
interface A
{
	void fun();
	void fun1(int a);
}

class Interface implements A
{
	public void fun()
	{
		System.out.println("Fun is working :");
	}
	public void fun1(int a)
	{
		System.out.println("Value of fun1 is :"+a);
	}

	public static void main(String args[])
	{
		Interface obj= new Interface();
		obj.fun();
		obj.fun1(3);
	}

}