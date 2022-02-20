package com.AccessModifiers1;

import com.AccessModifiers.D;
class Public extends D{
void test() {
	System.out.println(a);
}
}
public class PublicModifier {

	public static void main(String[] args) {
		Public p = new Public();
		p.test();
	}

}
