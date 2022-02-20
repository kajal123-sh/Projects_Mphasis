package com.simplilearn.typecast;

public class TypeCasting {

	public static void main(String[] args) {
		
		int x = 7;
		long y = x;
		
		int z = (int) y;
		System.out.println(z);
		
		char a = 'A';
		int b = a;
		System.out.println(b);
		
		float c = a;
		System.out.println(c);
		
		double d = 42.09;
		int e = (int)d;
		System.out.println(e);
	

	}

}
