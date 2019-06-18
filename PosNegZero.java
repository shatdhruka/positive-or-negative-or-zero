# positive-or-negative-or-zero
import java.util.*;
 
class PosNegZero
{
    public static void main(String []args)
    {
        int z;
        Scanner sc=new Scanner(System.in);
        z=sc.nextInt();
         
        if(z>0)
            System.out.println("Positive");
        else if(z<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
         
    }
}
