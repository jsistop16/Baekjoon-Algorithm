package baekjoon;

import java.util.Scanner;

public class Baekjoon5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cost = sc.nextInt();
		sc.close();
		int charge = 1000 - cost;
		int cnt=0;
		while(charge>0) {
			if (charge/500 > 0) {
				cnt+=charge/500;
				charge-=cnt*500;
			}
			else if(charge/100 > 0) {
				cnt+=charge/100;
				charge-=cnt*100;
			}
			else if(charge/50 > 0) {
				cnt+=charge/50;
				charge-=cnt*50;
			}
			else if(charge/10 > 0) {
				cnt+=charge/10;
				charge-=cnt*10;
			}
			else if(charge/5 > 0) {
				cnt+=charge/5;
				charge-=cnt*5;
			}
			else {
				cnt+=charge;
				
			}
		}
		System.out.println(cnt);
	}

}
