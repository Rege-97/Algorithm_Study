package partialsum;

import java.util.*;

public class PartialSum {

	public static void main(String[] args) {
		// 구간합

		Scanner sc = new Scanner(System.in);

		int arr[] = { 15, 13, 10, 7, 3, 12 };
		int sumArr[] = new int[arr.length];
		
		// 합배열 구하기
		sumArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sumArr[i] = sumArr[i - 1] + arr[i];
		}

		System.out.println("합배열 : " + Arrays.toString(sumArr));

		System.out.println("인덱스 범위 0~5");
		System.out.print("시작 인덱스 : ");
		int a = sc.nextInt();
		System.out.print("끝 인덱스 : ");
		int b = sc.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum += arr[i];
		}

		System.out.println("직접 구한 구간합 : " + sum);

		// 구간합 알고리즘으로 O(1) 시간복잡도로 구현
		int sum2 = sumArr[b] - sumArr[a - 1];
		System.out.println("구간합 알고리즘 : " + sum2);

	}

}
