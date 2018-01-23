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
   
   public class Calculator extends JFrame implements ActionListener{
            
      //create buttons with JButton
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
      
      static int firstDigit = 0;//creates a first digit variable
      static boolean add = true;//creates a boolean to determine add or subtract
      
      private JLabel displayAnswerLabel; //display answer variable's label
      private JTextField displayAnswerField; //display answer variable's field
      
      public Calculator(){//constructor
      
      //grid background to create over all 
       GridBagConstraints g  = new GridBagConstraints();
         setLayout(new GridBagLayout());
         g.insets = new Insets(50,50,1,0);
         g.fill = GridBagConstraints.HORIZONTAL;
         g.gridx = 0;//sets the origin
         g.gridy=0;//sets the origin
         setTitle("Calculator"); //add title name "Calculator"
         
      //button 1 
      button1 = new JButton("1");//name button 1
      button1.addActionListener(//add the action listener
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//action listener imbedded method for button 1
        
            if(add==true){//if add is true 
               firstDigit = firstDigit + 1;//add 1 to the firstDigit variable
            }
            else{//if add is false
               firstDigit = firstDigit-1;//subtract 1 
            }
            
         }
      }
      );

      g.insets = new Insets(0,5,10,10);//dimensions 
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 5;//location on grid (x-axis) for the button 
      g.gridy=4;// location on grid(y-axis) for the button 
      add(button1,g); //adds the button to the grid 
      
      //button 2
      button2 = new JButton("2");//name buton 2
      button2.addActionListener(//add the action listener
      new ActionListener(){
         public void actionPerformed(ActionEvent event){///action listener imbedded method for button 2
            if(add==true){//if add is true
               firstDigit = firstDigit + 2;//add 2 to the variable
            }
            else{//if add is false
               firstDigit = firstDigit-2;//subtract 2 from the variable
            }
         }
      }
      );

      g.insets = new Insets(0,6,10,10);// dimensions 
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 6;//location of button on x axis
      g.gridy=4;//location of button on y axis 
      add(button2,g); //adds second button to the grid at location g
      
      //button 3
      button3 = new JButton("3");//name button 3
      button3.addActionListener(//add action listener for button 3 
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//action listener imbedded method for button 3
            if(add==true){//if add is true
               firstDigit = firstDigit + 3;//add 2 to the variable
            }
            else{//if add is false
               firstDigit = firstDigit-3;//add 3 to the variable
            }
         }
      }
      );

      g.insets = new Insets(0,7,10,10);//sets dimensions and location 
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 7;//location along x axis 
      g.gridy=4;//location along y axis 
      add(button3,g);//adds button 3 in the specified location 
      
      //button 4
      button4 = new JButton("4");//name button 4
      button4.addActionListener(//add action listener for button 4
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//action listener method for button 4
            if(add==true){//if add is true
               firstDigit = firstDigit + 4;//add 4 to the variable
            }
            else{//if add is false
               firstDigit = firstDigit-4;//subtract 4 to the variable
            }
         }
      }
      );

      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 5;//location on x axis 
      g.gridy=3;//location on y axis
      add(button4,g);  //adds button 4 in specified location
      
      //button 5
      button5 = new JButton("5");//name button 5
      button5.addActionListener(//add action listener to button 5
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//action listener method for button 5
            if(add==true){//if add is true
               firstDigit = firstDigit + 5; //add 5 to the variable
            }
            else{// if add is false
               firstDigit = firstDigit-5;//subtract 5 from the variable
            }
         }
      }
      );
      //same button set up as above 
      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 6;
      g.gridy=3;
      add(button5,g); 
      
      //button 6
      button6 = new JButton("6");//name button 6
      button6.addActionListener(//add action listener to button 6
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//imbedded action listener method for button 6
            if(add==true){//if add is true
               firstDigit = firstDigit + 6;//add 6 to variable
            }
            else{//if add is false
               firstDigit = firstDigit-6;//subtract 6 from variable
            }
         }
      }
      );
      //same button set up as above 
      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 7;
      g.gridy=3;
      add(button6,g); 
      
      //button 7
      button7 = new JButton("7");//name button 7
      button7.addActionListener(//add action listener to button 7
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//imbedded action listener method for button 7
            if(add==true){//if add is true
               firstDigit = firstDigit + 7;//add 7 to the variable
            }
            else{//if add is false
               firstDigit = firstDigit-7;//subtract 7 from the variable
            }
         }
      }
      );
      //same button set up as above 
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 5;
      g.gridy=2;
      add(button7,g); 
      
      //button 8
      button8 = new JButton("8");//name button 8 
      button8.addActionListener(//add action listener to button 8
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//action listener imbedded method for button 8
            if(add==true){//if add is true
               firstDigit = firstDigit + 8;//add 8 to the variable
            }
            else{//if add is false
               firstDigit = firstDigit-8;//subtract 8 from the variable
            }
         }
      }
      );
      //same button set up as above 
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 6;
      g.gridy=2;
      add(button8,g);
      
      //button 9
      button9 = new JButton("9");//name button 9
      button9.addActionListener(//add action listener to button 9
      new ActionListener(){
         public void actionPerformed(ActionEvent event){//imbedded action listener method for button 9
            if(add==true){//if add is true
               firstDigit = firstDigit + 9;//add 9 to the variable
            }
            else{//if add is false
               firstDigit = firstDigit-9;//subtract 9 from the variable
            }
         }
      }
      );
      //same button set up as above 
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 7;
      g.gridy=2;
      add(button9,g);
      
      //displaying answer in calculator interface
      
      displayAnswerLabel = new JLabel("Answer");//label for displaying answer
      displayAnswerField = new JFormattedTextField(NumberFormat.getIntegerInstance());//formatted text field for answer displayed to be an integer
      displayAnswerField = new JTextField(15);//text field for displaying answer
      displayAnswerField.setEditable(false);//displaying answer not editable
      
      g = new GridBagConstraints();
      g.insets = new Insets(10, 0, 1, 10);
      g.gridx = 10;
      g.gridy = 1;
      add(displayAnswerLabel, g);

      g = new GridBagConstraints();
      g.insets = new Insets(1, 0, 10, 10);
      g.gridx = 10;
      g.gridy = 2;
      add(displayAnswerField, g);
            
      //enter button
      buttonEnter = new JButton("Enter");//name enter button
      buttonEnter.addActionListener(//add action listener to enter button
      new ActionListener(){
            public void actionPerformed(ActionEvent event){//imbedded action listener method for enter button
            displayAnswerField.setText(Integer.toString(firstDigit));//set text integer made string and display to interface                  
            }
         }
      );
      //same button set up as above 
      g.insets = new Insets(0,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 8;
      g.gridy=4;
      add(buttonEnter,g);
    
      //plus button
      buttonPlus = new JButton("+");//name plus button
      buttonPlus.addActionListener(//add action listener to plus button
      new ActionListener(){
            public void actionPerformed(ActionEvent event){//action listener imbedded method for plus button
            add = true;//set add to true which is same as default
            }
         }
      );
      //same button set upas above 
      g.insets = new Insets(1,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 8;
      g.gridy=3;
      add(buttonPlus,g); 
      
      //minus button
      buttonMinus = new JButton("-");//name minus button
      buttonMinus.addActionListener(//add action listener to minus button
         new ActionListener(){
            public void actionPerformed(ActionEvent event){//action listener imbedded method for minus button
            add = false;//add is set to false when minus button is pressed
            }
         }
      );//end action listener
      g.insets = new Insets(2,5,10,10);
      g.fill = GridBagConstraints.HORIZONTAL;
      g.gridx = 8;
      g.gridy=2;
      add(buttonMinus,g);
         
      }//end of constructor
      
      
      @Override
   public void actionPerformed(ActionEvent event){              
   }  

       public static void main(String[] args){//main method
         
        Calculator s = new Calculator(); //creates a new calculator frame
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//calls on the exit on close variable 
        
        //display the window
        s.pack();
        s.setVisible(true);//allows user to see 
        
      }
   
      
   }
