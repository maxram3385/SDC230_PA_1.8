/*******************************************************************
* Name: Max Ramos
* Date: March 8, 2026
* Assignment: SDC230 Performance Assessment - Classes
*
* This is the main application class. It creates Employee objects,
* displays their information, updates their information, and then
* displays the updated information.
*******************************************************************/

public class App
{
    public static void main(String[] args)
    {
        // Required heading
        System.out.println("Max Ramos - Week 1 PA Classes");

        // Create 2 Employee objects
        Employee employee1 = new Employee("John", "Smith", 2500.00);
        Employee employee2 = new Employee("Jane", "Doe", 500.00); // invalid salary

        // Print original employee information
        System.out.println("\nOriginal Employee Information:");
        System.out.println("------------------------------");
        System.out.println("Employee 1: " + employee1.getFirstName() + " "
                + employee1.getLastName());
        System.out.println("Monthly Salary: $" + employee1.getMonthlySalary());

        System.out.println();

        System.out.println("Employee 2: " + employee2.getFirstName() + " "
                + employee2.getLastName());
        System.out.println("Monthly Salary: $" + employee2.getMonthlySalary());

        // Update employee information
        employee1.setLastName("Johnson");
        employee2.setFirstName("Janet");
        employee1.setMonthlySalary(3000.00);
        employee2.setMonthlySalary(1800.00);

        // Print updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println("-----------------------------");
        System.out.println("Employee 1: " + employee1.getFirstName() + " "
                + employee1.getLastName());
        System.out.println("Monthly Salary: $" + employee1.getMonthlySalary());

        System.out.println();

        System.out.println("Employee 2: " + employee2.getFirstName() + " "
                + employee2.getLastName());
        System.out.println("Monthly Salary: $" + employee2.getMonthlySalary());
    }
}