import java.util.Stack;

public class StackString {
    public static void main(String[] args) {
        String mWord = new String("code gym");
        System.out.println("Chuoi nhap: " + mWord);
        Stack<Character> wStack = new Stack<>();
        Stack<Character> mStack = new Stack<>();

        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }
        System.out.println("Nhet vao stack: " + wStack);

        System.out.print("Dao nguoc + in ra: ");
        while (!wStack.isEmpty()
        ) {
            wStack.peek();
//            System.out.print(wStack.peek());
            mStack.push(wStack.peek());
            wStack.pop();
        }
        while (!mStack.isEmpty()) {
            mStack.peek();
            System.out.print(mStack.peek());
            mStack.pop();
        }
    }
}



