
public class Review01 {

	public static void main(String[] args) {
		int num1 = 1500;
		int result1 =  tax(num1);
		System.out.println((num1) +"円の商品の税込価格は" +(result1 + num1) +"円(消費税は" +(result1) +"円)です。");
	}

	public static int tax(int num1) {
		int num2 = 10;
		int result1 = num1 * num2 / 100;
		return result1;
	}

}
