public class NestedLoops
{
    public static void main(String [] args)
    {
        String printStat = "1";
        int increment = 1;
        for (int counter = 1; counter <= 8; counter += 1)
        {
        System.out.print(printStat);
        System.out.println(increment);
        if (counter ==(4))
            {
               printStat = "2";
               increment = 0;
            }
            for (;increment <5 ; )
            {
                increment += 1;
                break;
        }
    }
}
}