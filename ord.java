import java.util.*;

class A
{
    void addd()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two integer numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        sum=a+b;
        System.out.println("Sum="+sum);
    }
}

class B extends A
{
    void add()
    {
        System.out.println("Enter three integer numbers:");
        System.out.println("Invoking subclass method");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        int sum=x+y+z;
        System.out.println("Sum of 3 integer numbers="+sum);
    }
}

class ord
{
    public static void main(String args[])
    {
        B b=new B();
        b.add();
    }
}