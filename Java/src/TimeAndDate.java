import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {
    TimeAndDate(){
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Default: " + now + "\n");

        //Format Date Time Display
        //MM = month Number, MMM = Month Abbreviation, MMMM = Full Month Name
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM-dd-yyyy HH:mm:ss");
        String FormattedDateTime = now.format(format);
        System.out.print("After Format: " + FormattedDateTime);
    }
}
