//Second approach

package Basics;
import java.awt.*;



class MyFrame extends Frame
{
	Label l;
	TextField tf;
	Button bt;
	
	public MyFrame()
	{
		super("My App");
		setLayout(new FlowLayout());
		
		l = new Label("Name");
		tf = new TextField(20);
		bt = new Button("OK");
		
		add(l);
		add(tf);
		add(bt);
	}
}


public class SecondApp {       //Third approach//extends Frame {
//
//	Label l;
//	TextField tf;
//	Button bt;
//	
//	public SecondApp()
//	{
//		super("My App");
//		setLayout(new FlowLayout());
//		
//		l = new Label("Name");
//		tf = new TextField(20);
//		bt = new Button("OK");
//		
//		add(l);
//		add(tf);
//		add(bt);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		MyFrame mf= new MyFrame();
//		SecondApp mf= new SecondApp();
		mf.setVisible(true);
		mf.setSize(500,500);

	}

}
