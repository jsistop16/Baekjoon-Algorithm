package baekjoon;

import java.util.Scanner;

public class Baekjoon1032 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();//입력받을 파일의 개수
			
			String[] str = new String[N];
			
			for (int i=0; i<N; i++) {
				str[i]=sc.next();
			}
			sc.close();
			String ans = "";
			int cnt = str[0].length();
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<str[0].length(); j++) {
					if(str[0].charAt(j) == str[i].charAt(j)) {
						ans+=str[0].charAt(j);
						cnt-=1;
						if(str[0].charAt(j) != str[i].charAt(j)) {
							for(int k=0; k<cnt; k++) {
								ans+="?";
							}
							break;
						}
						
					}
					
						
						
					}
					
				}
			System.out.println(ans);
	}
}
