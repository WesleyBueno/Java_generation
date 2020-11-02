package polimorfismo;

public class Pregui�a extends Animal {
	
	public Pregui�a(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	
	public void Som() {
		
		System.out.println("Snif snif");
	}
	
	public void correr() {
		
		System.out.println("Escalando");
	}
}
