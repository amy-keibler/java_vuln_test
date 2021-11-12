
public class Test {
	public static void main(String[] args) {
		Test test = new Test();

		test.run();
	}

	public void run() {
		if (this != null) {
			System.out.println("Not equal to null");
			return;
		}
		System.out.println("Equal to null");
	}
}

