public class MethodArguments {
	
	static String[] mappings = {
			"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
	};
	
	public static void main(String[] args) {
		System.out.println(addUp(3.2, 2.2));
		System.out.println(addUp(1, 4, 5, 7, 18, 3));
		System.out.println(addUp("one"));
		System.out.println(addUp(2, 3.5));
//		System.out.println(addUp(1, "three"));
	}
	
//	public static int addUp(int a, int b) {
//		System.out.println("Executing int addition");
//		return a + b;
//	}
	
	public static int addUp(int...a){
		int total = 0;
		for (int b : a) {
			total += b;
		}
		return total;
	}
	
/*	public static double addUp(double a, double b) {
		System.out.println("Executing double addition");
		return a + b;
	}*/
	
	public static double addUp(double... a) {
		double total = 0.0;
		for (double d: a){
			total += d;
		}
		return total;
	}
	
/*	public static int addUp(String a, String b) {
		System.out.println("Executing String addition");
		return toNumber(a) + toNumber(b);
	}*/
	
	public static int addUp(String...strings) {
		int total = 0;
		for (String s : strings) {
			total += toNumber(s);
		}
		return total;
	}
	
	public static Integer toNumber(String a) {
		for (int i = 0; i < mappings.length; i++) {
			if (mappings[i].equals(a)) {
				return i;
			}
		}
		return null;
	}
	

}
