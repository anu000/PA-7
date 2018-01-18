 import java.awt.GridBagConstraints;
   import java.awt.GridBagLayout;
   import java.awt.Insets;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   import java.text.NumberFormat;
   import java.util.ArrayList;
   import javax.swing.JButton;
   import javax.swing.JFormattedTextField;
   import javax.swing.JFrame;
   import javax.swing.JLabel;
   import javax.swing.JOptionPane;
   import javax.swing.JTable;
   import javax.swing.JTextField;
   import java.awt.Color;
   import java.awt.Graphics;
   import java.awt.Graphics2D;
   import java.awt.Rectangle; 
   import javax.swing.JComponent;
   
   public class Calculator extends JFrame{
      JButton button1;
   
      public Calculator(){
      
      //grid background to create over all 
       GridBagConstraints g  = new GridBagConstraints();
         setLayout(new GridBagLayout());
         g.insets = new Insets(50,50,1,0);
         g.fill = GridBagConstraints.HORIZONTAL;
         g.gridx = 0;
         g.gridy=0;
         
      //button 1 
      button1 = new JButton("1");
      g.insets = new Insets(0,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 5;
      g.gridy=4;
      add(button1,g);  
         
      }
      
      
       public static void main(String[] args){
         Calculator s = new Calculator(); //creates a new calculator frame
         s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//calls on the exit on close variable 
                  
        //display the window
        s.pack();
        s.setVisible(true);//allows user to see 
      }
   
      
   }
