package com.lams1989.angryteacher;


public class App {
	public static void main( String[] args )
    {
    	int k = 2;
    	//int[]a={-1, -3, 4, 2};// YES 3
    	//int[]a={0, -1, 2, 1};//NO 2
    	
    	//int[]a= {-93, -86, 49, -62, -90, -63, 40, 72, 11, 67};//NO 4
    	//int[]a= {23, -35, -2, 58, -67, -56, -42, -73, -19, 37};//YES 10
    	//int[]a= {13, 91, 56, -62, 96, -5, -84, -36, -46, -13}; //YES 9
    	//int[]a= {45, 67, 64, -50, -8, 78, 84, -51, 99, 60,}; //YES 8
    	
    	//int[]a= {26, 94, -95, 34, 67, -97, 17, 52, 1, 86} ; //YES 7 hay error 
    	
    	int[]a= {19, 29, -17, -71, -75, -27, -56, -53, 65, 83}; //NO 2
    	//int[]a= {-32, -3, -70, 8, -40, -96, -18, -46, -21, -79};//YES 10 
    	//int[]a= {-50, 0, 64, 14, -56, -91, -65, -36, 51, -28};//YES 9
    	//int[]a= {-58, -29, -35, -18, 43, -28, -76, 43, -13, 6};//NO 6 hay error
    	//int[] a= {88, -17, -96, 43, 83, 99, 25, 90, -39, 86};//NO 1
    	
    	System.out.println(AngryTeacher.angryProfessor2(k, a));
    	
    	
    	/*
10
50 20
97 -55 48 -22 99 -46 40 11 5 -61 78 -20 44 22 -8 82 24 -62 0 52 -79 68 -73 -81 33 60 -99 -99 59 -13 90 -26 84 90 76 36 -45 79 87 48 59 -36 42 -6 -13 21 -19 -21 39 -40
50 18
-50 58 24 69 81 84 72 50 -85 99 42 13 90 90 -81 -36 55 4 -69 -76 55 42 -84 -5 -67 13 -54 59 2 6 21 68 89 8 98 8 -48 -33 -48 54 -46 29 46 97 -90 -33 -97 -92 25 96
50 26
-36 14 -60 28 -50 56 94 -99 -39 28 0 -47 59 -35 39 15 -4 -49 85 -43 -77 38 -49 -67 92 -43 29 82 41 -26 61 60 -23 -81 -90 -96 -77 90 24 -14 5 12 0 26 16 78 -46 47 51 31
50 44
86 55 90 79 69 -74 -41 33 -88 66 84 17 60 -37 -59 -18 -83 -58 -37 -83 -78 -14 -29 59 38 -88 33 -81 -58 99 -39 -63 94 -47 -62 90 91 -15 -57 91 -51 -21 -40 30 25 -16 2 -39 4 80
50 19
12 -77 -36 76 -7 -57 99 -27 36 18 -63 -44 -5 91 -55 89 93 5 22 17 93 26 -86 -43 14 -79 -62 -88 -10 94 -46 -37 -53 -73 25 -10 17 63 -90 30 71 -33 -89 -4 -5 68 -85 95 -49 67
50 27
81 -60 55 18 -42 96 -21 84 27 40 -72 30 -47 30 -14 -22 -24 35 4 43 86 78 -62 83 -48 -24 22 35 -57 -47 -76 -18 -3 -33 -59 6 -20 8 98 -76 15 71 -59 10 24 -39 78 -53 -14 89
50 27
-87 -32 81 -50 -90 50 -13 -94 -81 -20 -82 -87 -96 -4 92 -97 34 -6 -57 95 -62 -83 54 -9 -32 21 63 82 -85 85 90 -14 16 92 -28 -25 36 18 -37 82 -10 -88 -15 37 -8 83 57 -27 69 -51
50 50
-98 10 -77 76 -52 -87 -99 -66 17 -35 98 95 5 28 28 93 97 -72 45 25 -83 27 21 -34 -34 -59 -57 61 72 -16 50 82 -17 73 -6 -64 63 -72 -37 -28 -80 -56 41 52 -11 -17 -83 -12 6 67
50 15
4 -79 -12 69 70 44 49 65 26 83 -69 -52 -93 89 -31 -64 -48 -77 -33 49 -55 -68 60 -23 71 77 45 -61 23 0 75 42 59 -89 69 51 83 -33 -4 81 -66 -67 92 -2 31 74 -18 83 -87 73
50 8
-97 18 -53 74 93 -48 -30 -59 60 24 -80 -2 80 83 -40 23 57 -31 20 -90 -91 70 -67 -71 43 -99 88 86 -32 -10 -30 -63 -79 49 -51 -64 30 15 -15 81 -34 -87 87 -43 -42 44 39 -63 53 69
*/
    	
    	
    }
}
