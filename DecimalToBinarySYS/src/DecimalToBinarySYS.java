import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinarySYS {

    public void convertToBinary(int number) {

        Stack<Integer> stack = new Stack<>();

        while (number != 0) {
            int surplus = number % 2;
            stack.push(surplus);
            number = number / 2;
        }

        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thap phan can chuyen doi: ");
        int decimalNumber = scanner.nextInt();
        DecimalToBinarySYS binaryNumber = new DecimalToBinarySYS();

        System.out.print("He nhi phan của " + decimalNumber + " là :");
        binaryNumber.convertToBinary(decimalNumber);

    }

}