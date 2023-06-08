package com.java.study;

public class L16ArrayEx {
	public static void main(String[] args) {
		//반복문 연습문제
//		double [] scoreArr = {14.5,6.6,60,33,5.5,100,47.7};
//		//평균을 for문과 whlie문을 사용해 구해보기
//		int q=0;
//		double Sum=0;
//		while (q<scoreArr.length) {
//			Sum=Sum+scoreArr[q++];
//		}
//		System.out.println("평균 : "+Sum/q);
//			Sum=0;
//		for(int w=0; w<scoreArr.length; w++) {
//			Sum=Sum+scoreArr[w];
//		}
//		System.out.println(scoreArr.length);
//		System.out.println(Sum/scoreArr.length);
//		
							// 1부터 20까지의 홀수를 더하세요
//		int sum20=0;
//		int t=0;
//		int r=1;
//		do {
//			t=(r%2);
//			if (t==1) {
//				sum20=sum20+r;
//				//System.out.println("1~"+r+"사이 홀수의 합은"+sum20);
//			}	r++;		
//		}while(r<21); 
//		//System.out.println(t);
//		System.out.println("1~20사이 홀수의 합은"+sum20);
//	
//		int sum2 = 0;
//		int j=0;
//		for(int x=1; x<21; x++) {
//			j=(x%2);
//			if (j==0) {				
//				continue;
//			}
//		sum2=(sum2+x);
//		}
//		System.out.println("1~20사이 홀수의 합 : "+sum2);
//		
//					//검사식 : 배열에서 음수를 찾아 양수로 바꾸세요 (음수의 수를 반환)
//		int [] numArr= {1,2,3,-4,5,6,-7,8,9};
//		int e=0;
//		while (e<numArr.length) {
//			if (numArr[e]<0) {
//				numArr[e]= numArr[e]*-1;
//			}
//			System.out.println(numArr[e]+" ");
//			e++;
//		}
		
		
							//구구단 7단을 출력하세요
		//1~9 어레이 생성
		int [] onetonine= new int [9]; // {012345678}
		for(int i =0; i < onetonine.length; i++) {
			onetonine[i]= i;
		}
		
		//1~9어레이 엘레먼트들을 숫자 7과 곱하고 시스아웃
		for(int i =0; i < onetonine.length; i++) {
			for(int j =1; j <= 9; j++){
				int z = onetonine[i] *j;
				System.out.print(z+", ");
				if(j==9) {
					System.out.println("\n");
				}
			}
		}
		
		/*
		int [] Nine= new int [9];
		int j = 1;
		for(int i =0; i < Nine.length; i++) {
			Nine[i]= j;
			j++;
		}
		
		for(int i =0; i < Nine.length; i++) {
			
			int z = Nine[i] *7;
			System.out.println(z);
		}	
		*/
	}
}
