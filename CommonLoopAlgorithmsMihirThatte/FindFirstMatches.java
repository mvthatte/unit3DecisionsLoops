import java.util.Scanner;

/**
 * Write a description of class CountMatches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindFirstMatches
{


    /**
     * Counts the number of spaces ' ' in a string 
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String input = in.nextLine();
        
       boolean found = false;
       int index = 0;
       
       while(!found && index < input.length() )
       {
           char ch = input.charAt(index);
           if (ch == ' ')
           {
               found = true;
           }
           else
           {
               index++;
           }
       }
       System.out.println("Position of first space: " + index);
}
}