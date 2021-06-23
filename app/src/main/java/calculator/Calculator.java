package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Calculator {

	private JFrame frame;
	
	// For operation
	private float firstNum = 0;
	private float secondNum = 0;
	private String mode = "NONE";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("GB18030 Bitmap", Font.PLAIN, 13));
		frame.getContentPane().setLayout(null);
		
		// Result screen
		
		JLabel history = new JLabel("0");
		history.setForeground(Color.GRAY);
		history.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		history.setHorizontalAlignment(SwingConstants.LEFT);
		history.setBounds(30, 22, 328, 32);
		frame.getContentPane().add(history);
		
		JLabel result = new JLabel("0");
		result.setVerticalAlignment(SwingConstants.BOTTOM);
		result.setForeground(Color.BLACK);
		result.setBackground(Color.WHITE);
		result.setOpaque(true);
		result.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setBounds(22, 22, 336, 75);
		frame.getContentPane().add(result);
		frame.setBounds(100, 100, 380, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creating Buttons
		
		JButton button1 = new JButton("1");
		button1.setForeground(Color.DARK_GRAY);
		button1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button1.setBounds(22, 358, 75, 75);
		frame.getContentPane().add(button1);
		button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(result.getText().equals("0"))
						result.setText("1");
					else
						result.setText(result.getText() + "1");
					if(history.getText().equals("0"))
						history.setText("1");
					else
						history.setText(history.getText() + "1");
				}
			});
		
		JButton button2 = new JButton("2");
		button2.setForeground(Color.DARK_GRAY);
		button2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button2.setBounds(109, 358, 75, 75);
		frame.getContentPane().add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("2");
				else
					result.setText(result.getText() + "2");
				if(history.getText().equals("0"))
					history.setText("2");
				else
					history.setText(history.getText() + "2");
			}
		});

		JButton button3 = new JButton("3");
		button3.setForeground(Color.DARK_GRAY);
		button3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button3.setBounds(196, 358, 75, 75);
		frame.getContentPane().add(button3);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("3");
				else
					result.setText(result.getText() + "3");
				if(history.getText().equals("0"))
					history.setText("3");
				else
					history.setText(history.getText() + "3");
			}
		});
		
		JButton button4 = new JButton("4");
		button4.setForeground(Color.DARK_GRAY);
		button4.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button4.setBounds(22, 280, 75, 75);
		frame.getContentPane().add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("4");
				else
					result.setText(result.getText() + "4");
				if(history.getText().equals("0"))
					history.setText("4");
				else
					history.setText(history.getText() + "4");
			}
		});
		
		JButton button5 = new JButton("5");
		button5.setForeground(Color.DARK_GRAY);
		button5.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button5.setBounds(109, 280, 75, 75);
		frame.getContentPane().add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("5");
				else
					result.setText(result.getText() + "5");
				if(history.getText().equals("0"))
					history.setText("5");
				else
					history.setText(history.getText() + "5");
			}
		});
		
		JButton button6 = new JButton("6");
		button6.setForeground(Color.DARK_GRAY);
		button6.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button6.setBounds(196, 280, 75, 75);
		frame.getContentPane().add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("6");
				else
					result.setText(result.getText() + "6");
				if(history.getText().equals("0"))
					history.setText("6");
				else
					history.setText(history.getText() + "6");
			}
		});
		
		JButton button7 = new JButton("7");
		button7.setForeground(Color.DARK_GRAY);
		button7.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button7.setBounds(22, 200, 75, 75);
		frame.getContentPane().add(button7);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("7");
				else
					result.setText(result.getText() + "7");
				if(history.getText().equals("0"))
					history.setText("7");
				else
					history.setText(history.getText() + "7");
			}
		});
		
		
		JButton button8 = new JButton("8");
		button8.setForeground(Color.DARK_GRAY);
		button8.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button8.setBounds(109, 200, 75, 75);
		frame.getContentPane().add(button8);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("8");
				else
					result.setText(result.getText() + "8");
				if(history.getText().equals("0"))
					history.setText("8");
				else
					history.setText(history.getText() + "8");
			}
		});
		
		JButton button9 = new JButton("9");
		button9.setForeground(Color.DARK_GRAY);
		button9.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button9.setBounds(196, 200, 75, 75);
		frame.getContentPane().add(button9);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0"))
					result.setText("9");
				else
					result.setText(result.getText() + "9");
				if(history.getText().equals("0"))
					history.setText("9");
				else
					history.setText(history.getText() + "9");
			}
		});
		
		JButton button0 = new JButton("0");
		button0.setForeground(Color.DARK_GRAY);
		button0.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button0.setBounds(22, 435, 162, 75);
		frame.getContentPane().add(button0);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")) {
					result.setText("0");
				} else {
					result.setText(result.getText() + "0");
				}
				if(history.getText().equals("0"))
					history.setText("0");
				else
					history.setText(history.getText() + "0");
			}
		});
		
		JButton buttonDot = new JButton(".");
		buttonDot.setForeground(Color.DARK_GRAY);
		buttonDot.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonDot.setBounds(196, 435, 75, 75);
		frame.getContentPane().add(buttonDot);
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().matches("^[0-9]+$")) {
					result.setText(result.getText() + ".");
				}
				if(history.getText().matches("^[0-9]+$")) {
					history.setText(history.getText() + ".");
				}
			}
		});
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.setForeground(new Color(255, 127, 80));
		buttonEqual.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonEqual.setBounds(283, 435, 75, 75);
		frame.getContentPane().add(buttonEqual);
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mode.equals("ADD")) {
					float currentValue = Float.parseFloat(result.getText());
					result.setText(firstNum + currentValue + "");
				} else if(mode.equals("MINUS")) {
					double currentValue = Double.parseDouble(result.getText());
					result.setText(firstNum - currentValue + "");
				}  else if(mode.equals("MULTIPLY")) {
					double currentValue = Double.parseDouble(result.getText());
					result.setText(firstNum * currentValue + "");
				}  else if(mode.equals("DIVIDE")) {
					double currentValue = Double.parseDouble(result.getText());
					result.setText(firstNum / currentValue + "");
				} else if(mode.equals("MOD")) {
					double currentValue = Double.parseDouble(result.getText());
					result.setText(firstNum % currentValue + "");
				}
				history.setText("0");
			}
 		});
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.setForeground(new Color(255, 127, 80));
		buttonPlus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonPlus.setBounds(283, 358, 75, 75);
		frame.getContentPane().add(buttonPlus);
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = result.getText();
				firstNum = Float.parseFloat(currentText);
				result.setText("0");
				history.setText(history.getText() + "+");
				mode = "ADD";
				firstNum += secondNum;
				secondNum = 0;
			}
 		});
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.setForeground(new Color(255, 127, 80));
		buttonMinus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonMinus.setBounds(283, 280, 75, 75);
		frame.getContentPane().add(buttonMinus);
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = result.getText();
				//firstNum = Double.parseDouble(currentText);
				result.setText("0");
				mode = "MINUS";
				history.setText(history.getText() + "-");
			}
 		});
		
		JButton buttonMultiply = new JButton("X");
		buttonMultiply.setForeground(new Color(255, 127, 80));
		buttonMultiply.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonMultiply.setBounds(283, 200, 75, 75);
		frame.getContentPane().add(buttonMultiply);
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = result.getText();
				//firstNum = Double.parseDouble(String.format("%.2d", currentText));
				result.setText("0");
				mode = "MULTIPLY";
				history.setText(history.getText() + "*");
			}
 		});
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.setForeground(new Color(255, 127, 80));
		buttonDivide.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonDivide.setBounds(283, 123, 75, 75);
		frame.getContentPane().add(buttonDivide);
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = result.getText();
				//firstNum = Double.parseDouble(currentText);
				result.setText("0");
				mode = "DIVIDE";
				history.setText(history.getText() + "/");
			}
 		});
		
		JButton buttonMod = new JButton("%");
		buttonMod.setForeground(Color.ORANGE);
		buttonMod.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonMod.setBounds(196, 123, 75, 75);
		frame.getContentPane().add(buttonMod);
		buttonMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = result.getText();
				//firstNum = Double.parseDouble(currentText);
				result.setText("0");
				mode = "MOD";
				history.setText(history.getText() + "*");
			}
 		});
		
		JButton buttonSign = new JButton("+-");
		buttonSign.setForeground(Color.ORANGE);
		buttonSign.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonSign.setBounds(109, 123, 75, 75);
		frame.getContentPane().add(buttonSign);
		buttonSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = result.getText();
				if(currentText.equals("0"))
					;
				else if(currentText.startsWith("-"))
					result.setText(currentText.substring(1));
				else
					result.setText("-" + currentText);
				history.setText(result.getText());
				
			}
 		});
		
		JButton buttonAllClear = new JButton("AC");
		buttonAllClear.setForeground(Color.ORANGE);
		buttonAllClear.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		buttonAllClear.setBounds(22, 123, 75, 75);
		frame.getContentPane().add(buttonAllClear);
		buttonAllClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = 0;
				secondNum = 0;
				result.setText("0");
				history.setText("0");
			}
 		});
		
		
		
	}
	/*
	private void setResult(String number) {
		
		result.setText(number);
		
	}
	*/
}
