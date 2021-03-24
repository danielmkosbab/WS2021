/**
* @author dkosba2s
*/
public class MatheErweitert {
	public static void quadOutRueck(int n) {
		while(n > 0) {
			System.out.println(n*n);
			--n;
		}
	}
	public static int fak(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return fak(n-1)*n;
		}
	}
	public static int fakLoop(int n) {
		int result = 1;
		while(n > 0) {
			result *= n;
			--n;
		}
		return result;
	}
}
