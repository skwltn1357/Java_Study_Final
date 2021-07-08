package quiz;

import java.util.Arrays;

public class B12_ArrayQuiz {
	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,},
			{1,1},
			{1,1,1,1},			
		};
		
		/*
		 	1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꿔보세요
		 	2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균 (소수점 둘째자리)을 구해서 출력해보세요
		 	3. numArr의 각 행(row)의 합을 모두 구해서 출력해보세요
		 	4. numArr의 각 열(column)의 합을 모두 구해서 출력해보세요
		 */
		
		// 1번
		for(int row = 0; row < numArr.length; ++row) {
			for(int column = 0; column < numArr[row].length; ++column) {
				numArr[row][column] = (int)(Math.random()*101);			
			}
		}
		
		
		// 2번
		int sum = 0;
		int count = 0;
		
		for(int row = 0; row < numArr.length; ++row) {
			
			int len = numArr[row].length;
			count += len;

			for(int column = 0; column < len; ++column) {
				System.out.println(numArr[row][column]+"\t");	
				sum += numArr[row][column];
				
			}
			System.out.println();
		
		}
		System.out.printf("총합: %d, 평균 : %.2f\n", sum, sum/(double)count);
		
		
		// 3번
		int[] rowSum = new int[numArr.length];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int column = 0; column < numArr[row].length; ++column) {
				rowSum[row] += numArr[row][column];
			}
		}
		
		// 4번
		int max_len = 0;
		
		for(int row = 0; row < numArr.length; ++row) {
			max_len = Math.max(max_len, numArr[row].length);
		}
		
		int[] colSum = new int[max_len];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int column = 0; column < numArr[row].length; ++column) {
				colSum[column] += numArr[row][column];
			}
		}
		// 배열을 편리하게 출력하는 방법
		System.out.println("행의 합 : " + Arrays.toString(rowSum));
		System.out.println("열의 합 : " + Arrays.toString(colSum));
		
		
		
		
		
		
		// 1번 , 2번 지수풀이
//		int sum = 0;
//		double average = 0;
//		
//		for(int i = 0; i < numArr.length; ++i) {
//			for(int j = 0; j < numArr[i].length; ++j ) {
//				int random_number = (int)(Math.random()*100);
//				numArr[i][j] = random_number;
//				System.out.printf("numArr[%d][%d]:%d\n",i,j,numArr[i][j]);
//				sum += numArr[i][j];
//				average = sum / numArr.length;
//			}
//		}
//		System.out.println("총 합 : " + sum);
//		System.out.printf("평균 : %.2f", average);
//		

	

	}

}
