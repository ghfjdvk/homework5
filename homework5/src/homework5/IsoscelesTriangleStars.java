package homework5;

import java.util.*;

public class IsoscelesTriangleStars {
	Scanner scanner = new Scanner(System.in);

	public void ITS() {
		System.out.print("이등변삼각형 높이입력: ");
		int abc = scanner.nextInt();
		for (int i = 0; i < abc; i++) {
			for (int j = 0; j < abc - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 + 1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
