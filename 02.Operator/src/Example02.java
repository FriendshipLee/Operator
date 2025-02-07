
public class Example02 {

	public static void main(String[] args) {
		//논리연산자
		//곱연산 && (AND 그리고) 둘다 true -> true (하나라도 false면 false)
		int a = 10;
		int b = 20;
		System.out.println(a < b && b == 20);
		System.out.println(a > b && b == 20);
		//합연산 || (OR, 또는) 하나라도 true면 true
		System.out.println(a > b || b == 20);
		System.out.println(1 > 0 && 2 > 0);
		//부정연산자 ! (NOT) true면 false, false면 true
		System.out.println(!true);
		
	}

}
