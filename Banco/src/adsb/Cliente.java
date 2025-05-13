package adsb;

public class Cliente {
	private String nome;
	private String idade;
	
	public Cliente(String nome, String idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public String toString() {
		return nome + "(" + idade + ")";
	}
	
	}
