package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baekjoon2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}//9명의 난쟁이 키 입력 완료
		List<Integer> list = Arrays.asList(arr);
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}

}
