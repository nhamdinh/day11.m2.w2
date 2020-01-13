import java.util.Random;
import java.util.Stack;

class StackInteger {
    public static void main(String[] agrs) {
        Random random = new Random();
        Stack<Integer> wStack = new Stack<Integer>();
        Stack<Integer> mStack = new Stack<Integer>();

        for (int i = 0; i < 8; i++)
            wStack.push(random.nextInt(100));

        System.out.println("stack before: "+wStack);

        while (!wStack.isEmpty()) {
            wStack.peek();
            mStack.push(wStack.peek());
            wStack.pop();
        }

        System.out.println("stack after: "+mStack);

//        while (!stack2.isEmpty()
//        ) {
//            System.out.print(stack2.peek() + "   ");
//            stack2.pop();
//        }

    }
}
