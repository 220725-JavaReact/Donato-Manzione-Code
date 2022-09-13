package com.revature.guis.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingApplication2v2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 2L;
	private JLabel label;
	private JTextField tf;
	private JButton button;

	public SwingApplication2v2() {
		super("Java Swing with Label");
		setLayout(new FlowLayout());

		label = new JLabel("This is a Swing label!");
		add(label);

		tf = new JTextField(20);
		add(tf);
		button = new JButton("Equals");
		button.addActionListener(this);
		add(button);

	}

	// create GUI and show it
	public static void createAndShowGui() {

		// create and set up window
		JFrame frame = new SwingApplication2v2();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// display window
		frame.pack();
		frame.setVisible(true);
	}

	// main method
	public static void main(String[] args) {

		// something about event dispatchers... look into it later

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createAndShowGui();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float s;
		if (e.getSource() == button) {
			s = Float.parseFloat(tf.getText());
			s *= s;
			label.setText("The square of " + tf.getText() + " is " + s);
		}

	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
}
