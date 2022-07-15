package ComponentAndListners;

import java.awt.*;
import java.awt.event.*;

class Frame1 extends Frame implements ActionListener
{
	TextArea ta;
	TextField tf;
	Label l;
	Button bt;
	
	Frame1()
	{
		super("Test Area Demo");
		l = new Label("No text entered ");
		ta = new TextArea(10,30);
		tf = new TextField(20);
		bt = new Button("Click");
		bt.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(ta);
		add(l);
		add(tf);
		
		add(bt);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
//		l.setText(ta.getSelectedText());
//		ta.append(" "+tf.getText()+" ");
		ta.insert(tf.getText(), ta.getCaretPosition());
		
	}
}
public class TextAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame1 f = new Frame1();
		f.setVisible(true);
		f.setSize(500,500);

	}

}
