import java.util.Scanner;

public class PinturaConeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tipo de tinta: "
				+ "\n[1] Tipo 1 - R$ 238,90"
				+ "\n[2] Tipo 2 - R$ 467,98"
				+ "\n[3] Tipo 3 - R$ 758,34");
		System.out.print("Escolha: ");
		int escolha = sc.nextInt();
		System.out.print("Altura (z): ");
		double z = sc.nextDouble();
		System.out.print("Raio (r): ");
		double r = sc.nextDouble();
		
		PinturaCone pc = new PinturaCone(z, r, escolha);

		System.out.println(pc);
				
		sc.close();

	}

}