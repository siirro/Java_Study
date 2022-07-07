package com.iu.loop;

import java.util.Scanner;

public class dsfdsf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int yid=1234;
		int ypw=5678;
		
		for(int i=0;i<5;i++) {
			System.out.println("id입력");
			int id = sc.nextInt();
			System.out.println("pw입력");
			int pw = sc.nextInt();
			if(id==yid&&pw==ypw) {
				System.out.println("로그인성공");
			} else {
				System.out.println("로그인실패");
			}
		}
	}

}
