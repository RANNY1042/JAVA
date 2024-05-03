package com.ruby.java.ch08.Innerclass;

interface Messenger {
	String getMessage();
	void setMessage(String msg);
}

	class GalaxyMessenger implements Messenger {
	
	public class Messenger{
	public static void main(String[] args) {
		
		//Messenger test = new Messenger() ;
		Messenger test = new Messenger() {
			public String getMessage() { 
				return "test";
			}
		}
	
		public void setMessage(String msg) {
			System.out.println("메시지 = + msg");
		
		}
	}; //여기에 왜 semicolon해야하나 ? 

	}

}
