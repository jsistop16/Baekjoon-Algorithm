package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int total = A*B*C;
		int[] result = new int[10];
		for(int i=0; i<Integer.toString(total).length(); i++) {
			int x = Character.getNumericValue(Integer.toString(total).charAt(i));
			result[x]++;
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
