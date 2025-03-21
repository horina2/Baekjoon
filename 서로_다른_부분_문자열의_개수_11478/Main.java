package 서로_다른_부분_문자열의_개수_11478;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		Set<String> set1 = new HashSet<>();
		
		for(int i = 1; i<=S.length(); i++) {
			for(int j = 0; j<=S.length() - i; j++) {
				set1.add(S.substring(j,i+j)); // 집합인 hash에 집어넣어 자동으로 중복 제
			}
		}
		System.out.println(set1.size()); // set1의 크기가 바로 부분 문자열의 개수이다.
		sc.close();
	}
}
