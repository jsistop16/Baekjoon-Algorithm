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
		//666�� ���Ե� �ּҰ��� 666�̹Ƿ� num�� 666���� �����ϰ�
		//count���� 1���� �����Ѵ�.
		while(count != N) {
			num++;
			//num�� �׻� 1�� �����ϸ鼭 666�� ���ԵǴ��� üũ
			if(String.valueOf(num).contains("666")) {
				//666�� ���Եɶ��� count�� �ϳ��� �ø�
				count++;
			}
		}
		//�ᱹ count�� N �� ���ٸ� �׶��� ������ num�� ���
		System.out.println(num);
		
	}

}
