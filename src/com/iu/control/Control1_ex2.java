package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//문제 :	난이도 상	
		//단일 if 하나만으로 홀수 짝수 출력하기★
		
		String result = "홀수 입니다";
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		if(num%2==0) {
			result="짝수 입니다";
		}
		
		System.out.println(result);
		
		//String result = num%2==0 ? "짝수" : "홀수";
		//System.out.println(result);
		
		
		
		
		System.out.println("Finish");
	}

}
