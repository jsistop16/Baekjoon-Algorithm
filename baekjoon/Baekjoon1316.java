package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
	
		int N = Integer.parseInt(br.readLine());
		
		int count=0;
		
		for(int i=0; i<N; i++) {
			if(check()==true) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static boolean check() throws IOException {
		
		String str = br.readLine();
		boolean[] arr = new boolean[26];
		int former = 0;
		
		for(int i=0; i<str.length(); i++) {
			int cur = str.charAt(i);
			if(former != cur) {
				if(arr[cur-'a']==true) {
					return false;
				}
				else {
					arr[cur-'a']=true;
					former = cur;
				}
			}
			
		}
		return true;
	}
}
