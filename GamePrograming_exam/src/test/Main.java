package test;

public class Main { 
	public static void main(String[] args) {
		// 1�б� �߰���� ������ ģ���� ��ü���� ����� ����
		Egg egg = new Egg(); 
		YangEgg yangEgg = new YangEgg();
		YounEgg younEgg = new YounEgg();
		
		egg.salt(); 
		yangEgg.salt();
		younEgg.salt();
		
		System.out.println(egg.�ұ�);
		System.out.println(yangEgg.�ұ�);
		System.out.println(younEgg.�ұ�);
	}
}
