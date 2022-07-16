package ComponentAndListners;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class Frame2 extends Frame
{
	List l;
	Choice c;
	TextArea ta;
	
	Frame2()
	{
		super("ListBox Demo");
		
		l = new List(4,true);//True means multiple items can be selected
		c = new Choice();
		ta = new TextArea(20,30);
		
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thirsday");
		l.add("Friday");
		l.add("Saterday");
		l.add("Sunday");
		
		c.add("January");
		c.add("Febuary");
		c.add("March");
		c.add("April");
		
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);
		
	
	}
	
	
	class Handler implements TextListener,ActionListener//Implemented Interfaces and overrides their methods
    {
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==l)
				ta.setText(l.getSelectedItem());
			else
				ta.setText(c.getSelectedItem());
			
		}
    
		@Override
        public void actionPerformed(ActionEvent ae)
        {
			String list[] = l.getSelectedItems();
			String txt = "";
			for(String x : list)
			txt+=x+"\n";
			
			ta.setText(txt);
        }

		@Override
		public void textValueChanged(TextEvent e) {
			// TODO Auto-generated method stub
			
		}

    }
}
public class ListBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame2 f = new Frame2();
		f.setVisible(true);
		f.setSize(400,400);

	}

}
