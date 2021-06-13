/**
 * Name: Yonghwan Song
 * Student ID: 135458198
 * Email: ysong115@myseneca.ca
 */

//I tried to make Workshop2 class that includes Palindrome and Stack classes, but 
//I was stuck in an error. So, this weird structure is my best for now..
//Palindrome includes Stack class and even includes Stack object as a field.
public class Workshop2 {
    

    public static class Stack {
        char[] charArray;
        int length;
        int currentSize;

        public void setLength(int length) {
            this.length = length;
            //allocate heap for this char array.
            charArray = new char[length];
        }
        public char[] getCharArray() {
            return charArray;
        }
        public int getLength() {
            return length;
        }
        public int getCurrentSize() {
            return currentSize;
        }
        void push(char c) {
            charArray[currentSize] = c; 
            currentSize++;
        }
        char pop() {
            return charArray[currentSize-- - 1];
        }
    }

    public static class Palindrome {
        //#region previous
        // // Fields for Palindrome Class
        // String clArgument;
        // Stack innerStack;

        // //Constructor will construct a Palindrome object by receving the command line argument string.
        // Palindrome(String arg) {
        //     clArgument = new String(arg);
        //     innerStack = new Stack();
        // }

        // //method to return if the command line argument, which was received as an argument for this class, is palindrome or not.
        // boolean isPalindrome() {
        //     //firstly, setting the size of char array in the Stack class is needed.
        //     innerStack.setLength(clArgument.length());

        //     for(int i=0; i < clArgument.length(); i++) {
        //         innerStack.push(clArgument.charAt(i));
        //     }

        //     boolean isPalin = true;
        //     for(int i=0; i<clArgument.length(); i++) {
        //         if(clArgument.charAt(i) != innerStack.pop()) {
        //             isPalin = false;
        //         }
        //     }

        //     return isPalin;
        // }
//#endregion

    public static void main(String[] args) {
                // Workshop2 palin = new Workshop2(args[0]);
                
                // System.out.println(palin.isPalindrome());
                System.out.println("Hello world!");
                Stack stack = new Stack();
                stack.setLength(3);
                stack.push('s');
                stack.push('y');
                stack.push('h');
                System.out.println(stack.getCharArray());
                //대충 이런식으로 하라는 듯...

            }
    }
    
    
}
