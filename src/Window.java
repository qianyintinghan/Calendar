import java.awt.FlowLayout;

import javax.swing.*;

public class Window extends JFrame{
	//Year and month chooser
	private JPanel top = new JPanel();
	private JComboBox<String> years = new JComboBox<String>();
	private JComboBox<String> months = new JComboBox<String>();
	
	
	
	public Window() {
		super();
		
		init();
		
		this.setTitle("Calendar");
		this.setLocation(300, 100);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
//		pack();
	}
	
	private void init() {
		for (int i = 2000; i < 2010; i++) {
			years.addItem("" + i);
		}
		top.add(years);
		for (int i = 1; i <= 12; i++ ) {
			months.addItem("" + i);
		}
		top.add(months);
		
		this.add(top);
	}	


	public static void main(String[] args) {
		Window a = new Window();
	}
}
