package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		//아디비번입력, 로그인성공하면종료, 실패하면 무한다시입력
		
		Scanner sc = new Scanner(System.in);
		
		int yid = 1234;
		int ypw = 5678;
		boolean check = true;
		
		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종 료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("id입력");
				int id = sc.nextInt();			
				System.out.println("pw입력");
				int pw = sc.nextInt();	
				
				if(yid==id&&ypw==pw) {
					System.out.println("로그인성공");
					check=!check;
				} else {
				System.out.println("로그인실패");
				}
				break;
			case 2:
				check=!check;
				System.out.println("종료");
				break;
				
			}
				
				
			
		}
		
	}

}
