package day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(s.format(time));
		
		Date date = new Date();
		System.out.println("date : " + date);
		System.out.println(s.format(date));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println("cal : " + cal.get(Calendar.DATE));
		
	}
}
