package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			q.offer(i+1);
		}
		
		while(q.size()!=1) {
			for(int i=0; i<K-1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()+", ");
		}
		sb.append(q.poll());
		System.out.println("<" + sb + ">");
	}

}
