
public class Clock {

	public static void main(String[] args) {
		int seconds = getSeconds(18, 32, 47);
		System.out.println(seconds);
	}

	public static int getSeconds(int num1, int num2, int num3) {
		int result = num1 * 3600 +  num2 * 60 + num3;
		return result;
	}
}