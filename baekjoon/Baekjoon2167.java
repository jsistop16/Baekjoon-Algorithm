package baekjoon;

import java.util.Scanner;

public class Baekjoon2167 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] map = new int[n+1][m+1];//2���� �迭 ����
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		//2���� �迭 ���� �Ϸ�
		//���� �� ���ϱ�
		
		int count = sc.nextInt();
		for(int k=0; k<count; k++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			//���� ���ϴ� �κп� ���� ��ǥ�� �Է�
			int sum = 0;
			for(int i=x1; i<=x2; i++) {
				for(int j=y1; j<=y2; j++) {
					sum+=map[i][j];
				}
			}
			System.out.println(sum);
		}
		
	}
}
