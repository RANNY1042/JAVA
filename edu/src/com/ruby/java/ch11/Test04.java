package com.ruby.java.ch11;

import java.io.*;

public class Test04 {
	
	public static void test() throws Exception{
			
			FileInputStream fi = new FileInputStream("a.txt"); 
			int c = fi.read();
			System.out.println((char) c);
		}
			
	public static void main(String[] args) {
				System.out.println("Start");
				try {
					test();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("End");
			}
		}