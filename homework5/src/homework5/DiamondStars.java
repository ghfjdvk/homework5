package homework5;
import java.util.*;
public class DiamondStars {
	Scanner scanner = new Scanner(System.in);
	public void DS(){
		System.out.print("다이아몬드의 크기입력 : ");
		int abc = scanner.nextInt();
		for(int i=0;i<abc;i++)
		{
			for(int j=0;j<abc-i;j++)
				System.out.print(" ");
			for(int j=0;j<i*2+1;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		
		for(int i = 0;i < abc;i++)
		{
			for(int j=-2;j<i;j++)
				System.out.print(" ");
			for(int j=2;j<(abc-i)*2-1;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		
		
}
}
