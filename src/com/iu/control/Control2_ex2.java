package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1,2,3,4,5 중 하나를 입력하세요");
		int num = sc.nextInt();
		
		System.out.println("알파벳을 입력");
		
		char ch = sc.next().charAt(0);
		
		
		//소문자가 범위를 벗어났을때
		
		if(num==1) {
			ch = (char)(ch+num);
			//ch += 1
		} else if(num==2) {
			ch = (char)(ch+num);
		} else if(num==3) {
			ch = (char)(ch+num);
		} else if(num==4) {
			ch = (char)(ch+num);
		} else if(num==5) {
			ch = (char)(ch+num);
		}
		
		if(ch>=122) {
			ch -= 26;
		}
		
		//result = (char)ch+num;
		//if(result>'z') {
		//result = result - 'z'-1; 
		//result = 'a'+result;+
		
		//대문자가 범위를 벗어났을대
		
		
		if(ch>=90&&ch<97) {
			ch -= 26;
		}
		
		System.out.println(ch);
		

		//Study Edition
		//집에서 추가했어요ㅇㅇ

	}

}
