package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int a1 =System.in.read();     //�����Է� ����ŭ �ʿ��� (���� �⺻���ΰ� �� �Ⱦ�)
//			System.out.println("a1 : "+a1);
//			int a2 =System.in.read();
//			System.out.println("a2 : "+a2);
   		    InputStreamReader ir = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(ir);
		
			String str = br.readLine(); //���� ���·� �Է� ����
			
			System.out.println(str);
			
			char c1 = (char)System.in.read();
			System.out.println("c1 : "+c1);
			
			
		}catch(Exception e){}
	}
}