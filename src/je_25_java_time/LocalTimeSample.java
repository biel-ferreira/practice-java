package je_25_java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSample {
    public static void main(String[] args) {
        LocalTime firstHour = LocalTime.now();
        LocalTime hourSetted = LocalTime.of(16, 50);
        LocalTime hourPlusMinutes = hourSetted.plusMinutes(10);
        LocalTime hourPlusHours = hourSetted.plusHours(2);
        LocalTime hourMinusHours = hourSetted.minusHours(2);

        DateTimeFormatter convertedTime = DateTimeFormatter.ofPattern("ss-mm-HH");
        String hourFormatted = hourSetted.format(convertedTime);
//        String hourFormatted = LocalTime.parse(hourSetted, convertedTime);
        System.out.println(hourFormatted);

        System.out.println(hourSetted.getHour());
        System.out.println(hourSetted.getMinute());
        System.out.println(hourSetted.getSecond());

        boolean compareHours = hourPlusHours.isAfter(hourMinusHours);

        System.out.println(firstHour);
        System.out.println(hourSetted);
        System.out.println(hourPlusMinutes);
        System.out.println(hourPlusHours);
        System.out.println(hourMinusHours);
        System.out.println(compareHours);


    }
}
