package assignment16;


	import java.util.Scanner;
import java.util.Stack;

	public class InfixToPostfix {

	    
	    private static int precedence(char ch) {
	        switch (ch) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	                return 3;
	        }
	        return -1; 
	    }

	   
	    public static String infixToPostfix(String expression) {
	        StringBuilder result = new StringBuilder(); 
	        Stack<Character> stack = new Stack<>();   

	        
	        for (char c : expression.toCharArray()) {
	            if (Character.isLetterOrDigit(c)) {
	                result.append(c); 
	            } else if (c == '(') {
	                stack.push(c);
	            } else if (c == ')') {
	                while (!stack.isEmpty() && stack.peek() != '(') {
	                    result.append(stack.pop());
	                }
	                stack.pop(); 
	            } else {
	                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
	                    result.append(stack.pop()); 
	                }
	                stack.push(c); 
	            }
	        }

	        
	        while (!stack.isEmpty()) {
	            result.append(stack.pop());
	        }

	        return result.toString(); 
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        String expression = sc.nextLine();
	        System.out.println("Infix Expression: " + expression);
	        System.out.println("Postfix Expression: " + infixToPostfix(expression));
	    }
	}


