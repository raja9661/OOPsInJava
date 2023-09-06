//Constructor is use to initilize the object of class.
//it name is same as class name but it does not have any return type.
public class Constructor1 {
    String name;
    int id;
    // Constructor1(String name,int id)
    // {
    //   name=name;
    //   id=id;                     //it return name=null and id=0.because of shadowing problem as local variable name is same as instance variable name and JVM  always preference local variable
    // } 
    Constructor1(String name,int id)
    {
      this.name=name;
      this.id=id;  
    }                           //to overcome this problem we use this keyword
    public static void main(String args[])
    {
       Constructor1 cns=new Constructor1("Raja", 10);
       System.out.println("Name="+cns.name);
       System.out.println("id="+cns.id);
    }
}
