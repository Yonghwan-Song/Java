//Custom Exception class to be used for Parallelogram, Rectangle, and Shape because they are actually sorts of Paralleogram.
public class ParallelogramException extends Exception{
    ParallelogramException(String message){
        super(message);
    }
}
