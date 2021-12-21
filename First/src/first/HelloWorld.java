package first;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World"); //자바의 기본 출력문 이후 줄바꿈o 
		System.out.print("Hello, World"); //이후 줄바꿈X
		System.out.printf("정수 : %d %d\n",100,200); //printf로 정수값 출력
		System.out.printf("정수 : %s\n","abc"); 
		
		System.out.printf("정수 : %.2f\n",123.456);
		System.out.printf("정수 : %9d\n",10); //앞에 9개만큼 빈칸 띄움 (정수만 가능)
		System.out.printf("정수 : %09d\n",10); //앞에 9개 만큼 0으로 채움
		
		


	}

}
