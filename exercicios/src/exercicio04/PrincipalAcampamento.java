package exercicio04;

import javax.swing.JOptionPane;
import exercicio03.Acampamento;

public class PrincipalAcampamento {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		String idade = JOptionPane.showInputDialog("Qual é a sua idade?");
		
		int idadeInt = Integer.parseInt(idade);
		
		Acampamento acampamento = new Acampamento(nome, idadeInt);
		
		acampamento.imprimir();
		acampamento.separarGrupo();
		acampamento.imprimir();
		
	}
}
