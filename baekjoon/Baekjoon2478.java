package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2478 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] fibo = new int[N+1][2];
		fibo[0][0] = 0;
		fibo[0][1] = 1;
		fibo[1][0] = 1;
		fibo[1][1] = 0;
		for(int i=2; i<=N; i++) {
			fibo[i][0] = fibo[i-1][0]+fibo[i-1][1];
			fibo[i][1] = fibo[i-1][0];
		}
		System.out.println(fibo[N][0]);
	}

}
