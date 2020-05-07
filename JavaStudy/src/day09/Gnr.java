package day09;

public class Gnr {
	public static void main(String[] args) {
		GTest<String> g = new GTest<>();
		GTest<Integer> g2 = new GTest<>();
		
		g.setData("¾È³ç");
		g2.setData(new Integer(10));
		
		System.out.println(g.getData());
		System.out.println(g2.getData());
			
	}
}
