package d6;

public class PersonData {
	
	String name;
	
	double height;
	
	double weight;

	public PersonData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// static이 빠진다 -> 클래스가 아니라 객체에 들어갈 함수라서. ( 객체가 데이터를 가지고 있으므로 계산도하라고 함수르 만들어줌)
	// 토스했다 -> 객체에서 더 잘할 수 있으므로
	public double calc() {
		double bmi = this.weight / (this.height * this.height);       // this는 현재 사용하는 메모리(객체에서 함수를 만들어 사용하니까
																      // 현재 메모리는 객체이다.그리고 그 객체에 데이터(name,height..)가 들어가있다.
		return bmi;
	}
	
	
	@Override
	public String toString() {
		return "PersonData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}

}
