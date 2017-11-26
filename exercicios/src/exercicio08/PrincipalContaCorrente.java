package exercicio08;

import javax.swing.JOptionPane;

import exercicio07.ContaCorrente;

public class PrincipalContaCorrente {

	private static String conta;
	private static String agencia;
	private static String nomeCliente;

	public static void main(String[] args) {

		execCadastrar();
		ContaCorrente contaCorrente = new ContaCorrente(conta, agencia, nomeCliente);
		contaCorrente.imprimir();

		int i = 0;
		do {

			Object[] options = { "Depósito", "Saque", "Consulta" };
			int resultado = JOptionPane.showOptionDialog(null, "Qual das opções abaixo deseja realizar?",
					"Escolha uma das alternativas", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null,
					options, options[0]);

			switch (resultado) {
			
				case 0:
					execDeposito();
					break;
				
				case 1:
					execSaque();
					break;
					
				case 2:
					execConsulta();
					break;		

			}
			
			Object[] options1 = { "Continuar", "Parar"};
			i = JOptionPane.showOptionDialog(null, "Deseja continuar ou parar a execução?",
					"Escolha uma das alternativas", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options1, options1[0]);			

		} while (i == 0);

	}

	// metodo execSaque
	public static void execSaque() {

		String valorSaque = JOptionPane.showInputDialog("digite o valor para saque");

		double valorSaqueDouble = Double.parseDouble(valorSaque);
		
		ContaCorrente contaCorrente = new ContaCorrente(conta, agencia, nomeCliente);
		contaCorrente.sacar(valorSaqueDouble);

	}

	// metodo execDeposito
	public static void execDeposito() {

		String valorDeposito = JOptionPane.showInputDialog("digite o valor para depósito");

		double valorDepositoDouble = Double.parseDouble(valorDeposito);

		ContaCorrente contaCorrente = new ContaCorrente(conta, agencia, nomeCliente);
		contaCorrente.depositar(valorDepositoDouble);

	}

	// metodo execConsulta
	public static void execConsulta() {

		ContaCorrente contaCorrente = new ContaCorrente(conta, agencia, nomeCliente);
		contaCorrente.imprimir();
		
	}

	// metodo execCadastro
	public static void execCadastrar() {

		conta = JOptionPane.showInputDialog("Conta do cliente?");
		agencia = JOptionPane.showInputDialog("Agencia do cliente?");
		nomeCliente = JOptionPane.showInputDialog("Nome do cliente?");

	}

}
