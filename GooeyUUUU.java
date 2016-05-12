import java.awt.*;
import java.awt.event.*;

public class GooeyUUUU extends Frame implements ActionListener, WindowListener, KeyListener{
  private Label label;
  private TextField text;
  private TextField text2;
  private Button button;
  private Button button2;
  private Button button3;
  private int term=0;
  private int sum=0;
  
  public GooeyUUUU(){
    setLayout(new FlowLayout());
    label = new Label("A Label!");
    add(label);
    text = new TextField("Enter term here", 20);
    text.setEditable(true);
    add(text);
    text2 = new TextField("Sum will be here", 20);
    text2.setEditable(false);
    add(text2);
    text.addKeyListener(this);
    button = new Button("ADD");
    add(button);
    button.addActionListener(this);
    /*button2 = new Button("CONFIRM");
    add(button2);
    button2.addActionListener(this);*/
    button3 = new Button("ZERO");
    add(button3);
    button3.addActionListener(this);
    addWindowListener(this);
    setTitle("GOOEYUUUU");
    setSize(350, 100);
    setVisible(true);}
public void windowClosing(WindowEvent event){System.exit(9001);}
public void windowOpened(WindowEvent event){}
public void windowClosed(WindowEvent event){}
public void windowIconified(WindowEvent event){}
public void windowDeiconified(WindowEvent event){}
public void windowActivated(WindowEvent event){}
public void windowDeactivated(WindowEvent event){}
public void keyTyped(KeyEvent event){}
public void keyPressed(KeyEvent event){
//if(event.getKeyChar()=='u'){count = count + 1;}
//text.setText(Integer.toString(count));
}
public void keyReleased(KeyEvent event){}
  public void actionPerformed(ActionEvent event){
    //System.out.println("UP");
    if(event.getActionCommand().equals("ADD")){
term = Integer.parseInt(text.getText());      
sum = sum + term;}
    //if(event.getActionCommand().equals("CONFIRM")){}
    if(event.getActionCommand().equals("ZERO")){
      sum = 0;}
    text2.setText(Integer.toString(sum));}
  public static void main(String[] args){
    GooeyUUUU gui = new GooeyUUUU(); //anonymous instance, because it's not got a name to itself
  }
} 
