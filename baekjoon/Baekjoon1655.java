package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Baekjoon1655 {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> minPQ = new PriorityQueue<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			if(i%2==0) {
				maxPQ.add(Integer.parseInt(br.readLine()));
			}
			else {
				minPQ.add(Integer.parseInt(br.readLine()));
			}
			
			if(!maxPQ.isEmpty()&&!minPQ.isEmpty()) {
				if(maxPQ.peek()>minPQ.peek()) {
					maxPQ.add(minPQ.poll());
					minPQ.add(maxPQ.poll());
				}
			}
			sb.append(maxPQ.peek()).append("\n");
			
		}
		System.out.println(sb);
		
		
	}
}
