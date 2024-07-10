package CollectionsFramework.Time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class lec100_Time {
    public static void main(String[] args) {
        Clock cl = Clock.systemUTC();
        System.out.println(cl.instant());

        // Duration class :
        System.out.println("Duration Class");
        // This class is used to measure time in seconds and nano seconds.
        // This class is immutable.
        // Some Methods of the duration class :
        // boolean isNegative() : This method is used to check if the duration is negative.
        // Example :
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00' 
                  System.out.println(d1.isNegative());                                         
                                                                                                  
        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
                                                                                                                  
        System.out.println(d2.isNegative());

        //isZero() : This method is used to check if the duration is zero. Returns boolean value.
        System.out.println(d2.isZero());

        // LocalDate class :
        // This class is useful for representing the dates in the year-month-day format.
        // With the help of LocalDate class, dates can be represented without time.
        System.out.println("Local Date Class:-");
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        //Date-Time Formatter:-
        System.out.println("Date Time Formatter:-");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);
        System.out.println(df2);

    }
}
