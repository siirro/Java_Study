package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		//아디비번입력, 로그인성공하면종료, 실패하면 무한다시입력
		
		Scanner sc = new Scanner(System.in);
		
		int yid = 1234;
		int ypw = 5678;
		
		boolean check1 = true;
		
		
		System.out.println("1.로그인");
		System.out.println("2.종 료");
		int select = sc.nextInt();
		
		while(check1) {
		//로그인 실패해도 계속 로그인시도하는 와일
		switch(select) {
		
		case 1:
			System.out.println("id입력");
			int id = sc.nextInt();			
			System.out.println("pw입력");
			int pw = sc.nextInt();	
			
			
			if(yid==id&&ypw==pw) {
				
				int level = 1;
				int gold = 1000;
				int bosang = 0;
				System.out.println("로그인성공");
				System.out.println("게임시작");
				System.out.println("LEVEL : "+level+" GOLD : "+gold);
				
				boolean flag = true;
				while(flag) {
					check1=!check1;
					System.out.println("사냥하시겠습니까? 1:yes, 2:no");
					int sanyang = sc.nextInt();
					if(sanyang==1) {
						
						for(level=2;level<=15;level++) {
							while(level%5==0) {
								bosang += 1000;
								gold = gold + bosang;
							
								}
							for(int exp=1;exp<=3*(level-1);exp++) {
								
							System.out.println("몬스터 등장!");
							System.out.println(".......잡았다!");
							System.out.println("경험치 "+exp+"/"+3*(level-1)+ "획득");
							System.out.println("---------------------------------");
							
							
							}
						System.out.println("레벨이 1 증가했습니다");
						System.out.println("레벨이 "+(level-1)+"에서 "+level+"가 되었습니다.");
						
						/*
						if(level==5) {
							gold += 1000;
							System.out.println("5렙 축하금 1000골드 획득");
						} else if(level==10) {
							gold += 2000;
							System.out.println("10렙 축하금 2000골드 획득");
						} else if(level==15) {
							gold += 3000;
							System.out.println("15렙 축하금 3000골드 획득");
						}
						*/
						
						
						
						
						if(level%5==0) {
						System.out.println(level+"레벨 축하금 "+bosang+" 원을 드립니다");
						}
						System.out.println("보유한 골드는 "+gold+"원입니다");
						System.out.println("=======================");
						
						}
						
						System.out.println("ㅊㅋ 레벨 : "+(level-1)+"(만렙) 골드 : "+gold);
						System.out.println("게임종료");
						flag=!flag;
						check1=!check1;
						
						
						
					} else if(sanyang==2) {
						System.out.println("그럼 뭐하게.. 게임종료");
						flag=!flag;
						check1=!check1;	
					} else {
						System.out.println("다른 번호를 고르세요");
					}
				}//사냥while
				check1=!check1;	
				break;
			} //로그인성공하면if// 
				else {
				System.out.println("로그인실패");
				}
			
		break;	
		case 2:
			System.out.println("게임종료");
			check1=!check1;	
			
		}//switch종료
		}//}////로그인 실패해도 계속 로그인시도하는 와일
			
			
		//while끝
		
		//2번문제
		//로그인을 안했으면 프로그램이 종료
		//로그인에 성공했으면 게임 시작
		//사냥할거니? 안할거니?
		//RPG 시작레벨:1, 만렙:15 
		//gold : 1000원, 
		//몬스터잡기 3번 나오면 레벨2가 된다.
		//모든 몬스터의 경험치는 동일합니다
		// 1-2 : 3마리 
		// 2-3 : 6마리 
		// 3 4   9
		// 4 5   12 
	    // 5렙 달성시 축하금으로 1000골드
		// 10렙 달성시 축하금으로 2000골드
		// 15렙 달성시 축하금으로 3000골드
		//최종 15렙 7000골드
		
		
		
	}

}

