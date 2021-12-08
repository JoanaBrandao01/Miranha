

public class CapituloBattle extends Capitulo {
	private Character personagem1; 
	private Character personagem2;
	private String[] textos; 
	
	public CapituloBattle(Character personagem1, Character personagem2, String[] textos) { 
		super(textos);
		this.personagem1 = personagem1; 
		this.personagem2 = personagem2; 
		this.textos = textos; 
	}
	
	public void startBattle(int tipo) throws InterruptedException {
		Fight luta1 = new Fight();
		luta1.start(this.personagem1, this.personagem2, tipo);
		
	}
	
	
}


