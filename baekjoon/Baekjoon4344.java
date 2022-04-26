package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
 		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());	
			
			int[] grade = new int[N];
			int sum = 0;
			for(int j=0; j<N; j++) {
				grade[j]=Integer.parseInt(st.nextToken());
				sum+=grade[j];
			}
			
			
			double avg = sum/N;
			double cnt = 0;
			for(int j=0; j<N; j++) {
				if(grade[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/N)*100);
			
		}
	}

}
