/******************* Program Identification ************************************************/
/* COURSE: CS 380		Data Structures 				                 
/* PROJECT #  : 6 					                   			       
/* DUE DATE :	April 18th, 2016							      
/* SOURCE FILE :  CS380_Project6.java            				                   
/* Instructor: Dr. Samuel Sambasivam                                                                  
/*                                                                                                                                  
/* Student Name:    Monica Bebawy                                                                                                    
/* Student ID: 		002-48-8529				       
/* *******************************************************************************************/

/**
 * This class defines the linked list as Node
 *
 */

public class Node
{
	private String value;
	private Node left, right;
	
	// Constructors 
	public Node() 
	{
		this.value = null;
		this.left = null;
		this.right = null;
	}
	public Node(String newName) 
	{
		this.value = newName;
		this.left = null;
		this.right = null;
	}
	// getters and setters 
	public String getValue() 
	{
		return value;
	}
	public void setValue(String name) 
	{
		this.value = name;
	}
	public Node getLeft()
	{
		return left;
	}
	public void setLeft(Node left) 
	{
		this.left = left;
	}
	public Node getRight()
	{
		return right;
	}
	public void setRight(Node right) 
	{
		this.right = right;
	}
	// ToString 
	public String toString() 
	{
		return value;
	}
}


