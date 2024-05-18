package assignment16;


	import java.util.Scanner;
import java.util.Stack;

	public class BalancedParentheses {
	    
	    public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' || c == ']' || c == '}') {
	                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
	                    return false;
	                }
	            }
	        }
	        
	        return stack.isEmpty();
	    }
	    
	    private static boolean isMatching(char open, char close) {
	        return (open == '(' && close == ')') ||
	               (open == '[' && close == ']') ||
	               (open == '{' && close == '}');
	    }
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter parentheses:");
	    	String paren = scanner.next();

	        
	            System.out.println( "is balanced: " + isBalanced(paren));
	        }
	    }
	
	    

	    
	    	    
	


