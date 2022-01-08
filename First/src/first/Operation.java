package first;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼항 연산자
		
		int k = 10 > 20 ? 100:200;
		System.out.println(k);
		
		//전위 연산자     k1을 증가시키고 k2 에 대입
		
		int k1= 100;
		int k2= ++k1;
		System.out.println(k1+ " " + k2);
		
		//후위 연산자    m1을 먼저 m2에 대입하고 m2를 증가
		
		int m1 = 100;
		int m2 = m1++;
		System.out.println(m1 + " " +m2);
		

	}

}
