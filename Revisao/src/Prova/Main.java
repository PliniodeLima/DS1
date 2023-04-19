package Prova;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Motoboy moto1 = new Motoboy("Plínio", "06565227551", "1496161556", Genero.MASCULINO, 2000, LocalDate.of(1997, 06, 06), "PLA5G95");
		//Diretor diretor = new Diretor("Lays", "46480480597", "276683471", Genero.FEMININO, 3000, LocalDate.of(2000, 05, 05));
		Gerente gerente = new Gerente("Marina", "0652275517", "149514545", Genero.FEMININO, 2500, LocalDate.of(1997, 06, 06));
		
		//System.out.println(moto1);
		//System.out.println(diretor);
		System.out.println(gerente);
	}
}
