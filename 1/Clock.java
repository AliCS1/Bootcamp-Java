import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
class Clock {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        String time = dateTime.format(dtf);
        System.out.println("The current time is " + time);
        //System.out.println(d);
    }
}