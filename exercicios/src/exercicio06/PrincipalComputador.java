package exercicio06;

import javax.swing.JOptionPane;

import exercicio05.Computador;

public class PrincipalComputador {
	
	public static void main(String[] args) {
		
		String marca = JOptionPane.showInputDialog("Qual é a marca do computador?");
		String cor = JOptionPane.showInputDialog("Qual é a cor do computador?");
		String modelo = JOptionPane.showInputDialog("Qual é o modelo do computador?");
		String numeroSerie = JOptionPane.showInputDialog("Qual é o número de série do computador?");
		String preco = JOptionPane.showInputDialog("Qual é o preço do computador?");
		
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
			
			JOptionPane.showMessageDialog(null, "Não alterado", "Não alterado", JOptionPane.ERROR_MESSAGE);
			
		}
		
		computador.imprimir();
		
	}

}
