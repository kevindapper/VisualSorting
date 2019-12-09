import javax.swing.*;
import java.awt.*;
import java.util.Random;
//import java.lang.reflect.Array; 

public class SortingApp{

   public static final int WIDTH = 600;
   public static final int HEIGHT = 400;
   public static Random rand = new Random();
   public static int temp;
   public static JFrame frame = new JFrame("Visual Sorting");

   
   public static void main(String[] args) throws InterruptedException{
      
      frame.setSize(WIDTH,HEIGHT);
      frame.setResizable(false);
      frame.setLocationRelativeTo(null);  //centers frame
      frame.add(new Display());  //adds GUI to the window
      Setup.start();
   }
}