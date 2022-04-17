package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1769 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		int cnt = 0;
		
		while(true) {
			if(x.length()==1) {
				break;
			}
			int sum = 0;
			for(int i=0; i<x.length(); i++) {
				sum += Integer.parseInt(String.valueOf(x.charAt(i)));//각자리합을 더함
			}
			cnt++;
			x = String.valueOf(sum);
		}//while문을 빠져나왔다면 x가 한자리수가 된것 이제 x가 3의배수인지 확인
		
		if(Integer.parseInt(x) % 3 == 0) {
			System.out.println(cnt);
			System.out.println("YES");
		}else {
			System.out.println(cnt);
			System.out.println("NO");
		}
		
	}
}