package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//nextInt(정수) : 0 부터 입력한 정수 미만 범위에서 무작위 점수를 가져온다.
		String com1="";
		
		boolean check = true;
		while(check) {
			
			System.out.println("가위바위보 시작! 가위,바위,보 중 하나를 입력하세요");
			String me1 = sc.next();
			int meNum=5;
			if(me1.equals("가위")) {
				meNum=0;
			} else if(me1.equals("바위")) {
				meNum=1;
			} else if(me1.equals("보")) {
				meNum=2;
			}
			
			System.out.println("나의 선택:"+me1);
			
			int comNum = random.nextInt(3);
			if(comNum==0) {
				com1 = "가위";
			} else if(comNum==1) {
				com1 = "바위";
			} else if(comNum==2) {
				com1 = "보";
			} 
			System.out.println("컴퓨터의 선택:"+com1);
			
			System.out.println("결과 -----------");
			
			if(meNum==comNum) {
				System.out.println("무승부! 다시 실행");
//				System.out.println("나"+me1+meNum);
//				System.out.println("컴"+com1+comNum);
			} else if(meNum==0&&comNum==1||meNum==1&&comNum==2||meNum==2&&comNum==0) {
				System.out.println("패배! 다시 실행");
//				System.out.println("나"+me1+meNum);
//				System.out.println("컴"+com1+comNum);
			} else if(meNum==1&&comNum==0||meNum==2&&comNum==1||meNum==0&&comNum==2) {
				System.out.println("승리! 게임 종료");
//				System.out.println("나"+me1+meNum);
//				System.out.println("컴"+com1+comNum);
				break;
			} else {
				System.out.println("다시 내세요");
			}
				
		}
		
		
		
	}

}
