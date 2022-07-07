package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~3 사이의 숫자를 입력");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("1번 선택");
		} else if(select == 2) {
			System.out.println("2번 선택");
		} else {
			System.out.println("3번 선택");
		}
	}

}
