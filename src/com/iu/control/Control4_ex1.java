package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		//국어
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수입력");
		int korean = sc.nextInt();
		System.out.println("영어점수입력");
		int english = sc.nextInt();
		System.out.println("수학점수입력");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		int avg = sum / 3;
		
		switch (avg/10) {
		case 10: 
		case 9 : {
			System.out.println("A");
			break;
		}
		case 8 : {
			System.out.println("B");
			break;
		}
		case 7 : {
			System.out.println("C");
			break;
		}
		case 6 : {
			System.out.println("D");
			break;
		}
		default:
			System.out.println("F");
		}
		
		System.out.println(avg);

	}

}
