import java.util.Calendar;

public class GetDay {
	//This Day
	static public Calendar now_c = Calendar.getInstance();
	static public int now_year = now_c.get(Calendar.YEAR);
	static public int now_month = now_c.get(Calendar.MONTH);
	
	//week
	static public String[] week = new String[] {"Mon", "Tue", "Wed", "thu", "Fri", "Sat", "Sun"};
	
	static public void setYearAndMonth() {
		for (int i = GetDay.now_year - 100; i < GetDay.now_year + 20; i++) {
			Window.years.addItem("" + i);
		}
		Window.years.setSelectedIndex(100);
		Window.top.add(Window.years);
		Window.top.add(Window.y_label);
		
		for (int i = 1; i <= 12; i++ ) {
			Window.months.addItem("" + i);
		}
		Window.months.setSelectedIndex(GetDay.now_month);
		Window.top.add(Window.months);
		Window.top.add(Window.m_label);
	}
	
	static void getDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
	}
}
