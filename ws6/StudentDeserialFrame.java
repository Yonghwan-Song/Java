/**
 * Workshop 6
 * Full Name: Yonghwan Song       Student ID: 135458198
 * Section: NDD                   Email: ysong115@myseneca.ca
 */
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

//This class is used to create a frame with regard to deserialization GUI.
public class StudentDeserialFrame extends JFrame {
   private final JTextArea textArea1; // textArea1 will display a Student when the button is clicked.
   private final JButton deserialButton; // initiates copying of text

   // no-argument constructor
   public StudentDeserialFrame() {
      super("Students Deserialization");

      Box box = Box.createVerticalBox(); // create box
      textArea1 = new JTextArea(10, 15);
      textArea1.setEditable(false);
      box.add(new JScrollPane(textArea1)); // add scrollpane

      deserialButton = new JButton("Deserialize");
      box.add(deserialButton);
      deserialButton.addActionListener(new ActionListener() // anonymous inner class
      {
         @Override
         public void actionPerformed(ActionEvent event) {
            try {

               FileInputStream fis = new FileInputStream("file2.out");
               ObjectInputStream ois = new ObjectInputStream(fis);

               // allocating memory before assigning values.
               Student arrStudent[] = new Student[3];

               for (int i = 0; i < arrStudent.length; i++) {
                  // downcast to Student Objects from Object superClass because the return type of
                  // readObject is the Object.
                  arrStudent[i] = (Student) ois.readObject();
               }

               fis.close();
               String studentToBePrinted = "";
               // to print out each object in the arrStudent array.
               for (int i = 0; i < arrStudent.length; i++) {
                  studentToBePrinted = studentToBePrinted + "STUDENT" + (i + 1) + " INFORMATION" + '\n';
                  studentToBePrinted = studentToBePrinted + String.format("  Student ID: %d     Full Name: %s %s\n",
                        arrStudent[i].getStdID(), arrStudent[i].getFirstName(), arrStudent[i].getLastName());
                  studentToBePrinted = studentToBePrinted + "  Courses: ";

                  for (int j = 0; j < arrStudent[i].getCourses().size(); j++) {
                     studentToBePrinted = studentToBePrinted + '\n' + arrStudent[i].getCourses().toArray()[j];
                     // getCourse() returns the reference variable of ArrayList<String>
                     // Hence, ~~~.toArray()[j] converts to a String.
                  }
                  studentToBePrinted = studentToBePrinted + '\n' + '\n';

               }
               // after the studentToBePrinted string is calculated, set it as a text.
               textArea1.setText(studentToBePrinted);

            } catch (Throwable e) {

               System.err.println(e);

            }

         }
      } // end anonymous inner class
      ); // end call to addActionListener

      add(box); // add box to frame
   }
}
