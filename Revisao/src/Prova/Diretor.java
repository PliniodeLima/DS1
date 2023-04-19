package Prova;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
	
	private final double PARTICIPACAO_LUCRO = 0.1;

	
	
	public Diretor(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao, Bonificacao.DIRETOR);
		// TODO Auto-generated constructor stub
	}

	public double getPARTICIPACAO_LUCRO() {
		return PARTICIPACAO_LUCRO;
	}
	
	@Override
	public double getSalarioFinal(double salarioBase) {
		
		double salarioFinal = salarioBase +((salarioBase * Bonificacao.DIRETOR.valor) + (salarioBase * PARTICIPACAO_LUCRO));
		
		return salarioFinal;
	}

	
	@Override
	public String toString() {
		
		return "DIRETOR\n" +
			"\nNome: " + super.nome +
			"\nCpf: " + super.cpf + 
			"\nRG: " + super.rg + 
			"\nGenêro: " + super.genero.texto + 
			"\nSalário Base: " + Util.formatarBrl(salarioBase) +
			"\nData de Admissão: " + Util.formatarData(dataAdmissao) + 
			"\nSalário Final: " + Util.formatarBrl(getSalarioFinal(salarioBase));
	}
}
