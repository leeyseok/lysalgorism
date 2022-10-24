import java.util.Scanner;

public class day221024 {

	public static void main(String[] args) {
		/*
		문제 : 500원 100원 50원 10원이 무한히 존재 한다.
		손님에게 거슬러 줘야 할 돈이 N원 일 때 
		거슬러줘야 할 동전의 최소 개수 구하기
		단 돈 N은 항상 10의 배수
		*/
		Scanner scan = new Scanner(System.in);

		System.out.print("거슬러줄 돈 : ");
		int payMoney = scan.nextInt(); // 거슬러줄 돈 
		int 오백원, 백원, 오십원 ,십원= 0;
		int count = 0;

		/*
		오백원 = payMoney / 500;
		payMoney = payMoney % 500;
		
		백원 = payMoney / 100;
		payMoney = payMoney % 100;
		
		
		오십원 = payMoney / 50;
		payMoney = payMoney % 50;
		
		
		십원 = payMoney / 10;
		payMoney = payMoney % 10;

		count = 오백원 + 백원 + 오십원 + 십원; 
		System.out.println(count + "개");
		 */
		int[] arr = {500, 100, 50, 10};
		for ( int i = 0; i<arr.length; i++) {
			count += payMoney / arr[i];
			payMoney = payMoney % arr[i];
		}
		System.out.println(count);
		
		
	}

}
