package package_a;

public class Employee
{
    //Company policy to use int as the type for the field age.
    //YooHoo
    private int age;

    public Employee (int age)
    {
        this.age = age;
    }

    @Override
    public String toString ()
    {
        return "I'm an employee with age " + this.age;
    }

}//End of class Employee!!!!!
///////////////////////////////////
