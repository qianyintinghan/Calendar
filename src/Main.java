import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.*;

public class Main {
	static void addYearAndMonth(JFrame f) {
		JPanel top = new JPanel();
		top.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		
		JPanel yearP = new JPanel();
		String[] years = new String[] {"2017", "2018", "2019", "2020"};
		JLabel year = new JLabel("年");
		JComboBox<String> yearChooser = new JComboBox<>(years);
		yearP.add(yearChooser);
		yearP.add(year);
		
		JPanel monthP = new JPanel();
		String[] months = new String[] {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
		JLabel month = new JLabel("月");
		JComboBox<String> monthChooser = new JComboBox<>(months);
		monthP.add(monthChooser);
		monthP.add(month);
		
		top.add(yearP);
		top.add(monthP);
		
		f.add(top, BorderLayout.NORTH);
	}
	
	static void addWeek(JFrame f) {
		JPanel body = new JPanel();
		
		body.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
		
		String[] weeks = new String[] {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for (int i = 0; i < 7; i++) {
			body.add(new Button(weeks[i]));
		}
		
		f.add(body);
	}
	
	static public void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setTitle("Calendar");
		frame.setLocation(500, 300);
		frame.setSize(500, 500);
		
		addYearAndMonth(frame);
		addWeek(frame);
		
		
//		frame.pack();
		frame.setVisible(true);
	}
}
