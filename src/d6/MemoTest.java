package d6;

import java.util.Scanner;

public class MemoTest {

	public static void main(String[] args) {
		// 재료
		Scanner scanner = new Scanner(System.in);
		// 준비시작. 뽑을 상자를 만들어 준다.
		Memo[] box = new Memo[5];          // Memo에서 생산된 객체의 리모컨이 box로 들어감

		int idx = (int) (Math.random() * box.length);

		for (int i = 0; i < box.length; i++) {
			box[i] = idx == i ? new Memo("X") : new Memo("O");
		}
		// 박스안에 종이 다 넣어놈...............
		
		
		// Memo m1 = new Memo(); 는 에러 -> 내용을 안주면 못만들게 Memo에서 설정해놔서
		// Memo m1 = new Memo("O");
		// Memo m2 = new Memo("0");
		// Memo m3 = new Memo("X");
		// Memo m4 = new Memo("0");
		// Memo m5 = new Memo("0");

		// Memo[] box = { m1,m2,m3,m4,m5 };

		for (int i = 0; i < box.length; i++) {
			System.out.println("Enter를 누르세요");

			scanner.nextLine();

			Memo m = box[i];
			// 여기서 하는거 대신 데이터를 가지고 있는 Memo에서 인스턴스 메서드 만드는게 낫다.

			if (m.showResult()) {
				System.out.println("꽝");
			} else {
				System.out.println("당첨");
				break;

			}

		} // end for

	} // end main
}
