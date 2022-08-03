package Intro;
class MyThread extends Thread
{
	public void run()
	{
		int i =1;
		while(true)
		{
			System.out.println(i+" My Thread");
			i++;
		}  
	}
}
public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread t = new MyThread();
		t.start();

		int i =1;
		while(true)
		{
			System.out.println(i+" Main");
			Thread.yield(); // give chance to other threads to execute
			i++;
		}
	}

}
