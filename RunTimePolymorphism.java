class Departement
{
    void Role()
    {
        System.out.println("The task of main Departement is to manage all the sub departement:");
    }
}
class CSEDepatement extends Departement
{
    void Role()
    {
        System.out.println("The cse departement focus on emerging technology :");
    } 
}
class CivilDepartement  extends Departement
{
    void Role()
    {
        System.out.println("The civil departement is core departement  which focus on mathemetics and physics:");
    }
}
 class dept
{
    void poly(Departement ref) // ref is parent class reference and parents class ref hold the address of child class
    {
        ref.Role();
        System.out.println("********************************");
    }
}
public class RunTimePolymorphism {
    public static void main(String args[])
    {
        dept dp=new dept();
        CSEDepatement cse=new CSEDepatement();
        CivilDepartement civil=new CivilDepartement();
        dp.poly(cse);
                        //same method with different output.
        dp.poly(civil);
    }
    
}
