public class GarbageCollDemo
{
int mem=30000;
int[] arraya=new int[mem];
void occupymemory()
{
for(int i=0;i<mem;i++)
{
arraya[i]=i;
}
}
void DiscardArray()
{
for(int i=0;i<mem;i++)
{
arraya[i]=0;
}
}
public static void main(String arg[])
{
GarbageCollDemo gc=new  GarbageCollDemo();
Runtime r=Runtime.getRuntime();
//Determine the current amount of free memory.
long freemem=r.freeMemory();
System.out.println("Initial Free memory before creating array :"+freemem);
//deternmine the amount of memory after garbage collection.
r.gc();
freemem=r.freeMemory();
System.out.println("Free memory after garbage collection :"+freemem);
//consume some memory
gc.occupymemory();
//Determine amount of memory left after consumption.
freemem=r.freeMemory();
System.out.println("Free memory after creating array :"+freemem);
System.out.println("Discarding the array ........");
//Discard the array

gc.DiscardArray();
//Run the garbage collector
r.gc();
freemem=r.freeMemory();
System.out.println("Free memory after running gc()  :"+freemem);
}
}
