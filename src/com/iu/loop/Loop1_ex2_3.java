package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int yid=1234;
		int ypw=5678;
		
		int i =1;
		for(int j=0;j<5;j++) {
			System.out.println("ID를 입력하세요");
			int id = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int pw = sc.nextInt();
			
			if(id==yid&&pw==ypw) {
				System.out.println("로그인 성공");
				j=5;
			} else { 
				System.out.println(i+"번 로그인 실패");
				i++;
			}
		 }
		if(i==6) {
		System.out.println("로그인 불가능 합니다.. 은행 ㄱ");
		} else {
			System.out.println("게임시작");
		}
		
		
		/* 바로 위의 로그인불가능or게임시작 
		 * 다른 변수 i 만들고 증감자 사용하는 방법이랑 다른 방법@@@@
		 * 
		boolean = false;
		if(id==yid&&pw==ypw) {
				System.out.println("로그인 성공");
				false=!false;
		
		if(check) {
			System.out.println("게임시작");
		}else {
			System.out.println("은행방문");
		 */
		
		System.out.println("Finish");
		

	}

}
