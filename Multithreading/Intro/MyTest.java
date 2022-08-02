package Intro;

class My implements Runnable
{
	public void run()
	{
		int i = 1;
		while(true)
		{
			System.out.println(i+" Hello");
			i++;
		}
	}
}

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My m = new My();
		Thread t = new Thread(m);   // Have to take object of Thread class when ussing Runnable interface
		t.start();
		
		int i = 1;
		while(true)
		{
			System.out.println(i+" World");
			i++;
		}

	}

}
