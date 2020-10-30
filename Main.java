import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JLabel firstNumberLabel;
  JLabel secondNumberLabel;
  JLabel resultLabel;

  JTextField firstNumberInput;
  JTextField secondNumberInput;
  JTextField resultField;

  JButton addButton;
  JButton subButton;
  JButton mulButton;
  JButton divButton;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
    // initialize the main JPanel 
    mainPanel = new JPanel();
    // turn on manual layouts 
    mainPanel.setLayout(null); 
    // add the panel to the JFrame to see it 
    frame.add(mainPanel);


    // create the labels so the user knows what to enter 
    firstNumberLabel = new JLabel("First Number");
    secondNumberLabel = new JLabel("Second Number");
    resultLabel = new JLabel("Result");

    // set the location and size of the labels 
    firstNumberLabel.setBounds(50, 100, 120, 20);
    secondNumberLabel.setBounds(50, 140, 120, 20);
    resultLabel.setBounds(50, 180, 120, 20);

    // add the labels to the main panel 
    mainPanel.add(firstNumberLabel);
    mainPanel.add(secondNumberLabel);
    mainPanel.add(resultLabel);
    

    // initialize the JTextFields 
    firstNumberInput = new JTextField();
    secondNumberInput = new JTextField();
    resultField = new JTextField();

    // set the location and size of the JTextFields 
    firstNumberInput.setBounds(230, 100, 240, 20);
    secondNumberInput.setBounds(230, 140, 240, 20);
    resultField.setBounds(230, 180, 240, 20);

    // disable the result field so user cannot type in it 
    resultField.setEnabled(false);

    // add the input to the main panel 
    mainPanel.add(firstNumberInput);
    mainPanel.add(secondNumberInput);
    mainPanel.add(resultField);


    // initialize the buttons 
    addButton = new JButton("Add");
    subButton = new JButton("Sub");
    mulButton = new JButton("Mul");
    divButton = new JButton("Div");

    // add actionListener to the buttons 
    addButton.addActionListener(this);
    subButton.addActionListener(this);
    mulButton.addActionListener(this);
    divButton.addActionListener(this);

    // give each button an action command 
    addButton.setActionCommand("add");
    subButton.setActionCommand("sub");
    mulButton.setActionCommand("mul");
    divButton.setActionCommand("div");

    // set the location and size of the buttons
    addButton.setBounds(50, 250, 90, 20);
    subButton.setBounds(160, 250, 90, 20);
    mulButton.setBounds(270, 250, 90, 20);
    divButton.setBounds(380, 250, 90, 20);

    // add the buttons to the mainPanel 
    mainPanel.add(addButton);
    mainPanel.add(subButton);
    mainPanel.add(mulButton);
    mainPanel.add(divButton);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    // get the text as a string
    String firstText = firstNumberInput.getText();
    String secondText = secondNumberInput.getText();

    // convert from string to double 
    double firstNumber = Double.parseDouble(firstText);
    double secondNumber = Double.parseDouble(secondText);

    if(command.equals("add")){
      // add the two numbers together
      double addSum = (firstNumber + secondNumber);
      // convert double to String
      String addSumResult = String.valueOf(addSum);
      // resultField will display the answer
      resultField.setText(addSumResult);
    
      }else if(command.equals("sub")){
        // subtract the two numbers
        double subSum = (firstNumber - secondNumber);
        // convert double to String
        String subSumResult = String.valueOf(subSum);
        // resultField will display the answer
        resultField.setText(subSumResult);
      
      }else if(command.equals("mul")){
        // multiply the two numbers together
        double mulSum = (firstNumber * secondNumber);
        // convert double to String
        String mulSumResult = String.valueOf(mulSum);
        // resultField will display the answer
        resultField.setText(mulSumResult);
      
      }else if(command.equals("div")){
        // divide the two numbers together
        double divSum = (firstNumber / secondNumber);
        // convert double to String
        String divSumResult = String.valueOf(divSum);
        // resultField will display the answer
        resultField.setText(divSumResult);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
