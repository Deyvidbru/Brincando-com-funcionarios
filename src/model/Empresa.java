package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome = "Fabrica Pascal";
	private int cnpj = 123456789;
	private List<Funcionario> funcionario = new ArrayList<>();

	public Empresa() {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public Empresa(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public void addFuncionario(Funcionario func) {
		this.funcionario.add(func);
	}

	public boolean funcionarioExistente(int id) {
		for (Funcionario funcionario : this.funcionario) {
			if (id == funcionario.getId()) {
				return true;
			}
		}
		return false;
	}

	public void idVerificado(double percentage, int id) {
		if(funcionarioExistente(id)) {
			for (Funcionario funcionario : this.funcionario) {
				if (id == funcionario.getId()) {
					double novoSalarioFuncionario = funcionario.getSalario()
							+ funcionario.getSalario() * (percentage / 100);
					funcionario.setSalario(novoSalarioFuncionario);
					break;
				}	
			}
		}
	}

}

