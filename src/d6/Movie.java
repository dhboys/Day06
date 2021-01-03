package d6;

public class Movie {
	// class -> 새로운 구조를 만든다. ( 문자 + 숫자) , 복합 타입을 만들 것(데이터가 흩어지지 않게하기 위해)
	// 1. 구조만들기
	// 특징 1) 변수 초기화x -> 각자 다른 값들을 넣으려고 선언한 것이므로 구조만 잡아주면 되는것이다.
	// -> 이것을 인스턴스변수(=멤버 변수)라고 한다.
	String category;

	int action;

	int kiss;

	// alt + shift + s -> generate constructor using field
	// Movie라는 타입이라 return타입(void,int.. 등)이 따로 없다.
	// 생성자 함수 -> new와 함께 인스턴스를 만들 때 사용.
	// -> 뜻 : 제한 -> 제시된 파라미터 입력해야만 인스턴스가 생성
	public Movie(String category, int action, int kiss) {
		super();
		this.category = category;
		this.action = action;
		this.kiss = kiss;
	}
	
	// 데이터를 가지고 있으므로 여기 인스턴스에서 거리 계산하는게 낫다.
	
	public double calcDistance(int action, int kiss) {
		
		return Math.sqrt(Math.pow(this.action - action,2) + Math.pow(this.kiss, 2));
		
	}
	

	@Override
	public String toString() {
		return "Movie [category=" + category + ", action=" + action + ", kiss=" + kiss + "]";
	}

	// this => ( 현재 인스턴스 )
	// => 인스턴스의 내부에서 현재 메모리를 의미
	// 자바에서 this는 생략가능

}
