package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		int[] arr = new int[3];
		for(int i=b.length()-1; i>=0; i--) {
			int answer = a*(int)(b.charAt(i)-'0');
			System.out.println(answer);
			arr[i] = answer;
		}
		int answer2 = arr[2]+10*arr[1]+100*arr[0];
		System.out.println(answer2);

	}

}
