/**
 * Workshop 6
 * Full Name: Yonghwan Song       Student ID: 135458198
 * Section: NDD                   Email: ysong115@myseneca.ca
 */
import javax.swing.JFrame;

//In this class, the frame for serialization is instantiated.
public class StudentSerialization {
   public static void main(String[] args) {
      StudentSerialFrame studentInputFrame = new StudentSerialFrame();
      studentInputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      studentInputFrame.setSize(350, 600);
      studentInputFrame.setVisible(true);
   }
}
