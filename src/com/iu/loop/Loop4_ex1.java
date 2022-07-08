package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		
		//문제 : 1~60분이 초까지 차례대로 입력됩니다. 분과 초를 입력받습니다. 입력한 분,초가 되면 분 초 입력이 멈춥니다.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("분을 입력");
		int m1 = sc.nextInt();
		System.out.println("초를 입력");
		int s1 = sc.nextInt();
		int m=0;
		int s=0;
		
		//boolean flag = false; 
		
		// 분과 초 입력받음 ex)1, 15가 되면 죽어
		for(m=0;m<60;m++) {
			for(s=0; s<60;s++) {
				System.out.println(m+"분 "+s+"초");
				if(m1==m&&s1==s) {
					//flag=!flag;
					m=60;
					break;
					
				
				}
				
			}//m=60을 안쓰고 바깥 for에 이하처럼 flag를 이용해서 break를 걸어도 된다.
			//안쪽 for
//			if(flag) {
//				break;
//			}
		}//바깥 for 
			
	}

}
