package Lista6Java;
import java.util.Scanner;
public class Ex47 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String data = "";
		int dataInteiros[] = new int[3];
		int diasPorMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		System.out.print("Digite uma data no formato dd/mm/aaaa: ");
		data = scan.nextLine();
		
		String partes[] = data.split("/");

		if (partes.length != 3) {
			System.out.println("Formato de data inválido! Use o formato dd/mm/aaaa.");
		} else {
			dataInteiros[0] = Integer.parseInt(partes[0]);
			dataInteiros[1] = Integer.parseInt(partes[1]);
			dataInteiros[2] = Integer.parseInt(partes[2]);

			if (dataInteiros[1] == 2 && ((dataInteiros[2] % 4 == 0 && dataInteiros[2] % 100 != 0) || (dataInteiros[2] % 400 == 0))) {
				diasPorMes[1] = 29;
			}

			if (dataInteiros[0] >= 1 && dataInteiros[0] <= diasPorMes[dataInteiros[1] - 1]) {
				System.out.println("Data válida.");
				System.out.println("Dia: " + dataInteiros[0] + " Mês: " + dataInteiros[1] + " Ano: " + dataInteiros[2]);
			} else if (dataInteiros[0] < 1 || dataInteiros[1] > 12) {
				System.out.println("Data inválida!");
			} else {
				System.out.println("Data inválida!");
			}
		}

		scan.close();
	}
}
