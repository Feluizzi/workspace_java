import java.util.Scanner;

import javax.swing.JOptionPane;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		int opcao = -1;
		double valor;

		ContaCorrente c1, c2, c3;
		c1 = new ContaCorrente(1111, 1, "Felipe", "111.111.111-21", 11000.11);
		c2 = new ContaCorrente(2222, 2, "Rael", "123.123.345-99", 450222.25);
		c3 = new ContaCorrente(3333, 3, "Fulano", "123.123.345-XX", 500450.30);

//		c1.setAll(1111, 1, "Felipe", "111.111.111-21", 11000.11);
//		c2.setAll(2222, 2, "Rael", "123.123.345-99", 450222.25);
//		c3.setAll(3333, 3, "Fulano", "123.123.345-XX", 500450.30);

		System.out.println("inicio do ogm" + opcao);

		while (opcao != 0) {
			System.out.println("MENU DO ROLE");
			System.out.println("1- Info");
			System.out.println("2- Deposito");
			System.out.println("3- Sacar");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(c1.exibirInfo());
				System.out.println(c2.exibirInfo());
				System.out.println(c3.exibirInfo());
				break;
			case 2:
				System.out.println("Valor do deposito: R$");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
			case 3:
				System.out.println("Valor a ser sacado: R$");
				valor = teclado.nextDouble();
				if (c1.sacar(valor)) {
					System.out.println("R$" + valor + " sacado com sucesso!");
				} else {
					System.out.println("R$" + valor + " é maior do que seu saldo. (saldo: R$" + c1.getSaldo() + ")");
				}
				break;
			case 0:
				System.out.println("Adeus!");
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		}

		// JOptionPane.showMessageDialog(null, c1.exibirInfo());
		// JOptionPane.showMessageDialog(null, c2.exibirInfo());
		// JOptionPane.showMessageDialog(null, c3.exibirInfo());
		
	}
}
