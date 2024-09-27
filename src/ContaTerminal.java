package src;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		long numero;
		String agencia;
		String nomeCliente;
		float saldo;

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		while (true) {
			try {
				System.out.println("Por favor, digite o número da conta:");
				numero = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine();
			}
		}

		System.out.println("Por favor, digite a agência da conta:");
		agencia = scanner.next();

		System.out.println("Por favor, digite o nome do cliente da conta:");
		nomeCliente = scanner.next();

		while (true) {
			try {
				System.out.println("Por favor, digite o saldo da conta:");
				saldo = scanner.nextFloat();
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine();
			}
		}

		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
						"sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
				nomeCliente, agencia, numero, saldo);

		scanner.close();
	}
}
