package test;

public class YangEgg extends Egg{

	int a = 100;
	@Override
	public void salt() {
		소금 += 2;
	}
	
	public void super사용() {
		super.소금 = 10;
	}

	
}
