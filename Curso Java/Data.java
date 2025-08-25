import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Data{
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime localDateTime = localDate.atTime(localTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTimeUTC = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC);

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        OffsetDateTime offsetDateTime1 = date.toInstant().atOffset(ZoneOffset.ofHours(3));
        System.out.println(offsetDateTime1);
    }
}