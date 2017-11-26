package exercicio05;

import javax.swing.JOptionPane;

public class Computador {
	//Atributos
	private String marca;	
	private String cor;
	private String modelo;
	private String numeroSerie;
	private double preco;
	
	//Constructor
	public Computador(String marca, String cor, String modelo, String numeroSerie, double preco) {
		
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.preco = preco;	
		
	}
	
	//metodo imprimir
	public void imprimir() {
		
		JOptionPane.showMessageDialog(null, "Marca: " + marca + "\nCor: " + cor + "\nModelo: " 
		+ modelo + "\nNumero de série: "+ numeroSerie + "\nPreço: " + preco);
		
	}
	
	//metodo calcularValor
	public void calcularValor() {
		
		switch (marca) {
		
			case "HP":
				preco += preco * 0.3;
				break;
			
			case "IBM":
				preco += preco * 0.5;
				break;
				
			default:				
		
		}
		
	}	
	
	//metodo alterarValor
	public int alterarValor(double preco) {
		int retorno = 0;
		
		if (!(preco == 0)) {
			
			this.preco = preco;
			retorno = 1;
			
		}
		
		return retorno;
	}
	
	
	
	//getters and setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
