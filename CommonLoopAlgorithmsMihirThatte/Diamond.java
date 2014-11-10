import java.util.Scanner;
public class Diamond
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("What's the length?");
        int num1 = s.nextInt();
        int num2 = num1;
        String printStat = new String("*");
        for (int row = 1; column <= sideLength; row++)
        {
            for (int column = 1; column <= sideLength * 2 - 1; column++)
            if (Math.abs(column - sideLength)<(row))
            {
                printStat += "**";
            }
            else
            {
                System.out.print(" ");
            }
        }
        for (;num2>=1; num2 --)
        {
            System.out.println(printStat);
            if (num2 >= 0)
            {
                int length = printStat.length();
                int newlen = length - 2;
                printStat = printStat.substring(0,newlen);
            }
        }
        }
}
