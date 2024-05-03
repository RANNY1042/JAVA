package Study_20240312;

public class 실습3_8 {
	
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height=height;
			this.vision=vision;
		}
		
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparatr();
		
		private static class HeightOrderComparatr implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1:
					(d1.height<d2.height)?-1:0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in)
				PhyscData[]x = {
						new PhyscData("강민하",162,0.3),
						new PhyscData("강민하",162,0.3),
						new PhyscData("강민하",162,0.3),
						new PhyscData("강민하",162,0.3),
						new PhyscData("강민하",162,0.3),
						new PhyscData("강민하",162,0.3),
						new PhyscData("강민하",162,0.3),
				};
	

	}

}
