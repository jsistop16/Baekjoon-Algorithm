package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1152 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
	
		StringTokenizer st = new StringTokenizer(string, " ");
		System.out.println(st.countTokens());
	}
}
