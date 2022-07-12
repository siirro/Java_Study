package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		String [] name = null;
		int [] number = null;
		int [] score_Kor = null;
		int [] score_Eng = null;
		int [] score_Math = null;
		int [] score_total = null;
		double [] score_avg = null;
		
	
		int nums = 0;
		Scanner sc = new Scanner(System.in);
		//학교 성적 프로그램
		//1.학생 정보 입력 
		//- a.학생 수를 입력, b.이름,번호,국,영,수 입력 후 총점평균계산
		//2.학생 정보 조회
		//- 모든 학생의 이름, 번호, 총점, 평균 출력
		//3.학생 정보 검색 
		//- 검색할 학생의 번호를 입력, 번호와 일치하는 학생의 모든정보 출력
		//- 없으면 없는 번호입니다 출력
		//4.학생 정보 삭제 -삭제할 학새의 번호를 입력 -입력한번호와일치하는학생의정보삭제
		//- 번호 없으면 없는 번호입니다 출력
		//5.학생 정보 추가 -검색할 학생의 번호입력 -일치번호모든정보출력 -없으면없는번호입니다
		//6. 프로그램 종료
		
		
		//System.out.println(number.length);
		
		boolean check = true;
		while(check) {
			
			System.out.println("1.입력 2.조회 3.검색 4.삭제 5.추가 6.종료");
			int select = sc.nextInt();
			if(select==1) {
				System.out.println("1. 학생 정보 입력");
				System.out.println("학생 수를 입력하시오");
				nums = sc.nextInt();
				
				name = new String[nums];
				number = new int[name.length];
				score_Kor = new int[name.length];
				score_Eng = new int[name.length];
				score_Math = new int[name.length];
				score_total = new int[name.length];
				score_avg = new double[name.length];
				 
				
				for(int i=0;i<nums;i++) {
					System.out.println(i+1+"번째 학생의 이름, 번호, 국어점수, 영어점수, 수학점수를 차례대로 입력하세요");
					name[i] = sc.next();
					number[i] = sc.nextInt();
					score_Kor[i] = sc.nextInt();
					score_Eng[i] = sc.nextInt();
					score_Math[i] = sc.nextInt();
					score_total[i] = score_Kor[i]+score_Eng[i]+score_Math[i];
					score_avg[i] = score_total[i]/3;
					
					//System.out.println(name[i]+", "+number[i]+", "+score_total[i]+", "+score_avg[i]);
				}//for 종료
				System.out.println("============= 입력 끝");
			} else if(select==2) {
				System.out.println("2. 학생 정보 입력");
				//- 모든 학생의 이름, 번호, 총점, 평균 출력
				
				if(name != null) {
					System.out.println("name, number, score, score");
					for(int i=0;i<nums;i++) {
						System.out.println(name[i]+"-----"+number[i]+"-----"+score_total[i]+"-----"+(int)score_avg[i]);
					}
				}
				
			} else if(select==3) {
				System.out.println("3. 학생 정보 검색");
				System.out.println("검색할 번호를 입력하세요");
				int searchOnly = sc.nextInt();
				for(int i=0;i<nums;i++) {
					if(number[i]==searchOnly) {
						System.out.println(name[i]+", "+number[i]+", "+score_total[i]+", "+(int)(score_avg[i]));
					} else {
						System.out.println("없는 번호입니다. 다시 입력해주세요");
					}
						
				}
			} else if(select==4) {
				//삭제할 학생의 번호를 입력 -입력한번호와일치하는학생의정보삭제
				//- 번호 없으면 없는 번호입니다 출력
				System.out.println("4. 학생 정보 삭제");
				System.out.println("삭제할 학생의 번호를 입력해주세요");
				int delete = sc.nextInt();
				
				String [] nameCopy = null;
				int [] numberCopy = null;
				int [] score_KorCopy = null;
				int [] score_EngCopy = null;
				int [] score_MathCopy = null;
				int [] score_totalCopy = null;
				double [] score_avgCopy = null;
				
				boolean flag = false;
				int i = 0;
				for(i=0;i<nums;i++) {
					if(number[i]==delete) {
						flag=!flag;
						break;
					} 
					
				}
				
				if(flag) {
					nameCopy = new String [name.length-1];
					numberCopy = new int [name.length-1];
					score_KorCopy = new int [name.length-1];
					score_EngCopy = new int [name.length-1];
					score_MathCopy = new int [name.length-1];
					score_totalCopy = new int [name.length-1];
					score_avgCopy = new double [name.length-1];
					int index=0;
					for(int j=0;j<name.length;j++) {
						if(j==i) {
							//index--;
							continue;
						}
						nameCopy[index]=name[i];
						numberCopy[index]=number[i];
						score_KorCopy[index]=score_Kor[i];
						score_EngCopy[index]=score_Eng[i];
						score_MathCopy[index]=score_Math[i];
						score_totalCopy[index]=score_total[i];
						score_avgCopy[index]=score_avg[i];
						index++;
							
					
					}
					name=nameCopy;
					number=numberCopy;
					score_Kor=score_KorCopy;
					score_Eng=score_EngCopy;
					score_Math=score_MathCopy;
					score_total=score_totalCopy;
					score_avg=score_avgCopy;
					
				
					
					
				} else {
						System.out.println("없는 번호입니다");
					}
				System.out.println("학생 삭제 완료");
				
				
			
			
		
			} else if(select==5) {
				//5.학생 정보 추가 -이름 번호 국어 영어 수학 입력후 출력
				System.out.println("5. 학생 정보 추가");
				System.out.println("추가할 학생의 정보를 입력해주세요");
				int delete = sc.nextInt();
				
				
				for(int i=0;i<nums;i++) {
					if(number[i]==delete) {
						
						
					} else {
						System.out.println("없는 번호입니다");
					}
				}
				
				
			} else if(select==6) {
				System.out.println("6. 프로그램 종료");
				break;
			}
		}
	}

}
