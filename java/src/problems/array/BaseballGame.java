package problems.array;

import java.util.Stack;

/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

Given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x: Record a new score of x.
'+': Record a new score that is the sum of the previous two scores.
'D': Record a new score that is the double of the previous score.
'C': Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.
 */
public class BaseballGame {

    public static void main(String[] args) {

        String[] operations = {"1", "2", "+", "C", "5", "D"};

        int result = calculatePoints(operations);

        System.out.print(result);
    }

    public static int calculatePoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String s : operations) {
            if (s.equals("D")) {
                int score = stack.peek() * 2;
                stack.push(score);
            } else if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("+")) {
                int temp = stack.pop();
                int score = stack.peek() + temp;
                stack.push(temp);
                stack.push(score);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        for (int score : stack) {
            result += score;
        }
        return result;
    }
}
