abstract class Shape
{
    abstract void calculateArea();
}
class Rectangle extends Shape
{
    int l=10;
    int b=20;
    void  calculateArea()
    {
        int area=l*b;
        System.out.println("Area of Rectangle is:"+area);
    }
}

class Circle extends Shape
{
    final double pi=3.14;
    double radius=10;
    void  calculateArea()
    {
        double area=pi*(radius*radius);
        System.out.println("Area of Circle is:"+area);
    }
}

class Triangle extends Shape
{
    int b=10;
    int h=10;
    void  calculateArea()
    {
        int area=(b*h)/2;
        System.out.println("Area of Triangle is:"+area);
    }

}
class callShape
{
    public void poly(Shape s)
    {
        s.calculateArea();
    }
}
public class ShapeCalculator {
    public static void main(String args[])
    {
        Shape s1=new Rectangle();
        Shape s2=new Circle();
        Shape s3=new  Triangle();
        // s1.calculateArea();
        // s2.calculateArea();
        // s3.calculateArea();
        //or
        callShape cs=new callShape();
        cs.poly(s1);
        cs.poly(s2);
        cs.poly(s3);
    }
    
}
