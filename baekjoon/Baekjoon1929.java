package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1929 {
//�ڵ�� ����
//���ؿ����� �ð��ʰ�
//�Ҽ����ϴ� ��׸���ü�� ü?? ���ñⰡ ����
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		
		for(int i=M; i<=N; i++) {
			int cnt = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt == 0) {
				if(i != 1) {
					System.out.println(i);
				}
			}
		}
	}

}
