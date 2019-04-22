import javax.swing.*;

import java.awt.Font;
import java.util.concurrent.*;

public class Main {
	static public void main(String args[]) {
		JFrame frame = new JFrame("Calender");
		JLabel label = new JLabel("A lebal");
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
		
		label.setFont(new Font("Consolas", 100, 100));
	}
}
