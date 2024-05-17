import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paranthesis = sc.nextLine();
        Stack<Character> s = new Stack<>();
        if (paranthesis.length() % 2 != 0) {
            System.out.println("false");
        } else {
            System.out.println(checkparanthesis(paranthesis, s));
        }
    }

    private static boolean checkparanthesis(String paranthesis, Stack<Character> s) {
        for (int i = 0; i < paranthesis.length(); i++) {
            if('('== paranthesis.charAt(i)||'{'== paranthesis.charAt(i)||'['== paranthesis.charAt(i)) {
                s.push(paranthesis.charAt(i));
            }
            else{
                char check = switch (paranthesis.charAt(i)) {
                    case ')' -> '(';
                    case '}' -> '{';
                    case ']' -> '[';
                    default -> 0;
                };
                if(s.pop()!=check){
                    return false;
                }
            }
        }
        return true;
    }
}