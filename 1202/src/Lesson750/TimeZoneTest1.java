package Lesson750;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class TimeZoneTest1 {

  public static void main(String[] args) {

    Date now = new Date();

    for(String tzid : TimeZone.getAvailableIDs()){
      System.out.println(TimeZoneTest1.getTimeText(now, tzid));
    }
  }

  public static String getTimeText(Date date, String timezoneID){
    TimeZone tz = TimeZone.getTimeZone(timezoneID);
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    sdf.setTimeZone(tz);
    return sdf.format(date) + "[" + tz.getDisplayName() + ", " + timezoneID + "]";
  }

}