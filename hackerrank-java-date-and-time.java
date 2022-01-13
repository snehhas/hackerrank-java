
import java.time.LocalDate;


class Result {

    

    public static String findDay(int month, int day, int year) {
        
        int m= Integer.valueOf(month);
        int d= Integer.valueOf(day);
        int y= Integer.valueOf(year);
        LocalDate date=LocalDate.of(y,m,d);
        return date.getDayOfWeek().toString();
        
    }

}