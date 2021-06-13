
/**
 * Name: Yonghwan Song Student ID: 135458198 Email: ysong115@myseneca.ca
 */
import java.io.*;

public class Main {
    public static void main(String[] args)
            throws IOException, ParallelogramException, TriangleException, CircleException {
        
        System.out.println("------->Task 1 ... <-------");


        // The elements of shapes array are of Shape type.
        // But, they are dynamically referencing each object of different types.
        // (Polymorphism)
        Shape[] shapes = new Shape[43];// hardcoded for the size of this array.

        int i = 0;// index of the shapes array.
        try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] tokens = str.split(",");

                // #region Exceptions for Shape
                try {
                    if (tokens[0].equals("Parallelogram") && tokens.length == 3) {
                        shapes[i] = new Parallelogram(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                        ++i;
                    } else if (tokens[0].equals("Rectangle") && tokens.length == 3) {
                        shapes[i] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                        ++i;
                    } else if (tokens[0].equals("Square") && tokens.length == 2) {
                        shapes[i] = new Square(Double.parseDouble(tokens[1]));
                        ++i;
                    } else if (tokens[0].equals("Triangle") && tokens.length == 4) {
                        shapes[i] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
                                Double.parseDouble(tokens[3]));
                        ++i;
                    } else if (tokens[0].equals("Circle") && tokens.length == 2) {
                        shapes[i] = new Circle(Double.parseDouble(tokens[1]));
                        ++i;
                    } else {
                        // For lines other than shapes, just skip them.... eg. something, garbage.
                    }
                } catch (ParallelogramException p) {
                    System.out.println(p.getMessage());
                } catch (TriangleException t) {
                    System.out.println(t.getMessage());
                } catch (CircleException c) {
                    System.out.println(c.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(i + "shapes were created:");
            
        }
        // #endregion

        //for task1.
        for (Shape shape : shapes) {
            if (shape != null)
                System.out.println(shape);
        }

        System.out.println("------->Task 2 ... <-------");
    
        double max = 0.0; //hardcoded
        double min = 1000.0; //hardcoded
        int j;

        for (j = 0; j < shapes.length; j++) {
            if (shapes[j] instanceof Triangle && min > shapes[j].perimeter()) {
                min = shapes[j].perimeter();
            } else if (shapes[j] instanceof Circle && shapes[j].perimeter() > max) {
                max = shapes[j].perimeter();
            }
        }

        for (Shape shape : shapes) {
            // To find if there are the same values as min or max And remove them before print.
            if (shape instanceof Triangle && shape.perimeter() == min) {
                shape = null;
            } else if (shape instanceof Circle && shape.perimeter() == max) {
                shape = null;
            }

            if (shape != null)
                System.out.println(shape);
        }

        System.out.println("------->Task 3 ... <-------");
        double totalParallelogram = 0.0;
        double totalTriangle = 0.0;

        for (Shape shape : shapes) {

            // For some reason, I had to repeat this step to delete Trianlge objects the perimeter of which are minimum.
            if (shape instanceof Triangle && shape.perimeter() == min) {
                shape = null;
            }

            // instanceof --> was applied to total heirarchy of inheritance.
            // Hence, I had to use getClass() method.
            if (shape != null) {
                if (shape.getClass().getName().equals("Parallelogram")) {
                    totalParallelogram += shape.perimeter();
                } else if (shape.getClass().getName().equals("Triangle")) {
                    totalTriangle += shape.perimeter();
                }
            }

        }

        System.out.printf("Total perimeter of Parallelogram is: %.14f \n", totalParallelogram);
        System.out.printf("Total perimeter of Triangle is: %.1f", totalTriangle);
    }

}
