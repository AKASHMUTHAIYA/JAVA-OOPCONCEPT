package oop_concept;

public class Implement_thread {

	public static void main(String[] args) {
		Thread thread1=new Thread(new MyRunnable("Thread1"));
		Thread thread2=new Thread(new MyRunnable("Thread2"));
		thread2.start();
		thread1.start();  
	}
}
class MyRunnable implements Runnable
{
	public MyRunnable(String name) {
		super();
	}

	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}


