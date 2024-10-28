class ThreadDemo extends Thread
{
	ThreadDemo()
	{
	super("ChildThread");//Calls the superclass constructor
	System.out.println("ChildThread :"+this);
	start();
	}
	public void run()
	{
		System.out.println("The child thread started ");
		System.out.println("Exiting the child thread");
	}
}
class ThreadDemoClass
{
	public static void main(String arg[])
	{
		new ThreadDemo();
		System.out.println("the main thread started");
		System.out.println("The main thread is about to sleep");
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		System.out.println("the main thread interrupted");
		}
		System.out.println("After 1 Second:Exiting main Thread");

	}
}


















































