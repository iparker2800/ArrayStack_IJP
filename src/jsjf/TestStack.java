package jsjf;
  
/**
 * 
 /**
 * This class is used to reverse a given string
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 4
 * Spring Semester 2020
 * 
 */

import java.util.Arrays;

public class TestStack {

    public static void main(String[] args) {
    	//Creates a new Stack
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        System.out.println("Testing a Stack");
        //Pushing three elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack);
        
        System.out.print("***************\n");
        //This will remove the top element
        stack.pop();
        //Pushing two new elements to the stack
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.print("***************\n");
        
        //Removes the top element in the stack
        System.out.println(stack.pop());
        
        //Peek, which retrieves the first element of the stack
        System.out.println(stack.peek());
        System.out.print("***************\n");

        System.out.println("Is the stack empty: "+ stack.isEmpty());//Tests is Empty
        System.out.println("The size of the stack is: " + stack.size());//Tests the stack size
        System.out.println("The stack contains:\n" + stack.toString());// Tests the toString
        }//Closes Main
    }//Closes the TestStack Class