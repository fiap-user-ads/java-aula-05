package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCp {
	public static void main(String[] args) {
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		// entrada
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cliente")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Cliente")));
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
		objEndereco.setNumeroEndereco(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do endereco")));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
		objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o municipio"));
		
		objTelefone.setFixo("(62) 3289-6613");
		objTelefone.setCelular("(62) 99815-1551");
		objTelefone.setComercial("(62) 99815-1551");
		
		// saída
		System.out.println("Nome do Cliente: " + objCliente.getNome() + 
		"\nIdade do Cliente: " + objCliente.getIdade() +
		"\nPeso do Cliente: " + objCliente.getPeso() + "kg" +
		"\n=====" +
		"\nEndereço: " + objCliente.getEndereco().getLogradouro() +
		"\nNumero: " + objCliente.getEndereco().getNumeroEndereco() +
		"\nBairro: " + objCliente.getEndereco().getBairro() +
		"\nMunicipio: " + objCliente.getEndereco().getMunicipio() +
		"\n=====" +
		"\nN. telefone fixo: " + objCliente.getTelefone().getFixo() +
		"\nN. telefone celular: " + objCliente.getTelefone().getCelular() +
		"\nN. telefone comercial: " + objCliente.getTelefone().getComercial());
		
	}
}
