import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display extends JPanel{   //means that Display is apart of the JPanel class
   //fields
   
   //constructor
   public Display() {
      setLayout(null);  //JPanel method
   }
   
   //methods
   
   @Override
   public void paintComponent(Graphics g){  //Graphics G is an implicit object, no need to create one
      super.paintComponent(g); //super is used to call a method from the parent-class or super-class (JPanel)
      setBackground(Color.BLACK); //calling variable white from Color class
      g.setColor(Color.WHITE);
      for(int i = 0; i < Setup.size; i++){
         g.drawLine(i, SortingApp.HEIGHT, i, SortingApp.HEIGHT - Setup.list[i]);   //prints line between two points; begin at height because that is the bottom of the window
      }
   }
   
}