package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//순차탐색말고 이진탐색으로 다시 풀이
public class Baekjoon1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr =new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int real=0;
		for(int i=0; i<N; i++) {
			int cnt=0;
			for(int j=1; j<=arr[i]; j++) {
				if(arr[i]%j == 0) {
					cnt++;
				}
			}
			if(cnt==2) {
				real++;
			}
		}
		System.out.println(real);
	}

}