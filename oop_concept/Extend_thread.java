package oop_concept;
class Task extends Thread
// Extend thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Extend_thread {

	public static void main(String[] args) {
	  System.out.println("Task 1");
      Task T1= new Task();
      T1.run();
      System.out.println("Task 2");
      T1.start();
	}

}
