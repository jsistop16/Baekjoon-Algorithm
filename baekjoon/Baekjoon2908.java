package baekjoon;

import java.util.Scanner;

public class Baekjoon2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		StringBuilder sb = new StringBuilder();
		sc.close();
		for(int i=a.length()-1; i>=0; i--) {
			sb.append(Character.getNumericValue(a.charAt(i)));
		}
		int c = Integer.parseInt(sb.toString());
		sb = new StringBuilder();
		for(int i=b.length()-1; i>=0; i--) {
			sb.append(Character.getNumericValue(b.charAt(i)));
		}
		int d = Integer.parseInt(sb.toString());
		
		if(c<d) {
			System.out.println(d);
		}else {
			System.out.println(c);
		}
	}

}
