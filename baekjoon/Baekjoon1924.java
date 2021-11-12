package baekjoon;

import java.util.Scanner;

public class Baekjoon1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int days = 0;
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		
		for(int i=1; i<=12; i++) {
			if(x==i) {
				break;
			}
			else {
				days+=arr[i-1];
			}
		}
		
		days+=y;
		
		int day = days%7;
		
		switch(day) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}
		
	}

}
