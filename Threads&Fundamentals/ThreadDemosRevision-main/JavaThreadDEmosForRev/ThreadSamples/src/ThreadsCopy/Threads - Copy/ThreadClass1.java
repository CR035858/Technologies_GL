class NewThread implements Runnable
{
Thread t;
NewThread()
{
t=new Thread(this,"ChildThread");
System.out.println("child Thread :" + t);
t.start();
}
public void run()
{
//implementing the run() method of the Runnable interface
System.out.println("Child Thread Started");
System.out.println("Exiting the child Thread");
}
}
class ThreadClass1
{
	public static void main(String arg[])
	{
		new NewThread();
		System.out.println("Main Thread Started");
		try
		{
		Thread.sleep(5000);
		//t.sleep(3000);
		}
		catch(InterruptedException e)
		{
		System.out.println("The main Thread Interrupted");
		}
		System.out.println("Exiting the Main Thread");
		}
	}
