
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
		System.out.printf("===========Status==============\n");
		System.out.printf("Nome: %s\n", this.name);
		System.out.printf("HP     => %d\n", this.hp);
		System.out.printf("Energy => %d\n", this.energy);
		System.out.printf("===============================\n\n");		
	}
	public void displayHabilidades() {
		System.out.println("-------------------------------");
		for(int i = 0; i < this.specialHabilities.length; i++) { 
			System.out.printf("[%s], Dano: %d, Gasto Energia: -%d\n"
					+ "", 
					this.specialHabilities[i].name, this.specialHabilities[i].damage, this.specialHabilities[i].energy_Spend);
		}
		System.out.println("-------------------------------");
		System.out.println("Escolha qual habilidade irá usar: ");
	}
	//Ataca algum personagem 
	public void attack(SpecialHabilities specialHabilitily, Character victim, int defenseVictim) { 
		//A variávei damage vai armazenar a quantidade de vida que vai retirar vitima
		int dano; 
		//Verificando se o ataque do personagem causa dano na vitima
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
			System.out.printf("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
			System.out.printf("%s foi fatalmente derrotado, infelizmente nem sua coragem ficou rsrs!\n", victim.name);
			System.out.printf("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
		}
		this.energy = this.energy - specialHabilitily.energy_Spend;
	}
	
	public void dodge() {
		
	}
		//Retorna a força do personagem 
		public int getStrength() {
			return this.strength;
		}
		
		//Retorna a vida do personagem 
		public int getHP() {
			return this.hp;
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


