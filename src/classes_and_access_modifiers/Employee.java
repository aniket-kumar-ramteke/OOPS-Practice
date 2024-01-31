package classes_and_access_modifiers; //lowercased naming convention for packages

public class Employee { //TitleCased naming convention for classes

    // This class is for storing information about employees

    /*
	 	Eventually objects are going to be created
	 	to handle employee information
	*/
    int empNo; //camelCased naming convention for variables
    String name;
    float salary;

    public void assignValues(int eno, String nameGiven, float sal){ // method to assign - values to object's fields
        empNo = eno;
        name = nameGiven;
        salary = sal;
    }

    public String getEmployeeDetails(){ // method to get assigned - values of object's fields
        String empDetails = "[ Employee No: " + empNo + ", Name:  " + name + ", Salary: " + salary + " ]";
        return empDetails;
    }

    public int getEmpNo() {
        return empNo;
    }

    /*
    * 'this' reference: It is a reference that refers to the current object. It is required to resolve the
	scope of the variable. If local variable name conflicts with permanent field name, then local variable gets a
	priority.
	* */
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

