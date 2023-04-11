package calculator;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;  
public class Calculator { 
  JFrame frame = new JFrame("Calculator");  
  JPanel panelTop = new JPanel(new GridLayout(1,1)); 
  JPanel panelLeft = new JPanel(new GridLayout(3,3)); 
  JPanel panelRight = new JPanel(new GridLayout(4,1)); 
  JPanel panelBottom = new JPanel(new GridLayout(1,3));  
  JTextField txtScreen = new JTextField(20); 
  JButton btn1 = new JButton("1"); 
  JButton btn2 = new JButton("2"); 
  JButton btn3 = new JButton("3"); 
  JButton btn4 = new JButton("4"); 
  JButton btn5 = new JButton("5"); 
  JButton btn6 = new JButton("6"); 
  JButton btn7 = new JButton("7"); 
  JButton btn8 = new JButton("8"); 
  JButton btn9 = new JButton("9"); 
  JButton btnDiv = new JButton("/"); 
  JButton btnMult = new JButton("*"); 
  JButton btnMinus = new JButton("-"); 
  JButton btnPlus = new JButton("+"); 
   
  JButton buttonClear = new JButton("Clear"); 
  JButton button0 = new JButton("0"); 
  JButton buttonEqual = new JButton("=");   
  JButton buttons[] = {buttonClear,button0,buttonEqual};
  public void CreateAndShowGUI(){       
      panelTop.add(txtScreen);       
      panelLeft.add(btn7);       
      panelLeft.add(btn8);       
      panelLeft.add(btn9);       
      panelLeft.add(btn4);       
      panelLeft.add(btn5);       
      panelLeft.add(btn6);       
      panelLeft.add(btn1);       
      panelLeft.add(btn2); 
      panelLeft.add(btn3);       
      panelRight.add(btnDiv);       
      panelRight.add(btnMult);       
      panelRight.add(btnMinus);       
      panelRight.add(btnPlus);       
      panelBottom.add(buttons[0]);       
      panelBottom.add(buttons[1]);       
      panelBottom.add(buttons[2]);       
      btn7.addActionListener(new Button7Click());       
      btn8.addActionListener(new Button8Click());       
      btn9.addActionListener(new Button9Click());       
      btn4.addActionListener(new Button4Click());       
      btn5.addActionListener(new Button5Click());       
      btn6.addActionListener(new Button6Click());       
      btn1.addActionListener(new Button1Click());       
      btn2.addActionListener(new Button2Click());       
      btn3.addActionListener(new Button3Click());       
      btnDiv.addActionListener(new ButtonDivClick());       
      btnMult.addActionListener(new ButtonMultiClick());      
      btnMinus.addActionListener(new ButtonMinusClick());       
      btnPlus.addActionListener(new ButtonPlusClick());       
      buttonClear.addActionListener(new ButtonClearClick());       
      button0.addActionListener(new Button0Click());       
      buttonEqual.addActionListener(new ButtonEqualClick());       
      frame.getContentPane().add(panelTop,BorderLayout.NORTH);       
      frame.getContentPane().add(panelLeft,BorderLayout.WEST);       
      frame.getContentPane().add(panelRight,BorderLayout.EAST);       
      frame.getContentPane().add(panelBottom,BorderLayout.SOUTH);       
      frame.setSize(300,200);       
      frame.setVisible(true); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      } 
       
      private class Button7Click implements ActionListener{ 
           @Override
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();           
              txtScreen.setText(str + "7"); 
                   
         }           
      } 
       
     private class Button8Click implements ActionListener{ 
          @Override         
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();          
              txtScreen.setText(str + "8"); 
                   
         }           
      } 
     private class Button9Click implements ActionListener{ 
          @Override           
          public void actionPerformed(ActionEvent e){           
              String str = txtScreen.getText();           
              txtScreen.setText(str + "9"); 
                   
         }           
      } 
     private class Button4Click implements ActionListener{ 
          @Override           
          public void actionPerformed(ActionEvent e){ 
          String str = txtScreen.getText();
          txtScreen.setText(str + "4"); 
                   
         }           
      } 
      
     private class Button5Click implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();           
              txtScreen.setText(str + "5"); 
                   
         }           
      } 
     private class Button6Click implements ActionListener{ 
          @Override           
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();           
              txtScreen.setText(str + "6"); 
                   
         }           
      } 
     private class Button3Click implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){        
              String str = txtScreen.getText();           
              txtScreen.setText(str + "3"); 
                   
         }           
      } 
     private class Button2Click implements ActionListener{ 
          @Override 
         public void actionPerformed(ActionEvent e){          
             String str = txtScreen.getText();           
             txtScreen.setText(str + "2"); 
                   
         }           
      } 
     private class Button1Click implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();          
              txtScreen.setText(str + "1"); 
                   
         }           
      } 
     private class Button0Click implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();           
              txtScreen.setText(str + "0"); 
                   
         }           
      } 
     private class ButtonPlusClick implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();          
              txtScreen.setText(str + "+"); 
                   
         }           
      } 
     private class ButtonMinusClick implements ActionListener{
         @Override 
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();           
              txtScreen.setText(str + "-"); 
                   
         }           
      } 
     private class ButtonDivClick implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){          
              String str = txtScreen.getText();          
              txtScreen.setText(str + "/"); 
                   
         }           
      } 
     private class ButtonMultiClick implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){        
              String str = txtScreen.getText();          
              txtScreen.setText(str + "*"); 
                   
         }           
      } 
     private class ButtonClearClick implements ActionListener{ 
          @Override          
          public void actionPerformed(ActionEvent e){ 
             txtScreen.setText(""); 
          }           
      } 
     private class ButtonEqualClick implements ActionListener{ 
          @Override 
         public void actionPerformed(ActionEvent e){
           //   String text;
          //    String str;
             
                 
              
               
              }           
      } 
   


    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.CreateAndShowGUI();
    }
    
}
