import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        java.util.Date date = new Date();
        Date from = Date.from(Instant.now());
        System.out.println("from: " + from);
        java.sql.Date sqlDate1 = new java.sql.Date(System.currentTimeMillis());
        System.out.println("1: " + System.currentTimeMillis());
        System.out.println("2: " + date.getTime());
        java.sql.Date sqlDate2 = new java.sql.Date(date.getTime());
        System.out.println("sqlDate1: " + sqlDate1);
        System.out.println("sqlDate2: " + sqlDate2);
        System.out.println(System.currentTimeMillis());
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
        String format = dateFormat.format(date);
        System.out.println(dateFormat.format(date));
        String str = "01/02/2022";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate temp = LocalDate.from(dateTimeFormatter.parse(str));
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("Asia/Baku");
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
                //.of(2022, Month.FEBRUARY, 1, 17, 3, 27);
        System.out.println("1: " + localDateTime.plus(1, ChronoUnit.DAYS));
        System.out.println(localDateTime.plusDays(1));
        System.out.println(localDateTime.plus(Duration.ofDays(1)));

        System.out.println(localDateTime);
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println("clock: " + clock);
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar: " + calendar.getTime());
    }
}
