package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<N; i++) {
			if(check(i) == N) {//i가 생성자
				System.out.println(i);
				cnt = 1;
				break;
			}
		}
		if(cnt == 0) {
			System.out.println(0);
		}
	}
	
	public static int check(int x) {
		String str = Integer.toString(x);
		int a = str.length();
		int[] list = new int[a];
		int sum = 0;
		for(int i=0; i<str.length(); i++)
		{
			list[i] = Character.getNumericValue(str.charAt(i));//list에 각자리수 들어감
		}
		for(int i=0; i<list.length; i++) {
			sum+=list[i];
		}//list의 총합
		return x+sum;//부분합 완성
	}

}
