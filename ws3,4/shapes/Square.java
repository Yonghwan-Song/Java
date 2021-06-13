/**
 * Name: Yonghwan Song
 * Student ID: 135458198
 * Email: ysong115@myseneca.ca
 */
/**
 * Square class is a subclass of Rectangle class.
 */
public class Square extends Rectangle {
    Square(double side) throws ParallelogramException {
        // The validation of checking if the parameter is a positive value
        // will be done in the Parallelogram's constructor.W
        super(side, side);
    }

    @Override
    public void setLength(double length) throws ParallelogramException {
        if (length > 0) {
            this.length = length;
            this.width = length;
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    @Override
    public void setWidth(double width) throws ParallelogramException {
        if (width > 0) {
            this.width = width;
            // todo: is it duplicated?
            this.length = width;
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    @Override
    public String toString() {
        return getWidth()>0.001?String.format("%s {s=%.1f} perimeter = %.4f", this.getClass().getName(), getWidth(), perimeter())
                            :String.format("%s {s=%1.1e} perimeter = %1.5e", this.getClass().getName(), getWidth(), perimeter());
    }
}
