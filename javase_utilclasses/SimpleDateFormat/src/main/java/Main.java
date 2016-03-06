import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

      // Make a new Date object. It will be initialized to the current time.
        Date now = new Date();

        // See what toString() returns
        System.out.println(" 1. " + now.toString());

        // Next, try the default SimpleDateFormat
        System.out.println(" 2. " + SimpleDateFormat.getInstance().format(now));

        // And the default time and date-time SimpleDateFormats
        System.out.println(" 3. " + SimpleDateFormat.getTimeInstance().format(now));
        System.out.println(" 4. " +
            SimpleDateFormat.getDateTimeInstance().format(now));

        // Next, try the short, medium and long variants of the
        // default time format
        System.out.println(" 5. " +
            SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT).format(now));
        System.out.println(" 6. " +
            SimpleDateFormat.getTimeInstance(SimpleDateFormat.MEDIUM).format(now));
        System.out.println(" 7. " +
            SimpleDateFormat.getTimeInstance(SimpleDateFormat.LONG).format(now));

        // For the default date-time format, the length of both the
        // date and time elements can be specified. Here are some examples:
        System.out.println(" 8. " + SimpleDateFormat.getDateTimeInstance(
            SimpleDateFormat.SHORT, SimpleDateFormat.SHORT).format(now));
        System.out.println(" 9. " + SimpleDateFormat.getDateTimeInstance(
            SimpleDateFormat.MEDIUM, SimpleDateFormat.SHORT).format(now));
        System.out.println("10. " + SimpleDateFormat.getDateTimeInstance(
            SimpleDateFormat.LONG, SimpleDateFormat.LONG).format(now));

    }
}
