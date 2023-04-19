package Prova;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {

	public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao, Bonificacao.GERENTE);
	}
	
	@Override
	public double getSalarioFinal(double salarioBase) {
		double salarioFinal = salarioBase + (salarioBase * Bonificacao.GERENTE.valor);
		return salarioFinal;
	}

	@Override
	public String toString() {
		
		return "GERENTE\n" +
			"\nNome: " + super.nome +
			"\nCpf: " + super.cpf + 
			"\nRG: " + super.rg + 
			"\nGenêro: " + super.genero.texto + 
			"\nSalário Base: " + Util.formatarBrl(salarioBase) +
			"\nData de Admissão: " + Util.formatarData(dataAdmissao) + 
			"\nSalário Final: " + Util.formatarBrl(getSalarioFinal(salarioBase));
	}
}
