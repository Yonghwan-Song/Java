
/**
 * Workshop 6
 * Full Name: Yonghwan Song       Student ID: 135458198
 * Section: NDD                   Email: ysong115@myseneca.ca
 */

import java.io.Serializable;
import java.util.ArrayList;

//This object becomes serializable by implementing the Serializable marker interface.
public class Student implements Serializable {
    private int stdID;
    private String firstName;
    private String lastName;
    private ArrayList<String> courses;

    Student(int stdID, String firstName, String lastName, ArrayList<String> courses) {
        this.stdID = stdID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = (ArrayList<String>) courses.clone();
    }

    // getters
    public int getStdID() {
        return stdID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = (ArrayList<String>) courses.clone();
    }

}
