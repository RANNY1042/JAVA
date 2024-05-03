package Study_20240311;

import java.util.Scanner;

public class 실습2_14 {
	
	static final int VMAX =21;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double visoin){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] dat) {
		double sum=0;
		
		for(int i=0; i<dat.length;i++)
			sum+=dat[i].height;
			
		return sum/dat.length;
		
	}
	
	static void distVision(PhyscData[] dat,
			int[] dist) {
		int i = 0;
		
		dist[i]=0;
		for (i=0; i<dat.length;i++)
			if(dat[i].vision>=0.0&&dat[i].vision <=VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
	}
	

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	PhyscData[] x = {
			new PhyscData("박현규",162,0.3),
			new PhyscData("함진아",173,0.7),
			
	}
	}

}
