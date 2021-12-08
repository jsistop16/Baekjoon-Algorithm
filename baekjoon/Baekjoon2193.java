package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[][] arr = new long[N][2];
		
		if(N==1) {
			System.out.println(1);
		}
		else {
			arr[0][0] = 0;
			arr[0][1] = 1;
			for(int i=1; i<N; i++) {
				arr[i][0] = arr[i-1][0]+arr[i-1][1];
				arr[i][1] = arr[i-1][0];
			}
			System.out.println(arr[N-1][0]+arr[N-1][1]);
		}
		
	}
}
