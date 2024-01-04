package Stack;

import java.util.Scanner;

class StackFullException extends RuntimeException{};
class StackEmptyException extends RuntimeException{};
public class Stack {
    private static int currentSize;
    private static int[] values;
    public Stack(int size) {
        if (size < 0) {
            throw new IllegalArgumentException();
        }
        values = new int[size];
    }

    public int getSize() {
        return currentSize;
    }
    //clear stack elements
    public void clear() {
        currentSize = 0;
    }
    //add int element to stack
    public void push(int added) {
        if (currentSize == values.length) {
            throw new StackFullException();
        } else {
            values[currentSize] = added;
            currentSize++;
        }
    }
    //delete last added stack element and return current last element
    public int pop() {
        if (currentSize == 0) {
            throw new StackEmptyException();
        } else {
            currentSize--;
            return values[currentSize];
        }
    }
    //return current top element
    public int top() {
        if (currentSize == 0) {
            throw new StackEmptyException();
        } else {
            return values[currentSize -1];
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
