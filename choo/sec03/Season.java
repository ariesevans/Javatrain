package choo.sec03;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");
		do {
			int month;
			do {
				System.out.println("몇 월입니까");
				month = stdIn.nextInt();
				} while (month<1 || month >12);
			
			if (month >=3 && month <=5)
				System.out.println("봄 입니다.");
			else if (month >=6 && month <=8)
				System.out.println("여름 입니다.");
			else if (month >=9 && month <=11)
				System.out.println("가을 입니다.");
			else if (month ==12 || month ==1 || month==2)
				System.out.println("여름 입니다.");
			
			System.out.println("다시 하시겠습니다? 1_Yes/0_No:");
			retry = stdIn.nextInt();
		} while (retry ==1 );
		
		
	}

}
