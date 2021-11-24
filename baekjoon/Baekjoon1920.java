package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//순차탐색(이중 for 문)풀이
//시간초과
public class Baekjoon1920 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] check = new int[N];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			check[i] = Integer.parseInt(st1.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] numbers = new int[M];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			numbers[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			int cnt=0;
			for(int j=0; j<M; j++) {
				if(check[j]==numbers[i]) {
					cnt++;
				}
			}
			if(cnt>=1) {
				bw.write(String.valueOf(1));
				bw.write("\n");
				bw.flush();
			}
			else {
				bw.write(String.valueOf(0));
				bw.write("\n");
				bw.flush();
			}
		}
		
		
	}
}
