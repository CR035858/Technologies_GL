class Thread1
{
	void call()
	{
		System.out.println("First Statement");
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		System.out.println("Error "+e);
		}
		System.out.println("Second statement");
	}
}
class Thread2 extends Thread
{
Thread1 t;
	public Thread2(Thread1 t)
	{
	this.t=t;
	}
	public void run()
	{
	t.call();
	}
}
public class NotSynchronised
{
public static void main(String arg[])
{
Thread1 obj1=new Thread1();
Thread2 obja=new Thread2(obj1);
Thread2 objb=new Thread2(obj1);
obja.start();
objb.start();
}
}

