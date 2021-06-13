/**
 * Workshop 6
 * Full Name: Yonghwan Song       Student ID: 135458198
 * Section: NDD                   Email: ysong115@myseneca.ca
 */
import java.io.*;
import java.util.ArrayList;
import java.awt.FlowLayout;
//#region Related to handling an event.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//#endregion
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;

//This class is used to create a frame with regard to serialization GUI.
public class StudentSerialFrame extends JFrame {
   private final JTextField student1;
   private final JTextField stu1StudentID;
   private final JTextField stu1FirstName;
   private final JTextField stu1LastName;
   private final JTextField stu1Subject1;
   private final JTextField stu1Subject2;
   private final JTextField stu1Subject3;
   private final JTextField student2;
   private final JTextField stu2StudentID;
   private final JTextField stu2FirstName;
   private final JTextField stu2LastName;
   private final JTextField stu2Subject1;
   private final JTextField stu2Subject2;
   private final JTextField stu2Subject3;
   private final JTextField student3;
   private final JTextField stu3StudentID;
   private final JTextField stu3FirstName;
   private final JTextField stu3LastName;
   private final JTextField stu3Subject1;
   private final JTextField stu3Subject2;
   private final JTextField stu3Subject3;
   private final JButton plainJButton;

   public StudentSerialFrame() {
      super("Students Serialization");
      setLayout(new FlowLayout());
      Box box = Box.createVerticalBox();

      // #region student1
      student1 = new JTextField("Student1");
      student1.setEditable(false);
      box.add(student1);

      stu1StudentID = new JTextField("111");
      box.add(stu1StudentID);

      stu1FirstName = new JTextField("Yonghwan");
      box.add(stu1FirstName);

      stu1LastName = new JTextField("Song");
      box.add(stu1LastName);

      stu1Subject1 = new JTextField("Computer Principles");
      box.add(stu1Subject1);

      stu1Subject2 = new JTextField("Linux");
      box.add(stu1Subject2);

      stu1Subject3 = new JTextField("C programming");
      box.add(stu1Subject3);
      // #endregion

      // #region student2
      student2 = new JTextField("Student2");
      student2.setEditable(false);
      box.add(student2);

      stu2StudentID = new JTextField("222");
      box.add(stu2StudentID);

      stu2FirstName = new JTextField("Junseo");
      box.add(stu2FirstName);

      stu2LastName = new JTextField("Hwang");
      box.add(stu2LastName);

      stu2Subject1 = new JTextField("Object Oriented Programming 1");
      box.add(stu2Subject1);

      stu2Subject2 = new JTextField("Introduction to Database");
      box.add(stu2Subject2);

      stu2Subject3 = new JTextField("Web Programming fundamentals");
      box.add(stu2Subject3);
      // #endregion

      // #region student3
      student3 = new JTextField("Student3");
      student3.setEditable(false);
      box.add(student3);

      stu3StudentID = new JTextField("333");
      box.add(stu3StudentID);

      stu3FirstName = new JTextField("Sukwon");
      box.add(stu3FirstName);

      stu3LastName = new JTextField("Jang");
      box.add(stu3LastName);

      stu3Subject1 = new JTextField("Object Oriented Programming 2");
      box.add(stu3Subject1);

      stu3Subject2 = new JTextField("Advanced Database");
      box.add(stu3Subject2);

      stu3Subject3 = new JTextField("Web Programming FrameWorks");
      box.add(stu3Subject3);
      // #endregion

      plainJButton = new JButton("Create a Student");
      box.add(plainJButton);

      add(box);

      ButtonHandler bttnHandler = new ButtonHandler();
      plainJButton.addActionListener(bttnHandler);

   }

   // eventHandler to the plainButton being clicked.
   private class ButtonHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent event) {
         // 보류
         JOptionPane.showMessageDialog(null,
               String.format("Students: %s %s, %s %s, %s %s were created", stu1FirstName.getText(),
                     stu1LastName.getText(), stu2FirstName.getText(), stu2LastName.getText(), stu3FirstName.getText(),
                     stu3LastName.getText()));

         // Create a Student Object using input data.
         //
         ArrayList<String> subjects = new ArrayList<String>();
         subjects.add(stu1Subject1.getText());
         subjects.add(stu1Subject2.getText());
         subjects.add(stu1Subject3.getText());

         // converts the first parameter to an integer.
         Student firstStudent = new Student(Integer.parseInt(stu1StudentID.getText()), stu1FirstName.getText(),
               stu1LastName.getText(), subjects);

         subjects.clear();
         subjects.add(stu2Subject1.getText());
         subjects.add(stu2Subject2.getText());
         subjects.add(stu2Subject3.getText());
         Student secondStudent = new Student(Integer.parseInt(stu2StudentID.getText()), stu2FirstName.getText(),
               stu2LastName.getText(), subjects);

         subjects.clear();
         subjects.add(stu3Subject1.getText());
         subjects.add(stu3Subject2.getText());
         subjects.add(stu3Subject3.getText());
         Student thirdStudent = new Student(Integer.parseInt(stu3StudentID.getText()), stu3FirstName.getText(),
               stu3LastName.getText(), subjects);

         try {
            FileOutputStream fos = new FileOutputStream("file2.out");
            ObjectOutputStream oos = new ObjectOutputStream((fos));

            oos.writeObject(firstStudent);
            oos.writeObject(secondStudent);
            oos.writeObject(thirdStudent);

            oos.flush();
            fos.close();
         } catch (Throwable e) {
            System.err.println(e);
         }
      }
   }

}