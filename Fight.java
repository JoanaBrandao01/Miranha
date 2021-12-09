import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Fight {
	public static void clear() {
		for (int i = 0; i < 100; i++ ) { 
			System.out.println("\n");
		}
	}
	
	public void start(Character personagem1, Character personagem2, int tipo) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		//Variavel para que a habilidade digitada ้ valida!
		boolean habilityFound = false; 
		//A luta vai rolar at้ um dos personagens morrer
		int hpPersonagem2 = personagem2.getHP();
		while (true) {
			//Exibe informa็๕es do personagem
			if (tipo == 1) {
				if (personagem1.getHP() > 0 && personagem2.getHP() > 0) {
					System.out.println("");
				} else { 
					break; 
				}
			} else if (tipo == 0) { 
				if (personagem2.getHP() >= hpPersonagem2/2) {
					System.out.println("");
				} else {
					System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
					System.out.printf("  Ap๓s uma luta muito violenta e cheia de destrui็ใo, o %s conseguiu fugir\n", personagem2.getName());
					System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
					break;
				}
			}
			personagem1.displayStatus();
			personagem2.displayStatus();
			Random random = new Random();
			
			for(int g = 0; g < 2; g++) {
				int number = random.nextInt(1);
				habilityFound = false; 
				//Garantindo que a habilidade digitada vai ser correta
				while ((habilityFound != true) && (personagem2.getHP() > 0)) {
					personagem1.displayHabilidades(number);
					String attack = input.nextLine().toLowerCase();
					
					
					//Ataque do homem aranha
					if (attack.contentEquals("esquivar")) {
						System.out.println("=====================================================================================");
						System.out.println("                     Ops! Ataque esquivado com sucesso!");
						System.out.println("=====================================================================================");
					} else { 
						//Procura habilidade digitada no array com as habilidades especiais
						for(int i = 0; i < personagem1.special().length; i++) {
							//Vai identificar qual foi a habilidade escolhida pelo personagem
							if (attack.contentEquals(personagem1.special()[i].name.toLowerCase())) {
								int danoPrincipal = personagem1.attack(personagem1.special()[i], personagem2, personagem2.setDefense());
								System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
								System.out.printf("               %s utilizou o(a) %s, e causou %d de dano\n", 
										personagem1.getName(), personagem1.special()[i].name, danoPrincipal );
								System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
								personagem2.displayStatus();
								habilityFound = true;
								TimeUnit.SECONDS.sleep(5);
							} 
						}
						if (habilityFound == false) { 
							System.out.println("Habilidade Invalida!! Digite novamente ");
							TimeUnit.SECONDS.sleep(3);
							clear();
						}
					}
				}
			}
			//Ataque da mแquina, garantindo que o personagem vai estแ vivo para atacar
			if(personagem2.getHP() > 0) {
				int number2 = random.nextInt(personagem2.special().length);
				int danoInimigo = personagem2.attack(personagem2.special()[number2], personagem1, personagem1.setDefense());
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.printf("               %s utilizou o(a) %s, e causou %d de dano\n", 
						personagem2.getName(), personagem2.special()[number2].name, danoInimigo );
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				personagem1.displayStatus();
				TimeUnit.SECONDS.sleep(7);
				clear();
			}
			//Exibindo a morte trแgica de um dos personagens
			if (personagem1.getName().contentEquals("Homem Aranha") && personagem1.getHP() == 0) {
				System.out.println("\n\n\n\n\n\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n");
				System.out.println("                                GAME OVER                                                        \n");
				System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n");
				break;
			} else if (personagem2.getName().contentEquals("Lutador") && (personagem2.getHP() == 0)){
				System.out.printf ("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
				System.out.printf("%s foi fatalmente derrotado, infelizmente nem sua coragem ficou rsrs!\n", personagem2.getName());
				System.out.printf("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
				TimeUnit.SECONDS.sleep(10);
			} else if (personagem2.getHP() == 0){ 
				System.out.printf("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
				System.out.printf("%s foi fatalmente derrotado, infelizmente nใo sobreviveu ao incrํvel Spider Man\n", personagem2.getName());
				System.out.printf("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
				TimeUnit.SECONDS.sleep(10);
			} 
		}
	}
	
}
