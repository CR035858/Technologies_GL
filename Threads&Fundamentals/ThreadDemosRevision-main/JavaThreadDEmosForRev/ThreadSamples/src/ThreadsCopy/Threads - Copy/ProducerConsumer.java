class Thread1
{
	int d;
	synchronized void getData()
	{
		System.out.println("Got Data :"+d);
	}
	synchronized void putData(int d)
	{
			this.d=d;
			System.out.println("Put Data :"+d);
	}
}
class producer extends Thread
{
	Thread1 t;
	public producer(Thread1 t)
	{
		this.t=t;
	}
	public void run()
	{
	int data=700;
	while(true)
	{
	System.out.println("Put Called by producer");
	t.putData(data++);
	}
	}
}
class consumer extends Thread
{
Thread1 t;
public consumer(Thread1 t)
{
this.t=t;
}
public void run()
{
while(true)
{
System.out.println("Get Called by consumer");
t.getData();
}
}
}
public class ProducerConsumer
{
public static void main(String arg[])
{
Thread1 obj1=new Thread1();
producer p=new producer(obj1);
consumer c=new consumer(obj1);
p.start();
c.start();
}
}

