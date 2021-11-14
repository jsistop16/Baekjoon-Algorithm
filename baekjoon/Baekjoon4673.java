package baekjoon;

public class Baekjoon4673 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		for(int i=0; i<10001; i++) {
			int n = d(i);
			
			if(n<10001) {
				arr[n]=true;
				//arr¿¡´Â ¼¿ÇÁ³Ñ¹ö°¡ false·Î ´ã±è
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10001; i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int num) {
		int sum = num;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		
		return sum;
	}
}