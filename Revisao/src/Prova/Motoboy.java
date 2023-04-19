package Prova;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
	
	private String placaDaMoto;

	public Motoboy(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao,
			String placaDaMoto) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
		this.placaDaMoto = placaDaMoto;
	}

	public String getPlacaDaMoto() {
		return placaDaMoto;
	}

	public void setPlacaDaMoto(String placaDaMoto) {
		this.placaDaMoto = placaDaMoto;
	}
	
	public double getSalarioFinal(double salarioBase) {
		return salarioBase;
	}
	

	public String toString() {
		return "MOTOBOY: \n" +
				"\nPlaca da Moto: " + this.placaDaMoto +
				"\nNome: " + super.nome +
				"\nCPF: " + super.cpf + 
				"\nRG: " + super.rg +
				"\nGenêro: " + super.genero.texto +
				"\nSalário Base: " + Util.formatarBrl(salarioBase) + 
				"\nData de Admissão: " + Util.formatarData(dataAdmissao) +
				"\nSalario Final: " + Util.formatarBrl(getSalarioFinal(salarioBase))
				
				;
	}
}
