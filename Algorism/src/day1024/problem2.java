package day1024;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class problem2 {

	public static void main(String[] args) {
		
		/*
		 * 배열의 크기 N ( 2<= N <= 1000 )
		 * 숫자가 더해지는 횟수 M ( 1<= M <= 10000 )
		 * 한 원소에 연속 K번 을 초과하면 안됨 ( 1<= K = 10000 )
		 * K는 항상 M보다 작거나 같다
		 * 큰 수의 법칙 : 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 m번 더하여 가장 큰수 만들기
		 * 큰 수의 법칙에 따른 결과를 출력하시오
		 * 입력 예시 
		 * N=5 M=8 K=3
		 * 2 4 5 4 6 
		 * 답 : 46
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("nmk를 공백으로 구분하여 입력");
		System.out.print("n : ");
		int n = scan.nextInt();
		scan.nextLine();
		
		System.out.print("m : ");
		int m = scan.nextInt();
		scan.nextLine();
		
		System.out.print("k : ");
		int k = scan.nextInt();
		scan.nextLine();
		
		System.out.print("배열 입력 : ");

		int[] arr = new int[n];
		for ( int i = 0; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		
		int temp = 0;
		for ( int i = 0; i < arr.length; i++) {
			for ( int j = 0; j < arr.length; j++) {
				if ( arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		int first = arr[n-1];
		int second = arr[n-2];
		
		
		int count = (m / (k+1)) * k;
		System.out.println(count);
		count += m % (k+1);
		System.out.println(count);
		
		int answer = (first * count);
		answer += (m-count)*second;
		
		System.out.println(answer);
	}
}
