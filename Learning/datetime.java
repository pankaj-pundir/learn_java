import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void AddDays(String[] args){

//  input argument
// java datetime.java 2022-12-25 7

        LocalDate startDate = LocalDate.parse(args[0]);
        System.out.println(startDate);
        LocalDate newDate = startDate.plusDays( Long.parseLong(args[1]) );
        System.out.println(newDate);
    }

    private static void dateFormat(){
        LocalDate today = LocalDate.now();
        System.out.println(today);

        DateTimeFormatter useDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        System.out.println(today.format(useDateFormat));
    }

    public static void main(String[] args){
        if(args.length > 0) AddDays(args);
        // date format
        dateFormat();
    }


}

