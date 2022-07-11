package com.iu.array;

public class Array_1 {

	public static void main(String[] args) {
		// 배열 선언 문법
		// 변수 선언 공식
		// 데이터타입 변수명;
		// 모으려고하는데이터타입 [] 변수명 = new 데이터타입[배열길이]
		// int [] nums;
		int age = 30;
		int [] nums = new int[3];
		char [] names = new char[2];
		
		nums[1] = age;
		nums[2] = 50;
		nums[0] = 10;
		
		names[0] = 'z';
		names[1] = '한';
		
		
		System.out.println(age);
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(names[0]);
		System.out.println(names[1]);

		
		
	}

}
