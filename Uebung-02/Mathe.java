/**
* @author dkosba2s
*/
public class Mathe {
	public static int abs(int n) {
		if(n < 0) {
			return n*(-1);
		} else {
			return n;
		}
	}
	public static int max3(int a, int b, int c) {
		if(a >= b && a >= c) {
			return a;
		} else if(b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}
}
