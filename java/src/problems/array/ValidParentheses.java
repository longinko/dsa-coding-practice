package problems.array;

import java.util.Stack;

//You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (c == ')' && !stack.pop().equals('(')){
                return false;
            } else if (c == ']' && !stack.pop().equals('[')){
                return false;
            } else if (c == '}' && !stack.pop().equals('{')){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
