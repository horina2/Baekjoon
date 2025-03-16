package 서로_다른_부분_문자열의_개수_11478;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		Set<String> set1 = new HashSet<>();
		
		for(int i = 1; i<=S.length(); i++) {
			for(int j = 0; j<=S.length() - i; j++) {
				System.out.print(S.substring(j,i+j) + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
