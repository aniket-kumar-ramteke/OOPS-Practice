package classes_and_access_modifiers;

public class EmployeeMain {

    public static void main(String[] args) {

        // Creating an object of class: Employee
        Employee emp = new Employee();
        //In the above statement, 'emp' is not an object; rather it is a reference
        //referring to an object of class Employee

        //Assigning values for the Employee object referred by reference: 'emp'
        emp.empNo= 1001;
        emp.name = "Ram";
        //emp.salary = 45678.56;
        //The above commented statement gives compilation error because by default
        //fractions are considered of type 'double' and 'salary' field is of type 'float'
        //To handle this, explicit cast is necessary e.g. emp.salary = (float)45678.56;
        //It can be simplified by suffixing 'f'
        emp.salary = 45678.56f;

        //Retrieving values from Employee object referred by reference: emp
        System.out.println("Employee No: " + emp.empNo);
        System.out.println("Name: " + emp.name);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Annual Salary: " + (emp.salary * 12));

        //Creating one more object of Employee
        Employee emp2 = new Employee();
        //Complete the remaining code for assigning and fetching the values

    }

}
