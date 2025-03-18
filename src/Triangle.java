
public class Triangle {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 6;

		if ( a == b && b == c && a == c) {
			System.out.println("正三角形です。");
		} else if (a == b || b == c || a == c) {
			System.out.println("二等辺三角形です。");
		} else if (a != b && b != c && a != c) {
			System.out.println("不等辺三角形です。");
		}

	}

}
