package day12;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("다음 문장들 실행!!!");
	}

}
