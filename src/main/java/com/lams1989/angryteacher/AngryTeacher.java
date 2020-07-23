package com.lams1989.angryteacher;

public class AngryTeacher {

	public static String angryProfessor(int k, int[] a) {
		int n = a.length;
		int count = 0;
		if (k >= 1 && k <= n) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= -100 && a[i] <= 100) {
					if (a[i] >= 0) {
						count++;
					}
				}
			}
		}
		if (count <= k) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static String angryProfessor2(int k, int[] a) {
		int count = k;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				count--;
			}
		}
		if (count > 0) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
