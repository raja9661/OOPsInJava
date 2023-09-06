class Animal
{
    void makeSound()
    {
        System.out.println("Different Type Of Animal have Different Sound:");
    }
}
class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Sound of Dog:-bark");
    }  
}
class Cow extends Animal
{
    void makeSound()
    {
        System.out.println("Sound of Cow:-moo");
    }  
}
class Cat extends Animal
{
    void makeSound()
    {
        System.out.println("Sound of Cat:-meow");
    }  
}
class InheritenceDemo
{
    public static void main(String args[])
    {
        Animal a=new Animal();
        Dog d=new Dog();
        Cow c=new Cow();
        Cat ca=new Cat();
        a.makeSound();
        d.makeSound();
        c.makeSound();
        ca.makeSound();
    }
}