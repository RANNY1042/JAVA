package com.ruby.java.ch13;


class Bag<T, N> {
	private T thing;
	private N name;
	
	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}
		
	/**
	 * @return the thing
	 */
	public T getThing() {
		return thing;
	}



	/**
	 * @param thing the thing to set
	 */
	public void setThing(T thing) {
		this.thing = thing;
	}



	/**
	 * @return the name
	 */
	public N getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(N name) {
		this.name = name;
	}



	void showType() {
		System.out.println("T의 타입은" + thing.getClass().getName());
		System.out.println("N의 타입은" + thing.getClass().getName());
	}
}

class Book{
	public String toString() {
		return "책";
	}
}
class PencilCase{}
class Notebook{}


public class BagTest3 {
	

	public static void main(String[] args) {
		
		Bag<Book, PencilCase> bag = new Bag<Book, String>(new Book(), new PencilCase()); 
		
		bag.showType();
		
		Book book = bag.getThing();
		PencilCase name = bag.getName();
		
		System.out.println("Thing is: " + book);
		System.out.println("name is "+ name);
	}

}
