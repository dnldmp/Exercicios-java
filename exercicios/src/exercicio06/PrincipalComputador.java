package exercicio06;

import javax.swing.JOptionPane;

import exercicio05.Computador;

public class PrincipalComputador {
	
	public static void main(String[] args) {
		
		String marca = JOptionPane.showInputDialog("Qual � a marca do computador?");
		String cor = JOptionPane.showInputDialog("Qual � a cor do computador?");
		String modelo = JOptionPane.showInputDialog("Qual � o modelo do computador?");
		String numeroSerie = JOptionPane.showInputDialog("Qual � o n�mero de s�rie do computador?");
		String preco = JOptionPane.showInputDialog("Qual � o pre�o do computador?");
		
		double precoDouble = Double.parseDouble(preco);
		
		Computador computador = new Computador(marca, cor, modelo, numeroSerie, precoDouble);
		
		computador.imprimir();
		computador.calcularValor();
		computador.imprimir();
		preco = JOptionPane.showInputDialog("Digite um novo valor para o computador?");
		if (preco.isEmpty()) {
			
			precoDouble = 0;
			
		}else {
			
		precoDouble = Double.parseDouble(preco);
		
		}
		
		int verifica = computador.alterarValor(precoDouble);
		
		if (verifica == 1) {
			
			JOptionPane.showMessageDialog(null, "Alterado");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "N�o alterado", "N�o alterado", JOptionPane.ERROR_MESSAGE);
			
		}
		
		computador.imprimir();
		
	}

}
