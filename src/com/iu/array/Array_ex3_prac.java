package com.iu.array;

import java.util.Scanner;

public class Array_ex3_prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] name = null;
		int [] num = null;
		int [] kor = null;
		int [] eng = null;
		int [] math = null;
		int [] total = null;
		int [] avg = null;
		
		boolean check=true;
		//학교 성적 프로그램
		while(check) {
		System.out.println();	
		System.out.println("1. 입력 2. 조회 3. 검색 4. 삭제 5. 추가 6. 종료");
		int select=sc.nextInt();
			if(select==1) {
				//1.학생 정보 입력 
				//- a.학생 수를 입력, b.이름,번호,국,영,수 입력 후 총점평균계산
				System.out.println("학생 수를 입력하세요");
				select =sc.nextInt();
				System.out.println("이름, 번호, 국어점수, 영어점수, 수학점수를 입력해라");
				name = new String[select];
				num = new int[name.length];
				kor = new int[name.length];
				eng = new int[name.length];
				math = new int[name.length];
				total = new int[name.length];
				avg = new int[name.length];
				
				for(int i=0;i<name.length;i++) {
					System.out.println(i+1+"번째 학생 입력");
					name[i] = sc.next();
					num[i] = sc.nextInt();
					kor[i] = sc.nextInt();
					eng[i] = sc.nextInt();
					math[i] = sc.nextInt();
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3;
				}
				
			} else if(select==2) {
				//2.학생 정보 조회
				//- 모든 학생의 이름, 번호, 총점, 평균 출력
				System.out.println("name\tnum\ttotal\tavg");
				for(int i=0;i<name.length;i++) {
					System.out.println(name[i]+"\t"+num[i]+"\t"+total[i]+"\t"+avg[i]);
				}
				
			} else if(select==3) {
				//3.학생 정보 검색 
				//- 검색할 학생의 번호를 입력, 번호와 일치하는 학생의 모든정보 출력
				//- 없으면 없는 번호입니다 출력
				
				boolean check1=true;
				while(check1) {
				System.out.println("검색할 학생의 번호를 입력하세요");
				select = sc.nextInt();
				for(int i=0;i<num.length;i++) {
				if(select==num[i]) {
					System.out.println("name\tnum\ttotal\tavg");
					System.out.println(name[i]+"\t"+num[i]+"\t"+total[i]+"\t"+avg[i]);
					check1=!check1;
				} else {
					System.out.println("번호를 다시 입력해주세요");
				}
				} 
				}
				
			} else if(select==4) {
				//4.학생 정보 삭제 -삭제할 학생의 번호를 입력 -입력한번호와일치하는학생의정보삭제
				//- 번호 없으면 없는 번호입니다 출력
				System.out.println("삭제할 학생의 번호를 입력하세요");
				select=sc.nextInt();
				
			} else if(select==5) {
				//5.학생 정보 추가 -검색할 학생의 번호입력 -일치번호모든정보출력 -없으면없는번호입니다
			} else if(select==6) {
				//6. 프로그램 종료
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
