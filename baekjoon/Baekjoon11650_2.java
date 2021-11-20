package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Baekjoon11650_2 {

	
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
		
		Arrays.sort(arr, new Comparator<int[]>() {
			//Comparator인터페이스의 compare메소드 오버라이딩
			public int compare(int[] e1, int[] e2) {
				if(e1[0]==e2[0]) {
					return e1[1]-e2[1];
				}
				else {
					return e1[0]-e2[0];
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ");
			sb.append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
