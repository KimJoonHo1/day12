package day12;

import java.io.IOException;
import java.util.Scanner;

public class Win7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("==== 환영합니다 ====");
		while(true) {
			System.out.println("1.기능");
			System.out.println("2.off");
			System.out.print("입력 >>>> ");
			int sel = scanner.nextInt();
			switch(sel) {
				case 1:
					System.out.println("사용 가능 기능");
					System.out.println("1 : 메모장");
					System.out.println("2 : 계산기");
					System.out.print("사용할 기능 입력 : ");
					String func = scanner.next();
					if(func.equals("메모장")) {
						ProcessBuilder pro = new ProcessBuilder("notepad");
						try {
							pro.start();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else if(func.equals("계산기")) {
						ProcessBuilder pro = new ProcessBuilder("calc");
						try {
							pro.start();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("없는 기능입니다.");
					}
					break;
				case 2:
					System.exit(1);
					break;
				default:
					System.out.println("잘못된 입력으로 종료합니다.");
					System.exit(1);
					break;
			}
		}
	}

}
