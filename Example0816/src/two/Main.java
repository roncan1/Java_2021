package two;

public class Main {

	public static void main(String[] args) {
		int cnt;
		int num[][] = new int[3][3];
		num[0][0] = 0;
		
		System.out.print("asdda\nsadd");
		
	    int x, y;
	     cnt = 0;
	     x = 1;
	     y = 0;
	     while(cnt < 9) {
	         cnt += 1;
	         if(y < 0 && x > 2) {
	             y = y + 2;
	             x = x - 1;
	         }
	         
	         else if( y < 0 )
	             y = 2;
	         
	         else if(x > 2)
	             x = 0;
	         
	         else if(num[y][x] != 0) {
	             y = y + 2;
	             x = x - 1;
	         }
	         
	         num[y][x] = cnt;
	         y = y - 1; 
	         x = x + 1;
	     } 
	     for(y = 0; y <= 2; y++) {
	         for(x = 0; x <= 2; x++)
	         System.out.print(num[y][x]);
	         System.out.println();
	     }
	}
}
