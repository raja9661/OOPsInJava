class school
{
    void name()
    {
        System.out.println("Central public school");
    }
}
class student extends school
{
    void name()
    {
        System.out.println("I am student of Central Public School");
    }
}
public class MethodOverriden {
    public static void main(String args[])
    {
        student st=new student();
        st.name();
    }   
}
