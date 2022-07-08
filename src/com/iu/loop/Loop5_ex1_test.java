package com.iu.loop;

public class Loop5_ex1_test {

	public static void main(String[] args) {
		int level=0;
		int gold = 0;
		
//		for(level=1;level<=40;level++) {
//		gold+=1000;
//		System.out.println(level*5);
//		System.out.println(gold);
//		}
		for(level=1;level<=15;level++) {
			while(level%5==0) {
				gold += 1000;
				System.out.println(gold);
				if(level<200) {
					break;
				}
				}
			
		}
//		for(int bosang=5;bosang<=5*level;bosang++) {
//			gold+=1000;
//			System.out.println(level+"레벨 축하금 "+gold+"를 드립니다");
//			
//			}
		
		
	}

}
