package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int sum = 1;
		int div = 1;
		for(int i=N; i>N-K; i--) {
			sum*=i;
		}
		for(int i=K; i>0; i--) {
			div*=i;
		}
		System.out.println(sum/div);
	}

}
