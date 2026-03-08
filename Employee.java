/*******************************************************************
* Name: Max Ramos
* Date: March 8, 2026
* Assignment: SDC230 Performance Assessment - Classes
*
* This class represents an employee. It stores the employee's
* first name, last name, and monthly salary. It includes a
* constructor, getters, and setters.
*******************************************************************/

public class Employee
{
    // Instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary >= 1000)
        {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getter for firstName
    public String getFirstName()
    {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName()
    {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // Getter for monthlySalary
    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    // Setter for monthlySalary
    public void setMonthlySalary(double monthlySalary)
    {
        if (monthlySalary >= 1000)
        {
            this.monthlySalary = monthlySalary;
        }
    }
}