package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		//1. 1번 대문자 2번 소문자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1또는 2를 입력하세요");
		int num = sc.nextInt();
		
		if(num==1) {
			for(int i = 65;i<=90;i++)
				System.out.println((char)i);
		} else if(num==2) {
			for(int i = 97;i<=122;i++)
				System.out.println((char)i);
		}
		System.out.println();
		//2. 1~10까지의 합 구하기
		int sum = 0;
		for(int i=1; i<10 ;i++)
			sum += i;
		
			System.out.println("2번의 답:"+sum);
		
		
		//3. id, pw 입력해서 로그인 판단, 맞으면 종료, 틀리면 다시입력해라 (기회5번)
		int yid=1234;//회원가입시 입력한 ID
		int ypw=5678;//회원가입시 입력한 PW
				
		System.out.println("3번문제 : ID를 입력하세요");
		int id1 = sc.nextInt();
		System.out.println("PW를 입력하세요");
		int pw1 = sc.nextInt();
		
		if(id1==1234&&pw1==5678) {
			System.out.println("로그인 성공");
		} else {
			for(int i=0 ; i<5 ; i++) {
				int count = 2;
				System.out.println(count+"번째입력, ID를 입력하세요");
				int id = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int pw = sc.nextInt();
				count++;
				if(id==1234&&pw==5678) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("다시 입력하세요");
				}
			}
		}
		
		System.out.println("Finish");
		
	}

}
