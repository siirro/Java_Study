package com.iu.control;

public class Control4 {

	public static void main(String[] args) {
		//
		int select = 1;
		
		switch(select*2+1-3) {
		case 1:
			System.out.println("1 일때 진행");
			break;
		case 2:
			System.out.println("2 일때 진행");
			break;
		default:
			System.out.println("그외 나머지");
//		case "abc":
//			System.out.println("1일때 진행");
//			break;
		
		}

	}

}
