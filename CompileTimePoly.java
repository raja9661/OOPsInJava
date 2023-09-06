class calculation
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("sum of two number is:"+c);
    }
    void add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("sum of three number is:"+d);
    }
    void add(int a,double b)
    {
        double c=a+b;
        System.out.println("sum of one integer and one double type number is:"+c);
    }
}
public class CompileTimePoly {
    public static void main(String args[])
    {
        calculation c=new calculation();
        c.add(2,4);
        c.add(2,4,6);   //same method but with different arguments
        c.add(2,8.5);
    }
    
}
