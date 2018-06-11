package Calculators;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.text.JTextComponent;

public class Calculator1 {

	//private JFrame frame;
	private JFrame frame;
	private JTextField textField;
    
	
	
	double firstnumber;
    double secondnumber;
    double result;
    String operations;
    String answer;
    
    
	/**
	 * Launch the application.
	 */
	
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 window = new Calculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Create the application.
	 */
	
	

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Calculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		textField = new JTextField();
		textField.setBounds(10, 11, 186, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn8.getText();
				textField.setText(en);
			}
		});
		btn8.setBounds(60, 54, 43, 53);
		btn8.setBackground(Color.YELLOW);
		btn8.setForeground(Color.RED);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn9.getText();
				textField.setText(en);
			}
		});
		btn9.setBounds(110, 54, 43, 53);
		btn9.setBackground(Color.YELLOW);
		btn9.setForeground(Color.RED);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
				}
		});
		btnPlus.setBounds(160, 54, 43, 53);
		btnPlus.setBackground(Color.YELLOW);
		btnPlus.setForeground(Color.RED);
		btnPlus.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(btnPlus);
		
		
		//-------------------2nd row--------------------------------///
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn4.getText();
				textField.setText(en);
			}
		});
		btn4.setBounds(6, 110, 49, 53);
		btn4.setBackground(Color.YELLOW);
		btn4.setForeground(Color.RED);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn5.getText();
				textField.setText(en);
			}
		});
		btn5.setBounds(60, 110, 43, 53);
		btn5.setBackground(Color.YELLOW);
		btn5.setForeground(Color.RED);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String 	en=textField.getText()+btn6.getText();
				textField.setText(en);
			}
		});
		btn6.setBounds(110, 110, 43, 53);
		btn6.setBackground(Color.YELLOW);
		btn6.setForeground(Color.RED);
		btn6.setFont(new Font("Tahoma", Font.PLAIN,15));
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
								
			}
		});
		btnMinus.setBounds(160, 110, 43, 53);
		btnMinus.setBackground(Color.YELLOW);
		btnMinus.setForeground(Color.RED);
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(btnMinus);
		
		
		//-------------------------3rd row----------------------//
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn1.getText();
				textField.setText(en);
			}
		});
		btn1.setBounds(6, 166, 49, 53);
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.RED);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn2.getText();
				textField.setText(en);
			}
		});
		btn2.setBounds(60, 166, 43, 53);
		btn2.setBackground(Color.YELLOW);
		btn2.setForeground(Color.RED);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn3.getText();
				textField.setText(en);
			}
		});
		btn3.setBounds(110, 166, 43, 53);
		btn3.setBackground(Color.YELLOW);
		btn3.setForeground(Color.RED);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btn3);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
				
			}
		});
		btnMultiplication.setBounds(160, 166, 43, 53);
		btnMultiplication.setBackground(Color.YELLOW);
		btnMultiplication.setForeground(Color.RED);
		btnMultiplication.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnMultiplication);
		
		//---------------4th row--------------//
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String 	en=textField.getText()+btn0.getText();
				textField.setText(en);
			}
		});
		btn0.setBounds(6, 222, 49, 53);
		btn0.setBackground(Color.YELLOW);
		btn0.setForeground(Color.RED);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(60, 222, 43, 53);
		btnDot.setBackground(Color.YELLOW);
		btnDot.setForeground(Color.RED);
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnDot);
		
		JButton btnPm = new JButton("+-");
		btnPm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pm = Double.parseDouble(String.valueOf(textField.getText()));
				pm=pm*(-1);
				textField.setText(String.valueOf(pm));
				
				
				
			}
		});
		btnPm.setBounds(110, 222, 43, 53);
		btnPm.setBackground(Color.YELLOW);
		btnPm.setForeground(Color.RED);
		btnPm.setFont(new Font("Tahoma", Font.BOLD, 9));
		frame.getContentPane().add(btnPm);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnumber=Double.parseDouble(textField.getText());
				if (operations=="+")
				   {
					result=firstnumber+secondnumber;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				   }
				else if (operations=="-")
				   {
					result=firstnumber-secondnumber;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				   }
				else if (operations=="*")
				   {
					result=firstnumber*secondnumber;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				   }
				else 	if (operations=="/")
				   {
					result=firstnumber/secondnumber;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				   }
				
				
				
				
			}
		});
		btnEqual.setBounds(160, 222, 43, 53);
		btnEqual.setBackground(Color.YELLOW);
		btnEqual.setForeground(Color.RED);
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN,9));
		frame.getContentPane().add(btnEqual);
		
		
		///------------------5TH ROW----------------//
		
		JButton btnDivisioin= new JButton("/");
		btnDivisioin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
				
				
			}
		});
		btnDivisioin.setBounds(6, 278, 43, 53);
		btnDivisioin.setBackground(Color.YELLOW);
		btnDivisioin.setForeground(Color.RED);
		btnDivisioin.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnDivisioin);
		
		JButton btnBackslash = new JButton("<-");
		btnBackslash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backsp;
				if(textField.getText().length()>0){
					
					StringBuilder m =new StringBuilder(textField.getText());
					m.deleteCharAt(textField.getText().length()-1);
					backsp=m.toString();
					textField.setText(backsp);
					
				}
				
				
				
			}
		});
		btnBackslash.setBounds(60, 278, 43, 53);
		btnBackslash.setBackground(Color.YELLOW);
		btnBackslash.setForeground(Color.RED);
		btnBackslash.setFont(new Font("Tahoma", Font.PLAIN,8));
		frame.getContentPane().add(btnBackslash);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText(null);
			}
		});
		btnC.setBounds(110, 278, 43, 53);
		btnC.setBackground(Color.YELLOW);
		btnC.setForeground(Color.RED);
		btnC.setFont(new Font("Tahoma", Font.PLAIN,15));
		frame.getContentPane().add(btnC);
		
		JButton btnP = new JButton("%");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
				
				
				
			}
		});
		btnP.setBounds(160, 278, 43, 53);
		btnP.setBackground(Color.YELLOW);
		btnP.setForeground(Color.RED);
		btnP.setFont(new Font("Tahoma", Font.PLAIN,8));
		frame.getContentPane().add(btnP);
		
		JButton button = new JButton("7");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBackground(Color.YELLOW);
		button.setBounds(10, 54, 49, 53);
		frame.getContentPane().add(button);
		
		
		
		frame.setBounds(100, 100, 265, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 222, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

}}
