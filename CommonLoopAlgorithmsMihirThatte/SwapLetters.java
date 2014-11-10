import java.util.Random;
import java.util.Scanner;
public class SwapLetters
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word");
        String theword = s.nextLine();
        int num1 = theword.length();
        for (int counter = 0; counter <= num1; counter +=1)
        {
            Random randNum = new Random();
            int i = randNum.nextInt(num1);
            int num2 = randNum.nextInt((num1-i) + 1) + i;
            System.out.println(num2);
            
    }
}
}