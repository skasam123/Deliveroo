package java8;

import java.io.IOException;
import java.util.ArrayList;

class functionalces {

	public static void main(String args[]) {

		try {
			method();
		}catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void method() {
		System.out.println("method called");
	}
}
	
	
