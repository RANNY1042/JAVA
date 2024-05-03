package Study_20240311;

public class CompareTo_Study2 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "World";
		
		System.out.println("str1.compareTo(str2)?" + str1.compareTo(str2));
		System.out.println("str1.compareTo(str3)?" + str1.compareTo(str3));
		
		System.out.println("str1.compareToIngnoreCase(str2)?" + str1.compareToIgnoreCase(str2));
		System.out.println("str1.compareToIgnoreCase(str3)?"+str1.compareToIgnoreCase(str3));

	}

}
