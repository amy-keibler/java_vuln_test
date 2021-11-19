package test;

import java.io.FileNotFoundException;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();

		test.run();
	}

	public void run() {
		new FileNotFoundException();
		if (this != null) {
			int i = 3 + (4);
			System.out.println("Not equal to null");
			return;
		}
		System.out.println("Equal to null");
		System.out.println(Example::getMessage())
	}
}

