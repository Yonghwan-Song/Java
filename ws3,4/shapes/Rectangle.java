/**
 * Name: Yonghwan Song
 * Student ID: 135458198
 * Email: ysong115@myseneca.ca
 */
/**
 * Rectangle class is a subclass of Parallelogram class.
 */
public class Rectangle extends Parallelogram {
    Rectangle(double length, double width) throws ParallelogramException{
        // The validation of checking if both parameters are positive values
        // will be done in the super class's constructor.
        super(length, width);
    }

    @Override
    public String toString() {
        return String.format("%s {w=%.1f, h=%.1f} perimeter = %.4f", this.getClass().getName(), getWidth(), getLength(),
                perimeter());
    }
}
