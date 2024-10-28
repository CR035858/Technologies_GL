class newThreadClass implements Runnable
{
	Thread t;
	newThreadClass()
	{
		t=new Thread(this,"ChildThread");
		System.out.println("Thread created : "+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(t+"loop  :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException obj)
		{
		System.out.println("Thread   :"+t+"Interrupted");
		}
	}
}
class IsAliveDemo
{
	public static void main(String arg[])
	{
		newThreadClass obj=new newThreadClass();
		System.out.println(obj.t+"Is Alive ? :"+obj.t.isAlive());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main Thread loop :"+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread is interrupted");

		}
		System.out.println(obj.t+"Is Alive  ? :"+obj.t.isAlive());
		System.out.println("Main Thread is exiting");
	}
}
