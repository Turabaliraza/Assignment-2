import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        //take input in java
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        System.out.println(num);
        input.next();//"abc   def"
        String ms = input.nextLine();//"abc def "
        System.out.println(ms);
        //type casting
        int n =10;
        double d = n;
        int f = (int) d;
        String s = "13";
        int n1 = Integer.parseInt(s);
        //java consider everything in object
        int n2 = 20;
        //ParseInt
        //ParseFloat
        //ParseDouble
        //tostring
        Integer n3 = 50;
        String st = n3.toString();
        /* Wrapper classes
            int       Integer
          float     Float
          byte      Byte
          short     Short
          long      Long
          double    Double
          char      Char
         */



        //regular expression
//        Pattern pattern = Pattern.compile("\\d{5}-\\d{7}-\\d{1}");
//        Matcher matcher = pattern.matcher("3520294387955");
//        boolean b = matcher.matches();
//        System.out.println(b);
        //Date time Library
//        System.out.println(LocalDate.now());
//        //YYYY-MM-DD
//        LocalDate date = LocalDate.of(2024,12,17);
//        String s = date.toString();
//        //String date1 = date.format(DateTimeFormatter.ISO_DATE);
//        String input = "2012-4-8";
//        LocalDate objDate = LocalDate.parse(input);
//        System.out.println(s);
//        //LocalDate, LocalTime,LocalDateTime
//        LocalDate yesterday = date.minusDays(1);
//        LocalDate tomorrow = date.plusDays(1);





        //String is a reference type and immutable in java
//        String s = "hello";
//        String s1 = new String ("World");
//        s = s.concat("_world");
//        System.out.println(s);
//        s +="ali";
//        System.out.println(s);
//        //Concate/append
//        String str1 = "ali";
//        String str2 = "Ali";
//        if (str1.equalsIgnoreCase(str2)){//case sensitive
//            System.out.println("equal");
//        }
//        else
//            System.out.println("not equal");
//        String msg = "                    abc                     ";
//        msg = msg.trim();
//        System.out.println(msg);
//        msg = msg.toLowerCase();
//        msg.toUpperCase();
//        char [] c = msg.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
//        int n = msg.compareTo(str1);
//        // n==0 both strings are equal
//        // n>0 first string greater than second
//        //n<0 second string greater than first
//        boolean b = msg.endsWith("ld");
//        boolean b1 =  msg.startsWith("hello");
//        String subString = msg.substring(3,6);
//        msg.charAt(5);
//        int index = msg.indexOf("hello");
//        System.out.println(index);
//
       //Loop in java
//        int x = 50;
//        while(x>10){
//            System.out.println("hello");
//            x-=10;
//        }
//        for (int i=0;i<10;i++){
//            System.out.println("hello");
//        }
//        do{
//            System.out.println(x);
//            x-=10;
//        }while(x>10);
        //for each loop
//        int [] arr = {10,20,30,40,50};
//        for(int num : arr){
//            System.out.println(num);
//        }


    }
}




