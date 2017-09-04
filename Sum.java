import java.io.*;
import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int b=0;
        for(a=1;a<n;a++)
        {
            b=b+a;
            System.out.println(b);
        }
    }
}
