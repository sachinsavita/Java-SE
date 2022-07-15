package ComponentAndListners;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener
{
	int count = 0;
	Label l;
	Button b;
	
	public MyFrame()
	{
		
		l = new Label("     "+count);
		b = new Button("Click");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());//Layout to add components one after another
		
		//Adding components 
		add(b);
		add(l);
		
	}
	public void actionPerformed(ActionEvent e) {
			count++;
			l.setText("   "+count);
	}
}

public class ButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
		mf.setSize(500,500);
		

	}

}
