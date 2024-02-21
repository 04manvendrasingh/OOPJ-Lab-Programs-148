//Thread Program
class NewThread implements Runnable
{ Thread t;
   NewThread()
   {
     t=new Thread(this, "NThread");
	 System.out.println("CT:"+t);
	 t.start();
   }
   
  public void run()
   {
	   try
	   {
		   for(int n=10;n>0;n--)
		   {
			 System.out.println("BMS COLLEGE OF ENGG");
			 Thread.sleep(10000);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("Child Thread Interrupted");
	   }
	   System.out.println("Child Thread quitting");
   }
}

class BMSThread
{
	public static void main(String ss[])
	{
		new NewThread();
		System.out.println("Back in main");
		
		try
		{
			for(int n=10;n>0;n--)
			{
				System.out.println("CSE");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Main Thread quitting");
	}
}