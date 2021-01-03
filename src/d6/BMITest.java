package d6;

import java.util.Scanner;

public class BMITest {

	public static void main(String[] args) {
		
		// 재료
		Scanner scanner = new Scanner(System.in);
		
		// 로직
		System.out.println("insert your name: ");
		String name = scanner.nextLine();
		
		System.out.println("your height: ");
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.println("your weight: ");
		double weight = Double.parseDouble(scanner.nextLine());
		
		PersonData p1 = new PersonData(name, height, weight);
		
		double bmi = p1.calc();
		
		System.out.println(bmi);
		
	}
}
