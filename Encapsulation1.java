//Binding the data member amd method of class in single unit is called Encapsulation.
//Encapsulation can be achive by making data member of class private and Providing public setter and getter methods to modify and view the variables values;
class Demo
{
    private int id;
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
class Encapsulation1
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.setId(10);
        d.setName("RAJA");
        System.out.println(d.getId());
        System.out.println(d.getName());

    }
}