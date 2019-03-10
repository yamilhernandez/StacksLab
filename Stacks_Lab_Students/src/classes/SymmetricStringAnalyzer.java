package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}
	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() { 
		SLLStack<Character> stack = new SLLStack<Character>();
		for (int i = 0; i < this.s.length(); i++) {
			char c= s.charAt(i);
			if(Character.isLetter(c)) {
			if(Character.isUpperCase(c)) {
				stack.push(c);
			}
			if(Character.isLowerCase(c)) {
				if(stack.top()== Character.toUpperCase(c)) {
					stack.pop();
				}
				else return false;
			}
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		
		return true;  // need to change if necessary....
	}
	
	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
	throws StringIsNotSymmetricException 
	{
		SLLStack<Character> stack = new SLLStack<Character>();
		String str= "";
		for (int i = 0; i < this.s.length(); i++) {
			char c= s.charAt(i);
			if(Character.isLetter(c)) {
			if(Character.isUpperCase(c)) {
				stack.push(c);
				str+=" <" +c+ " ";
			}
			if(Character.isLowerCase(c)) {
				if(stack.top()== Character.toUpperCase(c)) {
					stack.pop();
					str+=" "+c+"> ";
				}
				
			}
			
			}
		}
		
		return str;  // need to change if necessary....
	}

}
