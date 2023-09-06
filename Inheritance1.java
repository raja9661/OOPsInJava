class Parents
{
    private int id=10;
    public String name="raja";
    void displayId()
    {
        System.out.println("i am in parents class");
        System.out.println("id:-"+id);
    }
    void displayName()
    {
        System.out.println("i am in parents class");
        System.out.println("name:-"+name);
    }
}
class Child extends Parents
{

    public void display() {
    } 
}
class Inheritance1
{
    public static void main(String args[])
    {
        Child c=new Child();
        //System.out.println(c.id); private member of parent class do not access in child class.
        System.out.println(c.name);
        c.displayId();
        c.displayName();
    }
}