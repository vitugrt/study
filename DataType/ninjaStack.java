package BasicLevel.DataType;


import java.util.Stack;

public class ninjaStack {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        System.out.println("My stack is: " + ninjaStack);

        ninjaStack.pop();
        System.out.println("After a pop is: " + ninjaStack);

        System.out.println("The next element is: " + ninjaStack.peek());
        System.out.println("And it contains " + ninjaStack.size() + " elements");
    }
}