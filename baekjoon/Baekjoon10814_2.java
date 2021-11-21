package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon10814_2 {
	//Person 클래스 만들어서 객체로 문제풀이
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Person[] p = new Person[N];
		
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new Person(age, name);//객체
		}
		
		Arrays.sort(p, new Comparator<Person>() {
			//Comparator로 나이를 기준으로 정렬
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			sb.append(p[i]);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	
	public static class Person{
		
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		public String toString() {
			return age + " " + name + "\n";
		}
	}
}
