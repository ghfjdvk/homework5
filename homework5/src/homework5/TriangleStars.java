package homework5;
import java.util.*;
public class TriangleStars {
	Scanner scanner = new Scanner(System.in);
	public void TS(){
		System.out.print("직각삼각형의 왼쪽여백과 높이입력: ");
		int abc = scanner.nextInt();
		int abcd = scanner.nextInt();
		for(int i=0;i<abcd;i++)
		{
			for(int j=abc;j>i;j--)
				System.out.print(" ");
				
			for(int j=0;j<=i;j++)
			System.out.print("*");
			
			System.out.print("\n");
			
		}
	}

}
