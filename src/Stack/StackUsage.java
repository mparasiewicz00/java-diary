package Stack;
import Stack.Stack;
public class StackUsage {
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);

        System.out.println(stack1.getSize());

        stack1.push(1);



        stack1.clear();

        stack1.push(2);
        stack1.push(5);
        System.out.println(stack1.pop());
        System.out.println(stack1.getSize());
        System.out.println(stack1.top());
    }
}
