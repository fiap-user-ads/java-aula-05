package br.com.fiap.beans;

public class Telefone {
	// VARIÁVEIS
	// visibilidade - tipo - nome
	private String fixo;
	private String celular;
	private String comercial;
	
	// SET
	public void setFixo(String fixo) {
		this.fixo = fixo;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public void setComercial(String comercial) {
		this.comercial = comercial;
	}
	
	// GET
	public String getFixo() {
		return fixo;
	}
	public String getCelular() {
		return celular;
	}
	public String getComercial() {
		return comercial;
	}
}
