class newThreadClass implements Runnable
{
	//Thread t;
	String ThreadName;
	newThreadClass(String name)
	{
		ThreadName=name;
		Thread t=new Thread(this, ThreadName);
		System.out.println("Thread created :"+t);
		t.start();
	}
	public void run()
	{
		try
		{
		for(int i=1;i<=5;i++)
		{
		System.out.println(ThreadName +"loop :"+i);
		//t.sleep(1000);
		Thread.sleep(1000);
		}
		}
		catch(InterruptedException obj)
		{
			System.out.println("Thread :"+ThreadName+"interrupted");
		}
	System.out.println(ThreadName +"is exiting");
	}
}
class MultipleThread
{
	public static void main(String arg[])
	{
		new newThreadClass("FirstChildThread");
		new newThreadClass("SecondChildThread");
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main Thread loop :"+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException obj)
		{
			System.out.println("Main Thread is interrupted");
		}
		System.out.println("main Thread is terminating now");
	}
}