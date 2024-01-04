package Stack;
public class StackUsage {
    public static void main(String[] args) {

        try {
            Stack stack1 = new Stack(-1);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Stack stack1 = new Stack(0);
            stack1.push(2);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Stack stack1 = new Stack(1);
            System.out.println(stack1.top());
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Stack stack1 = new Stack(1);
            System.out.println(stack1.pop());
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Stack stack1 = new Stack(5);
            stack1.push(1);
            stack1.push(3);
            System.out.println(stack1.getSize());
            System.out.println(stack1.top());
            stack1.push(4);
            stack1.push(7);
            System.out.println(stack1.pop());
            stack1.clear();
            System.out.println(stack1.getSize());

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
