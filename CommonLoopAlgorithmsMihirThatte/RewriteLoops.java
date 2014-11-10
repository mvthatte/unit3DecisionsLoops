public class RewriteLoops
{
    public static void main(String[] args)
    {
      int s = 0;
        for(int i = 1; i <=10; i++)
         {
            s = s+i;
        }
       int s = 0;
       int i = 1;
       
       while (i <= 10)
       {
           s = s+i;
           
           i++;
       }
    }
    
    public static void main2(String[] args)
    {
        int n = in.nextInt();
        double x = 0;
        double s = .02;
        while(s > 0.01)
        {
            s = 1.0 / (1+ n*n);
            n++;
            x = x + s;
        }

    }
}