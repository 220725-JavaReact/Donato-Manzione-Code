package com.revature.guis.swing;

import javax.swing.JFrame;

public class SwingApplication1 extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void createAndShowGui() {
		// make sure we have nice window decorations
		JFrame.setDefaultLookAndFeelDecorated(true);

		// Create and set up the window

		JFrame frame = new SwingApplication1();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set the window size and location
		frame.setSize(3000, 3000);

		frame.setLocationRelativeTo(null); // display the window

		frame.pack();

		frame.setVisible(true);

	}

	public static void main(String[] args) {

		// creating and showing this application's guis, but scheduled

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				createAndShowGui();
			}
		});

	}

}
