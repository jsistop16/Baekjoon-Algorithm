package baekjoon;

import java.util.Scanner;

public class Baekjoon1259 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String N = sc.next();
			
			if (N.equals("0")) {
				break;
			}
			
			String[] arr = new String[N.length()];
			String[] arr2 = new String[N.length()];
			
			int cnt = 0;
			for(int i=0; i<N.length(); i++) {
				arr[i] = N.substring(i, i+1);
			}//arr 구성 완료
		
			for(int i=0; i<N.length(); i++) {
				arr2[i] = arr[N.length()-i-1];
			}//arr2구성 완료
			
			for(int i=0; i<N.length(); i++) {
				if(arr[i].equals(arr2[i])) {
					//문자열 비교시 equals메소드 사용해야함
					cnt++;
				}
			}
			if (cnt==N.length()) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}

}
