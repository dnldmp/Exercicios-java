package exercicio03;

import javax.swing.JOptionPane;

public class Acampamento {
	//Atributos
	private String nome;	
	private String equipe = "Sem equipe até o momento";
	private int idade;
	
	//Constructor
	public Acampamento(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	//Metodo imprimir
	public void imprimir() {
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nEquipe: " + equipe + "\nidade: " + idade);
		
	}	
	
	//Metodo separarGrupo
	public void separarGrupo() {
		
		if (idade >= 6 && idade <= 10) {

			equipe = "A";

		} else if (idade >= 11 && idade <= 20) {

			equipe = "B";

		} else if (idade > 21) {

			equipe = "C";

		}
		
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	
}
