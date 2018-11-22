package eloi;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner v = new Scanner(System.in);
        System.out.println( "Schreiben Sie etwas: " );
        String str = v.nextLine();
        String str2=str.toUpperCase();
        System.out.println( str2 );
        
    }
}
