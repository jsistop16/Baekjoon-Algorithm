package baekjoon;

import java.util.Scanner;

public class Baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int cnt = 0;
		sc.close();
		
		while(true) {
			int left = temp / 10;
			int right = temp % 10;
			temp = right * 10 + (left + right) % 10;
			cnt++;
			if(n == temp) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}