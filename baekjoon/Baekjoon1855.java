package baekjoon;

import java.util.*;

public class Baekjoon1855 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		//���� ������ K ���� ������ ���ڿ�����/K
		
		String s = sc.next();//���ڿ� �Է�
		int N = s.length()/K;
		//char c = sc.next().charAt(0);//char�Է¹��
		sc.close();
		
		char[][] arr = new char[200][20];
		
		for (int i=0; i<N; i++) {
			if(i%2==0) {//¦����
				for(int j=0; j<K; j++) {
					arr[i][j] = s.charAt(i*K+j);
				}
			}
			else {//Ȧ����
				int c=K-1;
				for(int j=0; j<K; j++) {
					arr[i][j]=s.charAt(i*K+c);
					c--;
				}
			}
		}
		for(int i=0; i<K; i++) {
			for(int j=0; j<N; j++) {
				System.out.println(Arrays.toString(arr));
			}
		}
		
		

	}

}
