package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int R=0;//먼저 초기화 해줘야하는지?
		String S="";
		StringTokenizer st;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			for(int k=0; k<S.length(); k++) {
				char x = S.charAt(k);
				for(int j=0; j<R; j++) {
					sb.append(x);
				}
			}
			System.out.println(sb);
		}//입력 끝
		
	}

}
