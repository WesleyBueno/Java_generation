package polimorfismo;

public class Exercicio_polimorfismo {

	public static void main(String[] args) {
		
		Cachorro Adamastor = new Cachorro("Adamastor",5);
		Cavalo   Spirit    = new Cavalo("Spirit", 8);
		Pregui�a Mimosa    = new Pregui�a("Mimosa", 7);
		
		Adamastor.Som();
		Spirit.Som();
		Mimosa.Som();
	}

}
