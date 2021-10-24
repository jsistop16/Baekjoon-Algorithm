package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		int bang=2;//방개수
		int layer=1;//껍데기 개수
		
		if(N==1) {
			System.out.println(1);
		}
		else {
			while(bang<=N) {
				bang=bang+(layer*6);
				layer++;
			}
			System.out.println(layer);
		}
		
	}

}
