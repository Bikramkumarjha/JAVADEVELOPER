
import java.lang.*;
import java.util.Scanner;
public class _5switch
 {

    public static void main (String arg[])
    {
        System.out.println("enter the cherater");
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'd' : System.out.println("mango");
            break;
            case 's' :System.out.println("cay");
            break;
            case 'a' :System.out.println("good");
             break;


        
            
        
            case'm' : System.out.println("monday");
            break;
            case '1' : System.out.println("tuesday");
            break;
            case '3': System.out.println("wednesday");
            break;
            case '4':System.out.println("thuesday");
            break;
            case '5': System.out.println("friday");
            break;
            case '6':System.out.println("thuesday");
            break;
            case '7': System.out.println("friday");
            break;
            default :System.out.println("we wake up");
          }  

    }

}   

   

