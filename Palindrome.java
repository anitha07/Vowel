import java.io.*;
import java.util.*;
class Palind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0;
        int n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        System.out.println("Palindrome");
    }
}
