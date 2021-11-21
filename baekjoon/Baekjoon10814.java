package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon10814 {
	//String 이중배열로 풀이
	//+Comparator 사용해서 정렬
	//
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][2];
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] e1, String[] e2) {
				return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		bw.write(sb.toString());
		//StringBuilder를 출력가능한 String형태로 바꿔서(toString())
		//bw.write로 출력
		bw.flush();
		bw.close();
	}

}
