package com.accessmodifiers.model;

public class Application {
	
public static void main(String[] args) {
		
		Message msg = new Message();
		
//		since same package thats why both public and protected can access same package different class
		System.out.println(msg.messagePublic);
		System.out.println(msg.messageProtected);

	}

}
