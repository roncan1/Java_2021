
public class Main {

	public static void main(String[] args) {
		int n[]= new int[6];
		n[0] = 0;
		n[1] = 3;
		n[2] = 1;
		n[3] = 5;
		n[4] = 1;
		n[5] = 4;
		
		int a, k;
		 for(a=1; a <= 5; a++){ //5¹ø ¹Ýº¹
		      k = n[a]; // 3        1		3		1		4
		   n[k] = n[a]; // n[3]>3   n[1]>1	n[3]>3  n[1]>1	n[4]>4
		 }
		 for(a = 1; a <= 5; a++)
		   System.out.println(n[a]);
	}
}
