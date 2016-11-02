package homework5;
import java.util.*;
public class RectagleStars {
	Scanner scanner = new Scanner(System.in);
	public void RTS(){
		System.out.print("정사각형 크기입력 : ");
		int abc = scanner.nextInt();
		for(int i=0;i<abc/2;i++)
		{
			for(int j=0;j<abc;j++)
			System.out.print("*");
			
			System.out.print("\n");
			
		}
	}

}
