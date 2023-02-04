package com.brizlabs.hashmap;
import java.io.*;
import java.util.LinkedList;
public class avoidablewords {
	
	 
	
	    public static void main(String args[])
	    {
	 
	        // Creating an empty LinkedList
	        LinkedList<String> list = new LinkedList<String>();
	 
	        // Use add() method to add elements in the list
	        list.add("Paranoids");
	        list.add("are");
	        list.add("not ");
	        list.add("paranoids");
	        list.add("20");
	 
	        // Output the list
	        System.out.println("LinkedList:" + list);
	 
	        // Remove the head using remove()
	        list.remove(4);
	 
	        // Print the final list
	        System.out.println("Final LinkedList:" + list);
	    }
	}


