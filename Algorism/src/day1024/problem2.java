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
		 * �迭�� ũ�� N ( 2<= N <= 1000 )
		 * ���ڰ� �������� Ƚ�� M ( 1<= M <= 10000 )
		 * �� ���ҿ� ���� K�� �� �ʰ��ϸ� �ȵ� ( 1<= K = 10000 )
		 * K�� �׻� M���� �۰ų� ����
		 * ū ���� ��Ģ : �پ��� ���� �̷���� �迭�� ���� �� �־��� ������ m�� ���Ͽ� ���� ū�� �����
		 * ū ���� ��Ģ�� ���� ����� ����Ͻÿ�
		 * �Է� ���� 
		 * N=5 M=8 K=3
		 * 2 4 5 4 6 
		 * �� : 46
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("nmk�� �������� �����Ͽ� �Է�");
		System.out.print("n : ");
		int n = scan.nextInt();
		scan.nextLine();
		
		System.out.print("m : ");
		int m = scan.nextInt();
		scan.nextLine();
		
		System.out.print("k : ");
		int k = scan.nextInt();
		scan.nextLine();
		
		System.out.print("�迭 �Է� : ");

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
