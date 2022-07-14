import java.awt.*;

public class AFirstApp extends Frame
{
    Label l;
    TextField tf;
    Button b;
    
    public AFirstApp()
    {
        super("My App");
        
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);   
        
    }  
    public static void main(String[] args) 
    {
        AFirstApp f=new AFirstApp();
        f.setSize(400,400);
        f.setVisible(true);
    } 
}