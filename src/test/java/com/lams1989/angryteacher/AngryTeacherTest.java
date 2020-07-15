package com.lams1989.angryteacher;


import junit.framework.TestCase;

public class AngryTeacherTest extends TestCase{

	public void test1() {
    	int k = 4;
		int[]a= {-93, -86, 49, -62, -90, -63, 40, 72, 11, 67};//NO 4

		String result = AngryTeacher.angryProfessor(k, a);
		assertEquals("NO", result);
		
	}
	
	public void test2() {
		int k=10;
		int[]a= {23, -35, -2, 58, -67, -56, -42, -73, -19, 37};
		String result = AngryTeacher.angryProfessor(k, a);
		assertEquals("YES", result);

	}
	
	public void test3() {
		int k=9;
		int[]a= {13, 91, 56, -62, 96, -5, -84, -36, -46, -13};
		String result = AngryTeacher.angryProfessor(k, a);
		assertEquals("YES", result);

	}
	
	public void test4() {
		int k= 8; 
		int[]a= {45, 67, 64, -50, -8, 78, 84, -51, 99, 60,};
		String result = AngryTeacher.angryProfessor(k, a);
		assertEquals("YES", result);

	}
	
	public void test5() {
    	int k = 2;
		int[]a= {19, 29, -17, -71, -75, -27, -56, -53, 65, 83}; //NO 2
		String result = AngryTeacher.angryProfessor(k, a);
		assertEquals("NO", result);


	}
}
