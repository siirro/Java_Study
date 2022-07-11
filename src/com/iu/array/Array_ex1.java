package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// 키보드로부터 인원수를 입력받아서
		//인원수만큼 이름을 입력받아서 이름들을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 입력하세요");
		int nums=sc.nextInt();
		String [] names = new String[nums];

		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+"번 이름 입력");
			names[i]=sc.next();
			
		}
		
		for(int i=0;i<names.length;i++) {
		System.out.println(i+1+"번의 이름은 "+names[i]);
		}
				
		
		//각 학생의 이름별로 국어 점수 입력 후 출력
		//iu의 국어점수를 입력하세요. - iu-80
		int [] Korean = new int[nums];
		
		int sum = 0;
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"의 국어점수를 입력하세요");
			Korean[i] = sc.nextInt();
			sum += Korean[i];
		}
		
		int avg = sum/nums;
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"의 국어점수는 "+Korean[i]);
			
		}
		
		System.out.println("이 반의 총점은"+sum);
		System.out.println("이 반의 평균은"+avg);
		
		// 이 반의 국어점수의 총점을 계산 후 출력
	}

}
