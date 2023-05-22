import java.lang.*;
import java.util.*;
interface A
{
     void add();

}
interface B 
{
     void mul();
}


class D implements A,B
{
    public 
    void add()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum=n1+n2;
        System.out.println("Sum of two number is="+sum);
    }

    public 
    void mul()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int mul=n1*n2;
        System.out.println("Product of two number is="+mul);
    }

}

class inheri
{
    public static void main(String args[])
    {
        D d=new D();
        d.add();
        d.mul();
    }
}