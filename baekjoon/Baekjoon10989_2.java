package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Baekjoon10989_2 {
//counting sort·Î ÇØ°á
	public static void main(String[] args) throws IOException{
		
		int[] arr = new int[10001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<10001; i++) {
			while(arr[i]>0) {
				sb.append(i).append("\n");
				arr[i]--;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}

}
