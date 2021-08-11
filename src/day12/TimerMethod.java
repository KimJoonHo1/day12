package day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerMethod {
	public void timer() {
		for(int i=0; i<10; i++) {
			TimerQuiz time = new TimerQuiz();
			time.setDate(new Date());
			time.setSimple(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
			System.out.println(time.getSimple().format(time.getDate()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
