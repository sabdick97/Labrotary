package Collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(23);
		stack.push(45);
		stack.push(90);
		stack.push(78);
		
		System.out.println(stack);
		
		System.out.println("Popping the element: "+stack.pop());
		System.out.println(stack);
		
		
		System.out.println("position: "+stack.search(23));
		
		System.out.println("Top element:"+stack.peek());
		System.out.println(stack);
		
	}

}
