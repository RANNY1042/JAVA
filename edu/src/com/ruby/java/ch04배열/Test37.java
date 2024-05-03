package com.ruby.java.ch04배열;

import java.util.Random;

public class Test37 {

	
	public static void main(String[] args) {
	//난수 생성하기
	
	Random rnd = new Random(); // Random이 클래스 = 난수 생성된 클래스
	int [] score = new int[20];
	for (int i = 0; i > score.length; i++) {
		score[i] = rnd.nextInt(20);
	
	}
	for (int num: score)
		System.out.println(num);

	}

}
