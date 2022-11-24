package com.java.valocity.collection.demo;

import java.util.HashSet;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		
		
		HashSet hs = new HashSet();
		
		hs.add("pradip");
		hs.add("pralhad");
		hs.add("zadke");
		
		
		Iterator itr = hs.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
	}

}
