package exercicio07;

import javax.swing.JOptionPane;

public class ContaCorrente {
	//Atributos
	private String conta;
	private String agencia;
	private double saldo;
	private String nomeCliente;	
	
	//Constructor
	public ContaCorrente(String conta, String agencia, String nomeCliente) {
		this.conta = conta;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
	}
	
	//metodo sacar
	public int sacar(double valorSaque) {
		int retorno = 0;
		
		if(valorSaque <= saldo) {
			retorno = 1;
			this.saldo -= valorSaque;
						
		}else {
			
			JOptionPane.showMessageDialog(null, "Valor maior que o saldo disponivel", "valor de saque inválido", JOptionPane.ERROR_MESSAGE);
			
		}	
		
		return retorno;
	}
		
	//metodo depositar
	public void depositar(double valorDeposito) {
		
		this.saldo += valorDeposito;
		
	}
	
	//metodo imprimir
	public void imprimir() {
		
		JOptionPane.showMessageDialog(null, "Conta: " + conta + "\nAgencia: " + agencia + "\nSaldo: " 
				+ saldo + "\nNome do cliente: " + nomeCliente);
		
	}
	
	//getters and setters
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	
	

}
