package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class NumberActionListener implements ActionListener {

	JLabel label;
	String text;
	
	public NumberActionListener(JLabel label, String text) {
		this.label = label;
		this.text = text;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String currentText = label.getText();
		if(currentText.equals("0")) {
			label.setText(text);
		} else {
			label.setText(label.getText() + text);
		}
		
	}

}
