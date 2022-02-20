package com.AccessModifiers1;

import com.AccessModifiers.D;
class Protect extends D{
	void test() {
		System.out.println(a);
	}
}

public class ProtectedModifier {
public static void main (String[]args) {
	Protect p = new Protect();
	p.test();
}

}
