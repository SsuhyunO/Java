package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 
 * 날짜 : 2026/05/12 
 * 이름 : 오수현
 * 내용 : Java 내장클래스 실습 - Date, Calendar
 * 
 */
public class DateCalendarTest {
	public static void main(String[] args) {
		// Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);
		
		System.out.println("now : " + now);
		
		Calendar cal = Calendar.getInstance(); // 싱글톤 객체
		
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int cdate = cal.get(Calendar.DATE);
		int hour  = cal.get(Calendar.HOUR_OF_DAY);
		int min   = cal.get(Calendar.MINUTE);
		int sec   = cal.get(Calendar.SECOND);

		System.out.printf("%d-%d-%d %d:%d:%d", year, month+1, cdate, hour, min, sec);
	}
}
