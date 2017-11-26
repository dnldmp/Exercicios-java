package exercicio01;

import javax.swing.JOptionPane;

public class Apolice {
	// Atributos
	private String nomeSegurado;
	private int idade;
	private double valorPremio;

	// Constructor
	public Apolice(String nomeSegurado, int idade, double valorPremio) {

		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;

	}

	// Metodo imprimir
	public void imprimir() {

		JOptionPane.showMessageDialog(null, "Nome Segurado: " + nomeSegurado + "\nIdade: " + idade + "\nValor Premio: " + valorPremio);

	}

	// Metodo calcularPremioApolice
	public void calcularPremioApolice() {

		if (idade > 18 && idade <= 25) {

			valorPremio += (valorPremio * 20) / 100;

		} else if (idade > 25 && idade <= 36) {

			valorPremio += (valorPremio * 15) / 100;

		} else if (idade > 36) {

			valorPremio += (valorPremio * 10) / 100;

		}
	}

	// metodo oferecerDesconto
	public void oferecerDesconto(String cidade) {

		switch (cidade) {

		case "Curitiba":
			valorPremio -= valorPremio * 0.2;
			break;

		case "Rio de Janeiro":
			valorPremio -= valorPremio * 0.15;
			break;

		case "São Paulo":
			valorPremio -= valorPremio * 0.1;
			break;

		case "Belo Horizonte":
			valorPremio -= valorPremio * 0.05;
			break;

		default:
			JOptionPane.showMessageDialog(null, "Cidade não encontrada nos nossos registros");

		}

	}

	// Getters and setters
	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}

	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public int getIdade() {
		return idade;
	}

	public double getValorPremio() {
		return valorPremio;
	}

}
