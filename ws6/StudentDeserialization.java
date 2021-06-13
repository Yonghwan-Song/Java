/**
 * Workshop 6
 * Full Name: Yonghwan Song       Student ID: 135458198
 * Section: NDD                   Email: ysong115@myseneca.ca
 */
import javax.swing.JFrame;

//In this class, the frame for deserialization is instantiated.
public class StudentDeserialization {
   public static void main(String[] args) {
      StudentDeserialFrame textAreaFrame = new StudentDeserialFrame();
      textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textAreaFrame.setSize(425, 500);
      textAreaFrame.setVisible(true);
   }
}