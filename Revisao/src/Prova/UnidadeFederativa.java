package Prova;

public enum UnidadeFederativa {

	ACRE("AC","Acre"),
    ALAGOAS("AL","Alagoas"),
    AMAPA("AP","Amapá"),
    AMAZONAS("AM","Amazonas"),
    BAHIA("BA","Bahia"),
    CEARA("CE","Ceará"),
    ESPIRITO_SANTO("ES","Espírito Santo"),
    GOIAS("GO","Goiás"),
    MARANHAO("MA","Maranhão"),
    MATO_GROSSO("MT","Mato Grosso"),
    MATO_GROSSO_DO_SUL("MS","Mato Grosso do Sul"),
    MINAS_GERAIS("MG","Minas Gerais"),
    PARA("PA","Pará"),
    PARAIBA("PB","Paraíba"),
    PARANA("PR","Paraná"),
    PERNAMBUCO("PE","Pernambuco"),
    PIAUI("PI","Piauí"),
    RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
    RIO_GRANDE_DO_NORTE("RN","Rio Grande do Norte"),
    RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul"),
    RONDONIA("RO","Rondônia"),
    RORAIMA("RR","Roraima"),
    SANTA_CATARINA("SC","Santa Catarina"),
    SAO_PAULO("SP","São Paulo"),
    SERGIPE("SE","Sergipe"),
    TOCANTINS("TO","Tocantins");
	
	protected String sigla;
	protected String texto;
	
	private UnidadeFederativa(String sigla, String texto) {
		this.sigla = sigla;
		this.texto = texto;
	}

	public String getSigla() {
		return sigla;
	}

	public String getTexto() {
		return texto;
	}
	

	
}