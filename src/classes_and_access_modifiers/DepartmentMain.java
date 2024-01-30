package classes_and_access_modifiers;

public class DepartmentMain {

    public static void main(String[] args) {
        Department dept = new Department();
        dept.assignValues(101, "Purchase");

        Department dept2 = new Department();
        dept2.assignValues(102, "Printing and Publishing");

        String details1 = dept.getDeptDetails();
        String details2 = dept2.getDeptDetails();
        System.out.println(details1);
        System.out.println(details2);
        System.out.println(dept2.getDeptDetails());
    }
}
