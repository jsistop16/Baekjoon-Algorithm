package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon1181 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					//길이가 같을경우
					return s1.compareTo(s2);
					//비교해서 정렬
					//음수가 나오면 그대로
					//양수가 나오면 자리바꿈
				}
				else {
					return s1.length()-s2.length();
					//길이를 기준으로 정렬
				}
			}
		});

		
		for(int i=0; i<N-1; i++) {
			if(!arr[i].equals(arr[i+1])) {
				bw.write(arr[i]+"\n");
			}
			else {
				continue;
			}
		}
		bw.write(arr[N-1]);
		bw.flush();
		bw.close();
	}
}
