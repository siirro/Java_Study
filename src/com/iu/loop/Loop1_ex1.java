package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex1 {

	public static void main(String[] args) {
		//0 - 9 출력 출력은 짝수만 출력
		
	
//		for(int i=0;i<10;i++) {
//			if(i%2==0) {
//			System.out.println(i);
//			}
//			
//		}
		
		//0-9 짝수
		
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//			i++;
//		}	
		
		//멍멍 출력, 출력하는 횟수 입력받음
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("횟수입력해라");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++)
			System.out.println("멍멍");
		

		
		
	}

}
