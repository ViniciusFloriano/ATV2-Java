package Lista5Java;
public class Ex06 {
	public static void main(String[] args) {
		
		final int MAX = 50;
		final int INI = 1;
		
		for (int i = INI; i <= MAX; i += 2) {
			if (i == MAX) {
				System.out.print(i);
			} else {				
				System.out.print(i + ", ");
			}
		}
		
	}
}
