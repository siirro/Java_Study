package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//월급을 입력
		//1. 정규직 2. 계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7% 을 뺀 금액을 계산
		//계약직 3.3퍼 공제
		//실제받을금액 출력
		
		double junggyu = 0;
		double gyeyack = 0;
		System.out.println("월급을 입력하세요");
		int wage = sc.nextInt(); 
		
		System.out.println("정규직은 1, 계약직은 2를 입력하세요");
		int num = sc.nextInt();
		
		if(num==1) {
			//junggyu = wage-(wage*0.01)-(wage*0.014)-(wage*0.005)-(wage*0.007);
			junggyu = wage-(wage*0.036);
			System.out.println(junggyu+"원");
		} else if(num==2) {
			gyeyack = wage-(wage*0.033);
			System.out.print("이번달 실수령액은 "+gyeyack+"원 입니다");
		}
		
		
	}

}
