/**
 * Name: Yonghwan Song
 * Student ID: 135458198
 * Email: ysong115@myseneca.ca
 */
/**
 * This Parallelogram class implements Shape interface. And this class becomes
 * the super class of Rectangle class which becomes the super class of Square
 * class.
 */
public class Parallelogram implements Shape {
    protected double length;
    protected double width;

    Parallelogram(double length, double width) throws ParallelogramException {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            throw length == width ? new ParallelogramException("Invalid side!")
                    : new ParallelogramException("Invalid side(s)!");
        }

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws ParallelogramException {
        if (length > 0) {
            this.length = length;
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws ParallelogramException {
        if (width > 0) {
            this.width = width;
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    // This function overrides perimeter function declaration in the Shape
    // interface.
    // This overriden function will be inherited by both the Rectangle and Square
    // classes.
    @Override
    public double perimeter() {
        return 2 * (getLength() + getWidth());
    }

    // This function overrides the toString method of Object class.
    // This overriden function will be inherited by both the Rectangle and Square
    // classes.
    @Override
    public String toString() {
        return String.format("%s {w=%.1f, h=%.1f} perimeter = %.4f", this.getClass().getName(), getWidth(), getLength(),
                perimeter());
    }
}
