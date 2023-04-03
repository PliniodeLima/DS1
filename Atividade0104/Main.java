package Atividade0104;


public class Main {
	public static void main(String[] args) {

		Advogado Adv1 = new Advogado(23, "Plínio", "71992491040", "plinio212@gmail.com", new Endereco("40415115", "Rua Jorge Góes", "57", "Casa", "Salvador", UnidadeFederativa.BAHIA), Genero.MASCULINO, EstadoCivil.SOLTEIRO, "06/06/1997", "1496161155", "06565227551"	, "05048747", 8000, "48436121");
		
		Cliente Cliente1 = new Cliente(28, "Plínio", "71992491040", "plinio212@gmail.com", new Endereco("40415115", "Rua 15", "57", "casa", "Salvador", UnidadeFederativa.BAHIA), Genero.MASCULINO, EstadoCivil.SOLTEIRO, "06/06/1997", 5454);
		/*----------------------------------------------------------------------------------------------*/

		System.out.println(Adv1.toString()); // ADVOGADO
		System.out.println(Cliente1.toString()); // CLIENTE

	}
}