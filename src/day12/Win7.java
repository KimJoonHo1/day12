package day12;

import java.io.IOException;
import java.util.Scanner;

public class Win7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("==== ȯ���մϴ� ====");
		while(true) {
			System.out.println("1.���");
			System.out.println("2.off");
			System.out.print("�Է� >>>> ");
			int sel = scanner.nextInt();
			switch(sel) {
				case 1:
					System.out.println("��� ���� ���");
					System.out.println("1 : �޸���");
					System.out.println("2 : ����");
					System.out.print("����� ��� �Է� : ");
					String func = scanner.next();
					if(func.equals("�޸���")) {
						ProcessBuilder pro = new ProcessBuilder("notepad");
						try {
							pro.start();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else if(func.equals("����")) {
						ProcessBuilder pro = new ProcessBuilder("calc");
						try {
							pro.start();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("���� ����Դϴ�.");
					}
					break;
				case 2:
					System.exit(1);
					break;
				default:
					System.out.println("�߸��� �Է����� �����մϴ�.");
					System.exit(1);
					break;
			}
		}
	}

}
