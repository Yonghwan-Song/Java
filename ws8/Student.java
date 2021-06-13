/**
 * Workshop 8.
 * 
 * Student Name: Yonghwan Song        Student ID: 135458198
 * Email: ysong115@myseneca.ca
 * Course: JAC444NDD
 */

public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    private String department;

    Student(String firstName, String lastName, double grade, String department){
        this.firstName=firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.department = department;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getGrade() {
        return grade;
    }
    public String getDepartment() {
        return department;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    //
    String getName() {
        return getFirstName()+' '+getLastName();
    }

    @Override
    public String toString() {
        return getName() + "  " + getGrade() + "  " + getDepartment();
    }

    @Override
    //The assumption is that each student has their unique name.
    //I assumed this way because the Student class does not have a Student ID field.
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Student) {
            //using the overriden equals of String class.
            return this.getName().equals(((Student) obj).getName());//downcasting.
        }else{
            return false;
        }
    }
}
