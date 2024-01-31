package classes_and_access_modifiers;

public class EmployeeMain2 {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.assignValues(101, "Radha", 4565.23f);
        String empInfo = emp.getEmployeeDetails();
        System.out.println(empInfo);
        System.out.println(emp.getEmployeeDetails());

        //Changing the salary of the employee by incrementing it by 1000
        float currentSal = emp.getSalary();
        float newSal = currentSal + 1000;
        emp.setSalary(newSal);
        System.out.println("-----------------------------");
        System.out.println(emp.getEmployeeDetails());
        String empName = emp.getName();
        currentSal = emp.getSalary();
        System.out.println("After increment, salary of " + empName + " is " + currentSal);
    }
}
