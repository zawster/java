package pack;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A = "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) { }
			
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" Thread B = "+i);
		}
	}
}
class Threads
{
	public static void main(String args[])
	{
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();

		// priorites
		obj1.setPriority(7);
		obj2.setPriority(3);
	}
}