package ComponentAndListners;

import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame
{
	
	Label l1,l2;
	TextField tf;
	
	//Constructor
	public MyFrame3()
	{
		super("Text Field Demo");
		l1 = new Label("No text is entered yet");
		l2 = new Label("Enter key is not yet hit");
		tf = new TextField(20);
		
		tf.setEchoChar('*');  //To hide the password
		
		
		//handlerclass  object for TextListener,ActionListener 
		Handler h=new Handler();
		tf.addTextListener(h);
		tf.addActionListener(h);
		
		
		//Setting layout
		setLayout(new FlowLayout());
		//Adding components
		add(l1);
		add(tf);
		add(l2);
		
	}
		class Handler implements TextListener,ActionListener//Implemented Interfaces and overrides their methods
	    {
			@Override
	        public void textValueChanged(TextEvent te)
	        {
	             l1.setText(tf.getText());
	        }
	    
			@Override
	        public void actionPerformed(ActionEvent ae)
	        {
	            l2.setText(tf.getText());
	        }
	    }
		
}
public class TextFieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object of class Frame
		MyFrame3 mf = new MyFrame3();
		mf.setVisible(true);
		mf.setSize(500,500);
	}

}
