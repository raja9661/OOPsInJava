interface Drawable
{
    void draw();
}
class Circle implements Drawable
{
    final double pi=3.14;
    double radius=10;
    public void draw()
    {
        double area=pi*(radius*radius);
        System.out.println("Area of Circle is:"+area);
    }
}
class Rectangle implements Drawable
{
    int l=10;
    int b=10;
    public void draw()
    {
        double area=l*b;
        System.out.println("Area of Rectangle is:"+area);
    }
}  
public class InterfaceDemo {
    public static void main(String args[])
    {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.draw();
        r.draw();
    }
    
}
