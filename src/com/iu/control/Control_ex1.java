package com.iu.control;

import java.util.Scanner;

public class Control_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점, 평균 계산
		//평균90 이상 A, 80 B, 70C, 60D, 나머지 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수입력");
		int korean = sc.nextInt();
		System.out.println("영어점수입력");
		int english = sc.nextInt();
		System.out.println("수학점수입력");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = sum / 3;
		
		if(avg>=90) {
			System.out.println("A학점");
		} else if(avg>=80) {
			System.out.println("B학점");
		} else if(avg>=70) {
			System.out.println("C학점");
		} else if(avg>=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		

	}

}
