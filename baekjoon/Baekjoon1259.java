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
			}//arr ���� �Ϸ�
		
			for(int i=0; i<N.length(); i++) {
				arr2[i] = arr[N.length()-i-1];
			}//arr2���� �Ϸ�
			
			for(int i=0; i<N.length(); i++) {
				if(arr[i].equals(arr2[i])) {
					//���ڿ� �񱳽� equals�޼ҵ� ����ؾ���
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
