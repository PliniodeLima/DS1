package Atividade0104;

import java.time.LocalDate;

public class Advogado extends Funcionario {
	private String oab;

	/* CONSTRUCTORS */

	

	
	/* GETTER AND SETTER */



	public String getoab() {
		return oab;
	}

	public Advogado(int id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor,
			double salario, String oab) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor,
				salario);
		this.oab = oab;
	}

	public void setoab(String oab) {
		this.oab = oab;
	}

	@Override
	public String toString() {
		return "Advogado\n" + "\nNome: " + super.nome + "\nData nascimento: " + super.dataNascimento + "\nIdade: " + super.getIdade() + "\nID: "
				+ super.id + "\nMatricula: " + super.matricula + "\nCPF" + super.cpf + "\nRG: " + super.rg + "\nOAB: "
				+ this.oab + "\nGenero: " + super.genero.texto + "\nSetor: " + super.setor.nomeSetor + "\nSalario: "
				+ super.getSalario() + "\n\nENDERECO\n" + endereco.toString();

	}
}