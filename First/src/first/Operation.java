package first;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ������
		
		int k = 10 > 20 ? 100:200;
		System.out.println(k);
		
		//���� ������     k1�� ������Ű�� k2 �� ����
		
		int k1= 100;
		int k2= ++k1;
		System.out.println(k1+ " " + k2);
		
		//���� ������    m1�� ���� m2�� �����ϰ� m2�� ����
		
		int m1 = 100;
		int m2 = m1++;
		System.out.println(m1 + " " +m2);
		

	}

}
