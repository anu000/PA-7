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
   import java.util.Scanner;
   
   public class Calculator extends JFrame implements ActionListener{
      JButton button1;
      JButton button2;
      JButton button3;
      JButton button4;
      JButton button5;
      JButton button6;
      JButton button7;
      JButton button8;
      JButton button9;
      JButton buttonPlus;
      JButton buttonMinus;
      JButton buttonEnter;
      
      static Scanner scnr = new Scanner(System.in);
      
      public Calculator(){
      
      //grid background to create over all 
       GridBagConstraints g  = new GridBagConstraints();
         setLayout(new GridBagLayout());
         g.insets = new Insets(50,50,1,0);
         g.fill = GridBagConstraints.HORIZONTAL;
         g.gridx = 0;
         g.gridy=0;
         setTitle("Calculator"); //add title name "Calculator"
         
      //button 1 
      button1 = new JButton("1");
      g.insets = new Insets(0,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 5;
      g.gridy=4;
      add(button1,g); 
      
      //button 2
      button2 = new JButton("2");
      g.insets = new Insets(0,6,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 6;
      g.gridy=4;
      add(button2,g); 
      
      //button 3
      button3 = new JButton("3");
      g.insets = new Insets(0,7,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 7;
      g.gridy=4;
      add(button3,g);
      
      //button 4
      button4 = new JButton("4");
      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 5;
      g.gridy=3;
      add(button4,g);  
      
      //button 5
      button5 = new JButton("5");
      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 6;
      g.gridy=3;
      add(button5,g); 
      
      //button 6
      button6 = new JButton("6");
      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 7;
      g.gridy=3;
      add(button6,g); 
      
      //button 7
      button7 = new JButton("7");
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 5;
      g.gridy=2;
      add(button7,g); 
      
      //button 8
      button8 = new JButton("8");
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 6;
      g.gridy=2;
      add(button8,g);
      
      //button 9
      button9 = new JButton("9");
      button9.addActionListener(
      new ActionListener(){
         public void actionPerformed(ActionEvent event){
         
         }
      }
      );
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 7;
      g.gridy=2;
      add(button9,g);
      
      //enter button
      buttonEnter = new JButton("Enter");
      buttonEnter.addActionListener(
      new ActionListener(){
            public void actionPerformed(ActionEvent event){
            getAnswer = true;
            }
         }
      );
      g.insets = new Insets(0,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 8;
      g.gridy=4;
      add(buttonEnter,g);
      
      //plus button
      buttonPlus = new JButton("+");
      buttonPlus.addActionListener(
      new ActionListener(){
            public void actionPerformed(ActionEvent event){
            operation = "+";
            }
         }
      );
      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 8;
      g.gridy=3;
      add(buttonPlus,g); 
      
      //minus button
      buttonMinus = new JButton("-");
      buttonMinus.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
            operation = "-";
            }
         }
      );//end action listener
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 8;
      g.gridy=2;
      add(buttonMinus,g);
         
      }
      static String operation = "";
      static boolean getAnswer = false;
      static int firstDigit = 0;
      static int secondDigit = 0;
      static int intAnswer = 0;
       
      @Override
   public void actionPerformed(ActionEvent event){                 
   }  
      
      
       public static void main(String[] args){
        
        if (getAnswer == true){
            if (operation == "+"){
               intAnswer = firstDigit + secondDigit;
            }
            else if (operation == "-"){
               intAnswer = firstDigit - secondDigit;
            }
            System.out.println(intAnswer);
        }
        
         
        Calculator s = new Calculator(); //creates a new calculator frame
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//calls on the exit on close variable 
        
        //display the window
        s.pack();
        s.setVisible(true);//allows user to see 
        
        
        
        
        
      }
   
      
   }
