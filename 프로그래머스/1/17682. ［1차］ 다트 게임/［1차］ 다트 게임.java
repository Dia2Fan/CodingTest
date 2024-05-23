import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        int number = 0;

        for (char ch : dartResult.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else {
                switch (ch) {
                    case 'S':
                        stack.push((int) Math.pow(number, 1));
                        break;
                    case 'D':
                        stack.push((int) Math.pow(number, 2));
                        break;
                    case 'T':
                        stack.push((int) Math.pow(number, 3));
                        break;
                    case '*':
                        if (!stack.isEmpty()) {
                            int prev = stack.pop() * 2;
                            if (!stack.isEmpty()) {
                                stack.push(stack.pop() * 2); 
                            }
                            stack.push(prev);
                        }
                        break;
                    case '#':
                        if (!stack.isEmpty()) {
                            stack.push(-stack.pop()); 
                        }
                        break;
                }
                number = 0; 
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}