
public class Review02 {

	public static void main(String[] args) {
	       for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBizz");
			} else if (i % 5 == 0) {
				System.out.println("Bizz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
                System.out.println(i);
            }
		}

	}

}
