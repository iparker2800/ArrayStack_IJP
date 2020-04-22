package jsjf;
/**
 * This class is used to reverse a given string
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 4
 * Spring Semester 2020
 * 
 */

import java.util.*;

public class Application {
	
	public static void main(String[] args) {

		//Scanner for the string and input of message
		Scanner a = new Scanner(System.in);
		boolean working = true;
	/**
	 * While loop that uses the reverse string method
	 */
	while(working) {
		System.out.print("Type a sentence: ");
		String s = a.nextLine();
		
		s = reverseString(s);
		
		System.out.println("Reverse: "+ s);
		//Boolean for entering another sentence
		boolean again= true;
		/**
		 *While loop that is asking the user to enter another sentence
		 */
		while(again) {
			System.out.println("Would you like to type another sentence? ");
			String r = a.nextLine();
			if(r.equalsIgnoreCase("y")) {
				working = true;
				again = false;
			} else if(r.equalsIgnoreCase("n")) {
				System.out.println("Goodbye! :)");
				working = false;
				again = false;
			}else {
				System.out.println("Wrong input, retry");
				again = true;
			}	
		}
	}
}
	
	public static String reverseString(String s) {
		if(s == null || s.equals(""))
			return s;
		//Creating a new stack
		
		Stack<Character> stack = new Stack<Character>();
		
		//For loop to get each character in the stack
		for(int i=0; i< s.length(); i++)
			stack.push(s.charAt(i));
		
		//Creates a string builder
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty())
			sb.append(stack.pop());
		
		return sb.toString();
	}//Closes the reverseString
}//Closes the Application class