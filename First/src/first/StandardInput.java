package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int a1 =System.in.read();     //문자입력 수만큼 필요함 (가장 기본적인것 잘 안씀)
//			System.out.println("a1 : "+a1);
//			int a2 =System.in.read();
//			System.out.println("a2 : "+a2);
   		    InputStreamReader ir = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(ir);
		
			String str = br.readLine(); //한줄 형태로 입력 받음
			
			System.out.println(str);
			
			char c1 = (char)System.in.read();
			System.out.println("c1 : "+c1);
			
			
		}catch(Exception e){}
	}
}