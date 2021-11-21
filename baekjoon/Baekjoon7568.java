package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon7568 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int[] rank_arr = new int[N];
		
		for(int i=0; i<N; i++) {
			int rank = 1;
			for(int j=0; j<N; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					rank++;
				}
			}
			rank_arr[i] = rank;
		}
		bw.write(Arrays.toString(rank_arr));
		bw.flush();
		bw.close();
	}
}
