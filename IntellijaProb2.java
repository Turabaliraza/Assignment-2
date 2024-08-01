import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main (String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Email Id");
        String emailid= input.nextLine();
        Pattern pattern=Pattern.compile("([a-zA-Z]+\\d+|[a-zA-Z]+|[a-zA-Z]+.[a-zA-Z]+)@gmail.com");
        Matcher matcher =pattern.matcher(emailid);
        boolean b=matcher.matches();
        if(b)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}