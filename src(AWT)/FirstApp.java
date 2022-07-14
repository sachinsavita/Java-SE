

import java.awt.*;
	
public class FirstApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Created the frame and set the layout
		Frame f = new Frame("My first App");
		f.setLayout(new FlowLayout());
		
		
		//Created Components
		Button b = new Button("ok");
		Label l = new Label("Name ");
		TextField tf = new TextField(20);
		
		//Added components to the frame
		f.add(l);
		f.add(tf);
		f.add(b);
		
		
		//Setting the frame size
		f.setSize(500,500);
		f.setVisible(true);
	}
	

}
