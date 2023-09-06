interface Animal
{
    public void sound();

}
class dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog sound:Bark");
    }
}
class bats implements Animal
{
    public void sound()
    {
        System.out.println("bats sound:screech");
    }
}
class camel implements Animal
{
    public void sound()
    {
        System.out.println("camel sound:grunt");
    }
}
public class LooseCopuling {
    public static void main(String args[])
    {
        // Animal anml=new dog();
        //Animal anml=new bats(); object of parents clasas cand hold the address of child class
        Animal anml=new camel();
        anml.sound();
    }
}
