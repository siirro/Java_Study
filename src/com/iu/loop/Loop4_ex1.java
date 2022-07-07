package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("분을 입력");
		int m1 = sc.nextInt();
		System.out.println("초를 입력");
		int s1 = sc.nextInt();
		int m=0;
		int s=0;
		
		// 분과 초 입력받음 ex)1, 15가 되면 죽어
		for(m=0;m<60;m++) {
			for(s=0; s<60;s++) {
				if(m1==m) {
					break;
				} else {
				System.out.println(m+"분 "+s+"초");
				}
			}//안쪽 for
			if((s1+1)==s) {
				break;
			} else {
			System.out.println(m+"분 "+s+"초");
			}
		}//바깥 for 
			
	}

}
