
public class Example04 {

	public static void main(String[] args) {
		//실수 정수 연산 -> 실수
		System.out.println(2.2 + 1);
		System.out.println(2.0 + 1.0);
		System.out.println(2.0 + 1);
		System.out.println(5.0 / 2);
		
		//문자열 연산
		System.out.println("안녕" + "하세요");
		System.out.println("안녕 " + 5);
		System.out.println("5" + 2);
		System.out.println("!" + true);
		
		System.out.println(1 + 2 + 3 + "4");
		
		//삼항연산자
		//조건에 따라 결과가 달라짐
		int score = 80;
		//score가 90점이상이면 "A", 아니면 "B"
		//true면 : 앞에값, false면 : 뒤에값
		String b = score >= 90 ? "A" : "B";
		System.out.println(b);
		
		//증감연산자
		//증감연산자가 앞이면 먼저계산, 뒤에있으면 후에 계산
		int a = 0;
		System.out.println(a++); //0 -> a = a + 1이랑 결과 동일
		System.out.println(a); //1
		System.out.println(++a); //2
		System.out.println(a--); //2 -> a = a - 1이랑 결과 동일
		System.out.println(--a); //0
		System.out.println(a);
		
		
	}

}
