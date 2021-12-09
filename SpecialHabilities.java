public class SpecialHabilities {
	//Nome da habilidade especial 
	String name; 
	//O quanto de vida essa habilidade pode tirar
	int damage;
	//O gasto de energia da Habilidade especial 
	int energy_Spend; 
	//Esse array vai guardar os personagens que não sofrem nada com essa habilidade especial
	Character[] characterOf0Damage;
	
	//Construtor 
	public SpecialHabilities(String name, int damage, int energy_spend, Character[] characterOf0Damage ) {
		this.name = name; 
		this.damage = damage; 
		this.energy_Spend = energy_spend; 
		this.characterOf0Damage = characterOf0Damage; 
	}
	public SpecialHabilities(String name, int damage, int energy_spend) {
		this.name = name; 
		this.damage = damage; 
		this.energy_Spend = energy_spend; 
	}
	public	int setDamage() {
		return this.damage; 
	}
}
