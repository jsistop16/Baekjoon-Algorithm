package baekjoon;

import java.util.*;

public class Baekjoon1855 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		//열의 개수는 K 행의 개수는 문자열길이/K
		
		String s = sc.next();//문자열 입력
		int N = s.length()/K;
		//char c = sc.next().charAt(0);//char입력방법
		sc.close();
		
		char[][] arr = new char[200][20];
		
		for (int i=0; i<N; i++) {
			if(i%2==0) {//짝수행
				for(int j=0; j<K; j++) {
					arr[i][j] = s.charAt(i*K+j);
				}
			}
			else {//홀수행
				int c=K-1;
				for(int j=0; j<K; j++) {
					arr[i][j]=s.charAt(i*K+c);
					c--;
				}
			}
		}
		for(int i=0; i<K; i++) {
			for(int j=0; j<N; j++) {
				System.out.println(Arrays.toString(arr));
			}
		}
		
		

	}

}
