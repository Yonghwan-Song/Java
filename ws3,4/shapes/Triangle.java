/**
 * Name: Yonghwan Song
 * Student ID: 135458198
 * Email: ysong115@myseneca.ca
 */
/**
 * This Triangle class implements Shape interface.
 */
public class Triangle implements Shape {
    double side1;
    double side2;
    double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        //The second condition: the length of the maximum side should be less than the sum of the others.
        if (side1*side2*side3 != 0 && Math.max(Math.max(side1,side2), side3)*2<side1+side2+side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else{
            throw new TriangleException("Invalid side(s)!");
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) throws TriangleException{
        if (side1 > 0) {
            this.side1 = side1;
        }
        else{
            throw new TriangleException("Invalid side!");
        }
    }

    public void setSide2(double side2) throws TriangleException{
        if (side2 > 0) {
            this.side2 = side2;
        }
        else{
            throw new TriangleException("Invalid side!");
        }
    }

    public void setSide3(double side3) throws TriangleException {
        if (side3 > 0) {
            this.side3 = side3;
        }
        else{
            throw new TriangleException("Invalid side!");
        }
    }

    // This function overrides perimeter function declaration in the Shape
    // interface.
    @Override
    public double perimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    // This function overrides the toString method of Object class.
    @Override
    public String toString() {
        return String.format("%s {s1=%.1f, s2=%.1f, s3=%.1f} perimeter = %.4f", this.getClass().getName(), getSide1(),
                getSide2(), getSide3(), perimeter());
    }
}
