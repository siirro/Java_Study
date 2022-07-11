package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex02 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
//		//로또번호 1~45 6개 나오게하기

//		int [] num = new int[6];
//		
//		for(int i =0;i<6;i++) {
//		num[i] = random.nextInt(45); //-20~+20
//		
//		}
//		
//		for(int i =0;i<6;i++) {
//		System.out.println(num[i]);
//		}
		
		
		
		//몬스터 기본정보
		String [] monsterNames = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름을 입력하세요");
		String name = sc.next();
		
		//파이어볼
		int magicPower = 6;
		
		
		
		
		System.out.println("몬스터의 수를 입력하세요 [단, 1~4마리만 가능]");
		int monsterNums = sc.nextInt();
		
		String [] monsterPartyNames = new String[monsterNums];
		int [] monsterPartyHps = new int[monsterNums];
		
		
		for(int i=0;i<monsterPartyNames.length;i++) {
		int index = random.nextInt(4);
		monsterPartyNames[i] = monsterNames[index];
		monsterPartyHps[i] = monsterHps[index];
		}
		
		
		boolean check = true;
		while(check) {
			int death = 0;
			System.out.println("1. 사냥 2. 도망");	
			int select = sc.nextInt();
			
			
			if(select==1) {
			//1 사냥 2. 도망
			//0~6미만의 랜덤한 데미지로 몬스터를 공격
			
				for(int i=0;i<monsterPartyNames.length;i++) {
				System.out.println(monsterPartyNames[i]+"---체력:"+monsterPartyHps[i]);
				}
				
				for(int i=0;i<monsterPartyNames.length;i++) {
				int damage = random.nextInt(magicPower-1);
				System.out.println(monsterPartyNames[i]+"에게 데미지 "+damage+"을 입혔습니다");	
				monsterPartyHps[i] -= damage;
				
				}
				for(int i=0;i<monsterPartyNames.length;i++) {
				System.out.println(monsterPartyNames[i]+"의 남은 HP : "+monsterPartyHps[i]);
				if(monsterPartyHps[i] <1) {
					death++;
					System.out.println(monsterPartyNames[i]+"가 죽었습니다");
				}
				
				}
				
			} else if(select==2) {
			System.out.println("게임종료");
			check = !check;
			}
			
			System.out.println("사냥한 몬스터 수 : "+death);
			
			}
		
		//몬스터 파티 생성 (체력은 반피부터 풀피까지 랜덤 생성)
		//몬스터 수 입력 (1-4)
		//랜덤하게 입력한 수 만큼 몬스터를 뽑고, 출력하시오
	}

}
