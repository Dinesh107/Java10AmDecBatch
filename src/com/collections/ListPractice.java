package com.collections;

import java.util.ArrayList;

import java.util.List;

public class ListPractice {
	
	public static void main(String[] args) {
		
		// List 
		
		// Array list, Linked List, Vector List
		
		// Array List
		
		List<Object> l1 = new ArrayList<Object>();
		
		// add
		
		l1.add(23);
		
		l1.add('y');
		
		l1.add("Java");
		
		l1.add(23.5f);
		
		l1.add(false);
		
		System.out.println(l1);
		
		// size()
		
//	     int si = l1.size();
//		
//		System.out.println(si);
//		
//		// get()
//		
//		Object ob = l1.get(2);
//		
//		System.out.println(ob);
//		
//		// set()
//		
//		l1.set(2, 34);
//		
//		System.out.println(l1);
//		
//		// remove()  
//		
//		l1.remove(0);
//		
//		System.out.println(l1);
//		
//		//  indexOf()
//		
//		int io = l1.indexOf(false);
//		
//		System.out.println(io);
		
		// contains() 
		
//		boolean co = l1.contains("Java");
//		
//		System.out.println(co);
		
//		l1.clear();
//		
//		System.out.println(l1);
		
		
		
       List<Object> l2 = new ArrayList<Object>();
		
		// add
		
		l2.add(234);
		
		l2.add('z');
		
		l2.add("Java");
		
		l2.add(23.5f);
		
		l2.add(true);
		
		System.out.println(l2);
		
		// addAll()
		
		//l1.addAll(l2);
		
		// System.out.println(l1);
		
		// removeAll() ----> it will remove the common values
		
		
//		l1.removeAll(l2);
//		
//		System.out.println(l1);
		
//        l2.removeAll(l1);
//		
//		System.out.println(l2);
		
		// retainAll()  ----> it will return the common value
		
//		l1.retainAll(l2);
//		
//		System.out.println(l1);
		
        l2.retainAll(l1);
		
		System.out.println(l2);
				
	}

}
