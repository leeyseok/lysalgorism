import java.util.Scanner;

public class day221024 {

	public static void main(String[] args) {
		/*
		���� : 500�� 100�� 50�� 10���� ������ ���� �Ѵ�.
		�մԿ��� �Ž��� ��� �� ���� N�� �� �� 
		�Ž������ �� ������ �ּ� ���� ���ϱ�
		�� �� N�� �׻� 10�� ���
		*/
		Scanner scan = new Scanner(System.in);

		System.out.print("�Ž����� �� : ");
		int payMoney = scan.nextInt(); // �Ž����� �� 
		int �����, ���, ���ʿ� ,�ʿ�= 0;
		int count = 0;

		/*
		����� = payMoney / 500;
		payMoney = payMoney % 500;
		
		��� = payMoney / 100;
		payMoney = payMoney % 100;
		
		
		���ʿ� = payMoney / 50;
		payMoney = payMoney % 50;
		
		
		�ʿ� = payMoney / 10;
		payMoney = payMoney % 10;

		count = ����� + ��� + ���ʿ� + �ʿ�; 
		System.out.println(count + "��");
		 */
		int[] arr = {500, 100, 50, 10};
		for ( int i = 0; i<arr.length; i++) {
			count += payMoney / arr[i];
			payMoney = payMoney % arr[i];
		}
		System.out.println(count);
		
		
	}

}
