package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//큐를 사용하지 않고 작성
public class Baekjoon2164_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] q = new int[2*N];
		
		for(int i=1; i<=N; i++) {
			q[i] = i;
		}
		
		int prev = 1;
		int last = N;
		
		while(N-- > 1) {
			prev++;
			q[last+1] = q[prev];
			prev++;
			last++;
		}
		
		System.out.println(q[last]);
	}

}
