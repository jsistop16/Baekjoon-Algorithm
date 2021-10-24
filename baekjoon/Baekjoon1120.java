package baekjoon;
import java.util.Scanner;
import java.lang.Math;

public class Baekjoon1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		int a_length=a.length();
		int dif = b.length()-a.length();
		//차이의 최댓값은 a의 길이
		for(int i=0; i<=dif; i++) {
			int cnt = 0;
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j) != b.charAt(j+i)) {
					cnt++;
				}
			}
			a_length = Math.min(a_length, cnt);
		}
		System.out.println(a_length);
	}

}
