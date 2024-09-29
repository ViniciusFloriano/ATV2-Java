package Lista5Java;
public class Ex15 {
	public static void main(String[] args) {

		final int INI = 1;
		final int MAX = 37;
		float n1 = 37;
		float soma = 0;

		System.out.print("S = ");
		
		for (int i = INI; i <= MAX; i++) {
			if (i == MAX) {
				System.out.println("(" + n1 + "*" + (n1+1) + ")/" + i);
			} else {
				System.out.print("(" + n1 + "*" + (n1+1) + ")/" + i + " + ");
			}
			soma = soma + ((n1 * (n1+1)) / i);
			n1--;
		}
		
		System.out.print("Soma final: " + soma);
	}
}
