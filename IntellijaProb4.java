import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String [] args)
    {
        LocalDate date= LocalDate.parse(str);
        date=date.plusDays(30);
        System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
