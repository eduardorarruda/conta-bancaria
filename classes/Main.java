package EX1N2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContaBancaria C1 = new ContaBancaria();

		Scanner scan = new Scanner(System.in);

		int flag = 0, op = 0;
		
		while (flag == 0) {
			System.out.println("1- Criar conta");
			System.out.println("2- Abrir conta ");
			System.out.println("3- Depositar");
			System.out.println("4- Retirada");
			System.out.println("5- Pagar mensalidade");
			System.out.println("6- Fechar conta");
			System.out.println("7- Mostrar conta");
			System.out.println("8- Encerrar sistema");
			System.out.println("Digite o número da opção desejada:");
			op = scan.nextInt();
			
			if (op == 1) {
				C1.criarConta();
			} else if (op == 2) {
				int op1 = 0;
				
				System.out.println("Caso sua conta for corrente, deve começar com saldo acima de R$50,00");
				System.out.println("Caso sua conta for poupança, deve começar com saldo acima de R$150,00");
				System.out.println();
				System.out.println("Para voltar ao menu digite 1");
				System.out.println("Caso já tenha depositado, digite 2");
				op1 = scan.nextInt();
				
				if (op1 == 2) {
					C1.abrirConta(C1.getTipo());
				}
			} else if (op == 3) {
				C1.depositar();
				System.out.println("Saldo da conta:" + C1.getSaldo());
			} else if (op == 4) {
				C1.sacar(C1.getSaldo());
				System.out.println(C1.getSaldo());
			} else if (op == 5) {
				C1.pagarMensalidade(C1.getSaldo());
				System.out.println(C1.getSaldo());
			} else if (op == 6) {
				C1.fecharConta();
			} else if (op == 7) {
				C1.mostrarConta();
			} else {
				flag = 1;
			}
		}
	}
	
}
