package day12;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ���� ��ɾ� �Է�");
		String s = scanner.next();
		ProcessBuilder pro = new ProcessBuilder(s);
		
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
