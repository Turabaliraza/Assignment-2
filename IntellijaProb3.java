import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main{
    public static void main(String [] args)
    {
        LocalDate Date=LocalDate.now();
       String newDate=Date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
       System.out.println("before"+Date);
       System.out.println("after "+newDate);
    }
}