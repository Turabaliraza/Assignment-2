import java.util.Scanner;

public class Main{
    public static void main (String[]args)
    {
        Scanner  input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        String str=input.nextLine();
        int mInt=Integer.parseInt(str);
        String[] rnChars = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
        int[] rnVals={1000,900,500,100,50,10,5,1};
        String retval="";
        for(int i=0;i<rnVals.length;i++)
        {
            int num=mInt/rnVals[i];
            if(num==0)continue;
            retval +=(num==4 && i>0)? rnChars[i]+rnChars[i-1]:rnChars[i];
            mInt=mInt%rnVals[i];
        }
        System.out.println("roman number="+retval);
    }
}