package com.accessmodifiers;

import com.accessmodifiers.model.Message;

public class Application {

	public static void main(String[] args) {
		
		Message msg = new Message();
		
//		only message public available because public access modifier has more access than any others
		System.out.println(msg.messagePublic);

	}

}
