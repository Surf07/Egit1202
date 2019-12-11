package Lesson749;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class TimeZoneTest1 {
	public static void main(String[] args) {

		TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
		SimpleDateFormat sdf = new SimpleDateFormat("MMMMM dd, yyyy HH:mm");
		sdf.setTimeZone(tz);
		System.out.println(sdf.format(new Date(0)));
	}

}
