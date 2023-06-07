import java.lang.*;

class Datatypes()
{ 
    int a;
    float b;
    double c;
    byte d;
    short e;
    long f;
    boolean g;
    char h;
}
 
    public
    Datatypes()
    {
        a=10;
        b=20.03f;
        c=60;
        d=30;
        e=50;
        f=60;
        g=true;
        h='8';
    }

    void display()
    {
        System.out.println("Integer value="+a);
        System.out.println("Floating value="+b);
        System.out.println("Double value="+c);
        System.out.println("Byte value="+d);
        System.out.println("Short value="+e);
        System.out.println("Long value="+f);
        System.out.println("Boolean value="+g);
        System.out.println("Char value="+h);
    }
class dt 
{
    public static void main(String args[])
    {
        Datatypes i=new Datatypes();
        i.display();
    }
}