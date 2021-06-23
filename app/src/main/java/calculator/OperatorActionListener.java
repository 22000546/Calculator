package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class OperatorActionListener implements ActionListener {
	
	JLabel label;
	String text;

	public OperatorActionListener(JLabel result, String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		label.setText("0");
		
	}

}
