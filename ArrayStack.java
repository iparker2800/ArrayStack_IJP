package jsjf;

import jsjf.exceptions.*;
import java.util.Arrays;

/**
 * 
 * @author Isaiah Parker
 * @version 1.8
 * Programming Project 4
 * Spring Semester 2020
 * 
 */
public class ArrayStack<T> implements StackADT<T>
{
	private final static int DEFAULT_CAPACITY = 100;

	private int top;  
	private T[] stack;

	/**
	 * Creates an empty stack using the default capacity.
	 */
	public ArrayStack()
	{
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Creates an empty stack using the specified capacity.
	 * @param initialCapacity the initial size of the array 
	 */
	public ArrayStack(int initialCapacity)
	{
		top = 0;
		stack = (T[])(new Object[initialCapacity]);
	}

	/**
	 * Adds the specified element to the top of this stack, expanding
	 * the capacity of the array if necessary.
	 */
	public void push(T element)
	{
		if (size() == stack.length) 
			expandCapacity();

		stack[top] = element;
		top++;
	}

	/**
	 * Creates a new array to store the contents of this stack with
	 * twice the capacity of the old one.
	 */
	private void expandCapacity()
	{
		stack = Arrays.copyOf(stack, stack.length * 2);   
	}

	/**
	 * Removes the element at the top of this stack and returns a
	 * reference to it. 
	 */
	public T pop() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("stack");

		top--;
		T result = stack[top];
		stack[top] = null; 

		return result;
	}

	
	public T peek() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("stack");

		return stack[top-1];
	}

	/**
	 * Returns true if this stack is empty and false otherwise. 
	 * 
	 */
	public boolean isEmpty()
	{
		if(stack.length< 1)
			return true;
		
		return false; 
	}

	/**
	 * Returns the number of elements in this stack.
	 * 
	 */
	public int size()
	{
		return top;
	}

	/**
	 * Returns a string representation of this stack. 
	 * 
	 */
	public String toString()
	{
		
		String s = "";
		for (int i=0; i<top; i++)
			s= s + stack[i].toString()+ "\n";
			return s;
	}
}//Closes the ArrayStack class

