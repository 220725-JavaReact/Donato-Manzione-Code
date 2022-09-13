package com.revature.guis.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingApplication2v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public SwingApplication2v1() {
		super("Java Swing with Label");
		setLayout(new FlowLayout());

		label = new JLabel();
		add(label);

		tf = new JTextField(20);
		tf.addActionListener(this);
		add(tf);

	}

	// create GUI and show it
	public static void createAndShowGui() {

		// create and set up window
		JFrame frame = new SwingApplication2v1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// display window
		frame.pack();
		frame.setVisible(true);
	}

	private JLabel label;
	private JTextField tf;

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
		label.setText(tf.getText());

	}
}
