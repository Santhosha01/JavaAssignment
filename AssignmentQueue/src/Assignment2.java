import java.util.Scanner;
import java.util.Stack;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                ans += s.charAt(i);
            } else {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                }
                else {
                    if ((getVal(stack.peek()) >= getVal(s.charAt(i)))) {
                        while(!stack.isEmpty()){
                            ans += stack.pop();
                        }
                        stack.push(s.charAt(i));
                    } else {
                        stack.push(s.charAt(i));
                    }
                }
            }
        }
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        System.out.println(ans);
    }

    public static int getVal(char s) {
        int val = 0;
        switch (s) {
            case '+':
                val = 1;
                break;
            case '-':
                val = 1;
                break;
            case '*':
                val = 2;
                break;
            case '/':
                val = 3;
                break;
            case '^':
                val=4;
                break;
        }
        return val;
    }
}
