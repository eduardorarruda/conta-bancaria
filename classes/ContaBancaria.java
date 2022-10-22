package EX1N2;

import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {

	private double numeroConta;
	private String tipo;
	private String titular;
	private double saldo;
	private String status;

	Scanner scan = new Scanner(System.in);

	public void criarConta() {
		Random gerador = new Random();

		System.out.println("Tipo:");
		this.tipo = scan.next();
		System.out.println("Titular:");
		this.titular = scan.next();

		this.numeroConta = gerador.nextInt(100);
		System.out.println("O número da sua conta é: " + this.numeroConta);

		this.saldo = 0;
		this.status = "Fechada";

		System.out.println("Sua conta foi criada!!");
		System.out.println("Sua conta está com saldo zerado e status fechado");
		System.out.println("Para regularizar, abra a conta");
	}

	public void abrirConta(String Tipo) {
		if (this.tipo == "cc") {
			if (this.saldo >= 50) {
				System.out.println("Sua conta foi aberta");
				System.out.println("Saldo: " + this.saldo);
				this.status = "Aberto";
				System.out.println("Status: " + this.status);
			} else {
				System.out.println("Saldo da conta com valor menor que R$50,00");
			}
		} else if (this.tipo == "cp") {
			if (this.saldo >= 150) {
				System.out.println("Sua conta foi aberta");
				System.out.println("Saldo: " + this.saldo);
				this.status = "Aberto";
				System.out.println("Status: " + this.status);
			} else {
				System.out.println("Saldo da conta com valor menor que R$150,00");
			}
		}
	}

	public void fecharConta() {
		System.out.println("Só é possivel fechar conta se o saldo estiver zerado");
		if (this.saldo == 0) {
			this.numeroConta = 0;
			this.tipo = null;
			this.titular = null;
			this.saldo = 0;
			this.status = null;
			System.out.println("Conta fechada!!");
		} else {
			System.out.println("O seu saldo não está zerado");
			System.out.println("Faça uma retirada ");
		}
	}

	public double depositar() {
		double valor;
		System.out.println("Quantidade a ser depositada:");
		valor = scan.nextInt();
		System.out.println("Depositado com sucesso!");

		return this.saldo = saldo + valor;
	}

	public void sacar(double saldo) {
		double valor = 0;
		int flag = 0;

		while (flag == 0) {
			System.out.println("Quantidade a ser retirada:");
			valor = scan.nextInt();

			if (this.saldo >= valor) {
				this.saldo = saldo - valor;
				break;
			} else if (this.saldo < valor) {
				System.out.println("Valor de saque maior que saldo de conta");
				continue;
			}
		}
	}

	public void pagarMensalidade(double saldo) {
		System.out.println("Valor da mensalidade para conta corrente é de R$12,00");
		System.out.println("Valor da mensalidade para conta poupança é de R$20,00");

		if (this.tipo.equals("Corrente")) {
			this.saldo = saldo - 12;
			System.out.println("Mensalidade paga");
		} else if (this.tipo.equals("Poupança")) {
			this.saldo = saldo - 12;
			System.out.println("Mensalidade paga");
		}
	}

	public void mostrarConta() {
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: " + this.status);
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
