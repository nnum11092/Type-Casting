package com.accessmodifiers.model;

public class Message {
	
	private String messagePrivate = "private";
	protected String messageProtected = "protected";
	public String messagePublic = "public";
	
	public static void main(String[] args) {
		
		Message msg = new Message();
		
		//private access modifier cannot go out of its origin
		System.out.println(msg.messagePublic);
		System.out.println(msg.messageProtected);
		System.out.println(msg.messagePrivate);
	}

}
