package baekjoon;

import java.util.Scanner;

public class Baekjoon1100 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] str = new String[8];
      
      int cnt=0;
      for(int i=0; i<8; i++) {
         str[i] = sc.nextLine();
      }
      sc.close();
      for(int i=0; i<8; i++) {
         for(int j=0; j<8; j++) {
            if(i%2==0 && j%2==0 && str[i].charAt(j)=='F') {
               cnt++;
            }
            if(i%2==1 && j%2==1 && str[i].charAt(j)=='F') {
               cnt++;
            }
         }
      }
      System.out.println(cnt);
   }

}