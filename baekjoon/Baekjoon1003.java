package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1003 {

	static Integer[][] arr = new Integer[41][2];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr[0][0]=1;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=1;
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			sb.append(arr[N][0] + " " + arr[N][1]);
		}
		System.out.println(sb);
	}
	
	static Integer[] fibonacci(int N) {
		if(arr[N][0] == null || arr[N][1] == null) {
			arr[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
			arr[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		
		return arr[N];
	}

}
