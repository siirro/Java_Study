package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//총알 : 
		//탄창 : 30발, 3개
		
		//1. 단발 한발씩 탕. 2. 점사 3발씩 타타탕
		
		Scanner sc = new Scanner(System.in);
		

		for(int j = 1;j<=3;j++) {
			System.out.println(j+"번째 기회 : 1번은 단발, 2번은 점사");
			int select = sc.nextInt();
			int dan = 0;
			int jum = 0;
			
			/*
			 int count=10;
			 String sound="타타탕"
			 if(select==1) {
			 	count==30
			 	sound="탕"
			 }
			 for(int b=0; b<count; b++) {
			 	System.out.println(sound);
			 }
			 */
			
			if(select==1) {
				for(int i = 0;i<30/1;i++) {
				dan++;
				System.out.println(dan+"번째 탕");
				}
			} else if(select==2) {
				for(int i = 0;i<30/3;i++) {
				jum++;
				System.out.println(jum+"번째 탕탕탕");
				}
			}
			
		}//바깥 for
		System.out.println("게임종료");
	}

}




/*for(int i = 0;i<30;i++) {

if(select==1) {
	dan++;
	System.out.println(dan+"번째 탕");
	
} else if(select==2) {
	jum++;
	System.out.println(jum+"탕탕탕");
	i++;
	i++;
}

}//안쪽 for
*/
