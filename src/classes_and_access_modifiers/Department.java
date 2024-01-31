package classes_and_access_modifiers;

public class Department {
    private int deptNo; //Makes this variable accessible only within the class
    private String name;

    public void assignValues(int dno, String dnm) {
        deptNo = dno;
        name = dnm;
    }

    public String getDeptDetails() {
        System.out.println();
        String details = "Department No: " + deptNo + ", Name: " + name;
        return details;
    }

    public void changeName(String name){
        this.name = name;//this.name = newName
    }
}

