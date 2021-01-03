package d6;
 
 
public class MovieTest {

	public static void main(String[] args) {
		// 사용자가 정의하는 데이터 타입
		// Movie 클래스 블록({})을 실행하라.. 어디에? new ( 새로운 메모리에 ) .. 
		Movie m1 = new Movie("멜로,",3,5);
		
		m1.category = "멜로";
		m1.action = 3;
		m1.kiss = 5;
		
		Movie m2 = new Movie("액션",20,1);
		m2.category = "액션";
		m2.action = 20;
		m2.kiss = 1;

		Movie[] arr = { m1,m2 };
		
		System.out.println(arr[1]);
		
	}
}
