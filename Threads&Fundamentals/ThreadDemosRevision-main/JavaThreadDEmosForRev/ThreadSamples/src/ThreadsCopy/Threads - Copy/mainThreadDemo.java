//public static Thread currentThread();
class mainThreadDemo
{
public static void main(String args[])
{
Thread t=Thread.currentThread();
System.out.println("The current thread :"+t);
t.setName("MainThread");
System.out.println("The current thread after name change :"+t);
System.out.println("The current thread is going to sleep for 5 seconds");
try
{
t.sleep(5000);
}
catch(InterruptedException e)
{
System.out.println("Main thread interrupted");
}
System.out.println("After 5 seconds...............the current Thread is exiting now.");
}
}

