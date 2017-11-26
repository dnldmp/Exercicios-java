package exercicio02;

import javax.swing.JOptionPane;

import exercicio01.Apolice;

public class PrincipalApolice {
	
	public static void main(String[] args) {
		
		String nomeSegurado = JOptionPane.showInputDialog("Qual é o nome segurado?");
		String idade = JOptionPane.showInputDialog("Qual é a idade?");
		String valorPremio = JOptionPane.showInputDialog("Qual é o valor do premio?");
		String cidade = JOptionPane.showInputDialog("Qual é a cidade?");
		
		int idadeInt = Integer.parseInt(idade);
		double valorPremioDouble = Double.parseDouble(valorPremio);
		
		Apolice apolice = new Apolice(nomeSegurado, idadeInt, valorPremioDouble);
		
		apolice.imprimir();
		apolice.calcularPremioApolice();
		apolice.imprimir();
		apolice.oferecerDesconto(cidade);
		apolice.imprimir();
		
	}
}
