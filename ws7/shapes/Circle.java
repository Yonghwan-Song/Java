/**
 * Name: Yonghwan Song
 * Student ID: 135458198
 * Email: ysong115@myseneca.ca
 */
/**
 * This Triangle class implements Shape interface.
 */
public class Circle implements Shape {
    double radius;
    static final double pi = 3.14159;

    Circle(double radius) throws CircleException{
        if (radius > 0) {
            this.radius = radius;
        }
        else{
            throw new CircleException("Invalid radius!");
        }
    }

    public static double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws CircleException{
        if (radius > 0) {
            this.radius = radius;
        }
        else{
            throw new CircleException("Invalid radius!");
        }
    }

    // This function overrides perimeter function declaration in the Shape
    // interface.
    @Override
    public double perimeter() {
        return 2 * getPi() * getRadius();
    }

    // This function overrides the toString method of Object class.
    @Override
    public String toString() {
        return String.format("%s {r=%.1f} perimeter = %.5f", this.getClass().getName(), getRadius(), perimeter());
        // eturn "Rectangle {w=" + (new Double(getWidth()).toString()) + ", h=" + (new
        // Double(getHeight()).toString()) + "}";
    }
}
