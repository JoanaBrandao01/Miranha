
public class Character {
	private String name; 
	private int hp; 
	private int energy;//0 a 300
	private int strength;//0 a 100 
	private int defense;//0 a 100 
	private int dexterity ;//0 a 100 
	private SpecialHabilities[] specialHabilities;  
	
	public Character(String name, int hp, int energy, int strength, int defense, int dexterity) { 
		this.name = name;
		this.hp = hp;
		this.energy = energy; 
		this.strength = strength; 
		this.defense = defense; 
		this.dexterity = dexterity;
	}
	
	//Método para definir as habilidades Especiais do personagem 
	public void configuration_Specials(SpecialHabilities[] specialHabilities) {
		this.specialHabilities = specialHabilities; 
	}

	//Retorna todas as habilidades especiais 
	public SpecialHabilities[] special() {
		return this.specialHabilities;
	}
	
	//Mostra status do personagem 
	public void displayStatus() {
		System.out.printf ("====================================Status===========================================\n");
		System.out.printf("       Nome: %s | HP => %d | Energy => %d\n", this.name, this.hp, this.energy);
		System.out.printf ("=====================================================================================\n\n");		
	}
	public void displayHabilidades(int number) {
		System.out.println("-------------------------------------------------------------------------------------");
		for(int i = 0; i < this.specialHabilities.length; i++) { 
			System.out.printf("      [%s], Dano: %d, Gasto Energia: -%d\n", 
					this.specialHabilities[i].name, this.specialHabilities[i].damage, this.specialHabilities[i].energy_Spend);
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Escolha qual habilidade irá usar: ");
	}
	//Ataca algum personagem 
	public int attack(SpecialHabilities specialHabilitily, Character victim, int defenseVictim) { 
		//A variávei damage vai armazenar a quantidade de vida que vai retirar vitima
		int dano; 
		//Verificando se o ataque do personagem causa dano na vitima de acordo com a defesa dela
		if (specialHabilitily.setDamage() > defenseVictim) {
			dano = (specialHabilitily.setDamage() - defenseVictim) * 2; 
		} else { 
			dano = 0;
		}
		//Verifica se o personagem pode receber todo o dano, evitando estrapolar a vida para um valor negativo 
		if (victim.getHP() >= dano) {
			victim.setHP(dano);
		//Vai zerar a vida da vitima 
		} else { 
			victim.setHP(victim.getHP());
		}
		
		this.energy = this.energy - specialHabilitily.energy_Spend;
		return dano; 
	}
	
	//Retorna o nome do personagem 
	public String getName() {
		return this.name;
	}
	//Retorna a força do personagem 
	public int getStrength() {
		return this.strength;
	}
		
	//Retorna a vida do personagem 
	public int getHP() {
		return this.hp;
	}
	//Regenera vida do personagem 
	public void regenarahp(int hp) {
		this.hp = hp; 
	}
		
	//Retorna defesa do personagem 
	public int setDefense() {
		return this.defense;
	}
		
	//modifica hp do personagem
	public void setHP(int damage) {
		this.hp = this.hp - damage; 
	}
		
}


