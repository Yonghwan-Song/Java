
/**
 * Full Name: Yonghwan Song       Student ID: 135458198
 * Section: NDD                   Email: ysong115@myseneca.ca
 */

import java.io.*;

public class StudentDeserial {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("file.out");

            ObjectInputStream ois = new ObjectInputStream(fis);

            // allocating memory before assigning values.
            Student arrStudent[] = new Student[3];

            for (int i = 0; i < arrStudent.length; i++) {
                // downcast to Student Objects from Object superClass because the return type of
                // readObject is the Object.
                arrStudent[i] = (Student) ois.readObject();

            }

            fis.close();

            // to print out each object in the arrStudent array.
            for (int i = 0; i < arrStudent.length; i++) {

                System.out.println("STUDENT" + (i + 1) + " INFORMATION");

                System.out.printf("  Student ID: %d     Full Name: %s %s\n", arrStudent[i].getStdID(),
                        arrStudent[i].getFirstName(), arrStudent[i].getLastName());

                System.out.println("  Courses: ");

                arrStudent[i].getCourses().forEach((course) -> {
                    System.out.println("    " + course);

                });
                System.out.println("\n");

            }

        } catch (Throwable e) {

            System.err.println(e);

        }

    }
}
