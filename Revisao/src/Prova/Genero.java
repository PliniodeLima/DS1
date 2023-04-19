package Prova;

public enum Genero {

	MASCULINO ('M', "Masculino"),
	FEMININO ('F', "Feminino");
	
	protected char sigla;
	protected String texto;
	
	private Genero(char sigla, String texto) {
		this.sigla = sigla;
		this.texto = texto;
	}

	public char getSigla() {
		return sigla;
	}

	public String getTexto() {
		return texto;
	}
	

}