class ChildThread implements Runnable
{
Thread t;
ChildThread()
{
	t=new Thread(this,"ChildThread");
	System.out.println("thread created :"+t);
	t.start();
}
	public void run()
	{
	try
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println(t+"loop :"+i);
		Thread.sleep(500);
		}
	}
	catch(InterruptedException obj)
	{
		System.out.println("Thread   :"+t+"interrupted");
	}
	}
}
class joinDemo
{
	public static void main(String arg[])
	{
		ChildThread obj=new ChildThread();
		System.out.println(obj.t+"Is Alive ? :"+obj.t.isAlive());
		try
		{
			System.out.println("main Thread waiting for child thread to finish");
			obj.t.join();
			System.out.println("back to the main thread");
		}
		catch(InterruptedException e)
		{
		System.out.println("main Thread is interrupted");
		}
		System.out.println(obj.t+"Is Alive  ? :"+obj.t.isAlive());
		System.out.println("main Thread is exiting");
	}
}
