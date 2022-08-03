package Intro;

class My implements Runnable
{
	public void run()
	{
		int i = 1;
		while(true)
		{
			System.out.println(i+" Hello");
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My m = new My();
		Thread t = new Thread(m);   // Have to take object of Thread class when ussing Runnable interface
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		System.out.println(t.getState());
		
		int i = 1;
		while(i<10)
		{
			System.out.println(i+" World");
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
		System.out.println("ID: " + t.getId());
		System.out.println("Name: " + t.getName());
		System.out.println("Priority: " + t.getPriority());
		System.out.println("Alive: " + t.isAlive());

	}

}
