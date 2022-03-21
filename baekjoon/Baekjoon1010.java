package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1010 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int total = factorial(N)/(factorial(M)*factorial(N-M));
			sb.append(total).append("\n");
			
		}
		System.out.println(sb);
	}
	
	static int factorial(int a) {
		int result=1;
		for(int i=1; i<=a; i++) {
			result *= i;
		}
		
		return result;
	}

}
