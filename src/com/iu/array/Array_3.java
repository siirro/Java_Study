package com.iu.array;

public class Array_3 {

	public static void main(String[] args) {
		int [] nums = new int [3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;

		int [] nums2 = nums;
		System.out.println(nums[2]);
	}

}
