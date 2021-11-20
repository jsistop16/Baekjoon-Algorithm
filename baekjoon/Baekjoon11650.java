package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11650 {

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
		
		//¶÷´Ù½ÄÀ¸·Î Ç¥Çö
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0]==e2[0]) {
				return e1[1]-e2[1];
			}
			else {
				return e1[0]-e2[0];
			}
		});
		
		for(int i=0; i<N; i++) {
			bw.write(Integer.toString(arr[i][0]) + " ");
			bw.write(Integer.toString(arr[i][1]));
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
