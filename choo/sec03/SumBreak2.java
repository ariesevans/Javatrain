package choo.sec03;

import java.util.Scanner;

public class SumBreak2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 더합니다.");
		System.out.println("몇개를 더할까요?:");
		int n=stdIn.nextInt();
		
		int sum=0;
		int i;
		for (i=0;i<n;i++) {
			System.out.println("정수:");
			int t=stdIn.nextInt();
			if (sum + t>1000) {
				System.out.println("합계가 1,000을 넘었습니다");
				System.out.println("마지막 값은 무시 합니다.");
				break;
			}
			sum +=t;
		}
		System.out.println("합계는 "+sum+"입니다.");
		if (i !=0)
			System.out.println("평균은 "+sum/i+"입니다");
	}
	

}
