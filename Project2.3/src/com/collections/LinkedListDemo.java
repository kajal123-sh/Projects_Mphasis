package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> data = new LinkedList<>();

		data.add("Rishu");
		data.add("Rod");
		data.add("Sumit");
		
	

		for (String d : data) {
			System.out.println(d);
		}
	}
}

