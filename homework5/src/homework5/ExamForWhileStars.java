package homework5;
import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.정사각형 별찍기\n"
						  + "2.직각삼각형 별찍기\n"
						  + "3.이등변삼각형 별찍기\n"
						  + "4.다이아몬드 별찍기\n"
						  + "5.종료하기\n"
						  + "원하는 메뉴는>> ");
		int abc = scanner.nextInt();
		switch(abc)
		{
		case 1:
			RectagleStars a = new RectagleStars();
			a.RTS();
			break;
		case 2:
			TriangleStars b = new TriangleStars();
			b.TS();
			break;
		case 3:
			IsoscelesTriangleStars c = new IsoscelesTriangleStars();
			c.ITS();
			break;
		case 4:
			DiamondStars d = new DiamondStars();
			d.DS();
			break;
		
		}
		

	}

}
