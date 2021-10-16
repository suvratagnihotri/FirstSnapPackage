package com.java.testing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorld {
	public static void main(String [] args) {
		System.out.println("Hello World");
		JFrame frame = new JFrame("Hello");
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JButton button = new JButton("Click");
//		button.setSize(null);
		frame.add(button);
		frame.pack();
	}
}
