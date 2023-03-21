package br.com.fiap.beans;

public class Cliente {
	// VARIÁVEIS
	// visibilidade - tipo - nome
	private String nome;
	private int idade;
	private double peso;
	private Endereco endereco;
	private Telefone telefone;
	
	// SET
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	// GET
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
}
