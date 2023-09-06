class Parents
{
    int id=10;
    String name="RAJA";
   Parents()
   {
    System.out.println("I AM IN CONSTRUCTOR OF PARENTS CLASS");
   }
   void ShowId()
   {
    System.out.println("id:-"+id);
   }
   void ShowName()
   {
    System.out.println("Name:-"+name);
   }
}
class Child extends Parents
{
    int id=20;
    // public Child() Default constructor created by JVM if we not create constructor in child class then JVM automatically create it and called the parents constructor.
    // {
    //     super();
    // }
    void ShowId()  //overriden metod
   {
    System.out.println("New id of child class:-"+id);
   }
   void display()   //Specialized method
   {
    System.out.println("This is Specialized method Beacuse it is not in parents class");
   }

}

public class Constructor_in_Inheritance {
    public static void main(String args[])
    {
        Child c=new Child();
        c.ShowId();
        c.ShowName();
        c.display();
    }
    
}

