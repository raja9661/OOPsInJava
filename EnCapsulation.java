class Person
{
    private String name,adds;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdds() {
        return adds;
    }
    public void setAdds(String adds) {
        this.adds = adds;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class EnCapsulation {
    public static void main(String args[])
    {
        Person p=new Person();
        p.setName("Ram");
        p.setAge(20);
        p.setAdds("New Delhi");
        String n=p.getName();
        int a=p.getAge();
        String ad=p.getAdds();
        System.out.println("Name:"+n);
        System.out.println("Age:"+a);
        System.out.println("Address:"+ad);
    }
}
