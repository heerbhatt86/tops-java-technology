package topsclass_01;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack s =new Stack();
		
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(40);
		s.push(70);
		s.push(80);
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
