package test;

public class Main { 
	public static void main(String[] args) {
		// 1학기 중간고사 시험대비 친구들 객체지향 설명용 예제
		Egg egg = new Egg(); 
		YangEgg yangEgg = new YangEgg();
		YounEgg younEgg = new YounEgg();
		
		egg.salt(); 
		yangEgg.salt();
		younEgg.salt();
		
		System.out.println(egg.소금);
		System.out.println(yangEgg.소금);
		System.out.println(younEgg.소금);
	}
}
