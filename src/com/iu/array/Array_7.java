package com.iu.array;

public class Array_7 {

	public static void main(String[] args) {
		int [] ar = {4,7,1,3,9};
		//내림차순으로 정렬하기!! (노가다ver)
		
		for(int i=0;i<ar.length-1;i++) {
			//i=0, 1234와 비교
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int tmp = ar[j];
					ar[j]=ar[i];
					ar[i]=tmp;
				}
			}
			//i=1, 234와 비교
			
			//i=2, 34와 비교
			
			//i=3, 4와 비교
			
		}
		
		
		
		for(int i =0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
