package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1436 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int count = 1;
		//666이 포함된 최소값이 666이므로 num을 666으로 선언하고
		//count역시 1부터 시작한다.
		while(count != N) {
			num++;
			//num은 항상 1씩 증가하면서 666이 포함되는지 체크
			if(String.valueOf(num).contains("666")) {
				//666이 포함될때만 count를 하나씩 늘림
				count++;
			}
		}
		//결국 count와 N 이 같다면 그때의 숫자인 num을 출력
		System.out.println(num);
		
	}

}
