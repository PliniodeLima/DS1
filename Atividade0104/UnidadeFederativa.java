package Atividade0104;
public enum UnidadeFederativa {
    ACRE("AC","Acre"),
    ALAGOAS("AL","Alagoas"),
    AMAPA("AP","Amap�"),
    AMAZONAS("AM","Amazonas"),
    BAHIA("BA","Bahia"),
    CEARA("CE","Cear�"),
    ESPIRITO_SANTO("ES","Esp�rito Santo"),
    GOIAS("GO","Goi�s"),
    MARANHAO("MA","Maranh�o"),
    MATO_GROSSO("MT","Mato Grosso"),
    MATO_GROSSO_DO_SUL("MS","Mato Grosso do Sul"),
    MINAS_GERAIS("MG","Minas Gerais"),
    PARA("PA","Par�"),
    PARAIBA("PB","Para�ba"),
    PARANA("PR","Paran�"),
    PERNAMBUCO("PE","Pernambuco"),
    PIAUI("PI","Piau�"),
    RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
    RIO_GRANDE_DO_NORTE("RN","Rio Grande do Norte"),
    RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul"),
    RONDONIA("RO","Rond�nia"),
    RORAIMA("RR","Roraima"),
    SANTA_CATARINA("SC","Santa Catarina"),
    SAO_PAULO("SP","S�o Paulo"),
    SERGIPE("SE","Sergipe"),
    TOCANTINS("TO","Tocantins");

	protected String sigla;
	protected String estado;

	/* Constructor */

	UnidadeFederativa(String sigla, String estado) {
		this.sigla = sigla;
		this.estado = estado;
	}

	/* Getter and Setter */
	public String getSigla() {
		return sigla;
	}

	public String getEstado() {
		return estado;
	}
}