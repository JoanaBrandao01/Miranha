import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import java.util.Random;


public class Spidey {
	
	public static void countDown() throws InterruptedException {
		for(int i = 3; i > 0; i--) {
			System.out.print(i + "...");
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println("\n");
	}

	
	//Método que imita o pensamento do personagem
	public static void think() throws InterruptedException{ 
		for(int i = 0; i < 3; i++) { 
			System.out.println(".");
			Thread.sleep(500);
		}
		System.out.println("");
	}

	public static void main(String[] args) {   
		
		//Criando os personagens e definindo seus atributos 
    	Character spiderMan = new Character("Homem Aranha",100,250,35,15,25)    ;
    	Character greenGoblin = new Character("Duende Verde", 100,200,30,15,30);
    	Character lizard = new Character("Largato",150,300,50,30,15);
    	Character fighter = new Character("Lutador", 50, 30, 10, 5, 5);
    	
    	//Definindo as habilidades especiais de cada personagem 
    	
    	//Homem Aranha
    	spiderMan.configuration_Specials(new SpecialHabilities[] {
    			new SpecialHabilities("Teia", 25, 40),
    			new SpecialHabilities("Soco", 40, 35),
    			new SpecialHabilities("Chute",50, 45)
    	});
    	//Duende Verde 
    	greenGoblin.configuration_Specials(new SpecialHabilities[] {
    			new SpecialHabilities("Bomba Abobora", 80, 100),
    			new SpecialHabilities("Granada de gás", 30, 40),
    			new SpecialHabilities("Abobora Laminada", 50, 60)
    	});
    	//Lutador
    	fighter.configuration_Specials(new SpecialHabilities[] {
    			new SpecialHabilities("Soco",10,10,new Character[] {lizard, spiderMan, greenGoblin }),
    			new SpecialHabilities("Chute", 10,10, new Character[] {lizard, spiderMan, greenGoblin }),
    	});
    	//Lagarto 
    	lizard.configuration_Specials(new SpecialHabilities[] {
    			new SpecialHabilities("Soco", 80, 70), 
    			new SpecialHabilities("Rabada", 50, 40),
    			new SpecialHabilities("Arranhão", 70, 50)
    	});
    	
   	 	//Criando meu objeto scanner
    	Scanner input = new Scanner(System.in);
    	
    	
    	try {  //Todo o código deve ser escrito dentro dessas chaves para poder utilizar a função de tempo "TimeUnit.SECONDS.sleep(TEMPO EM SEGUNDOS AQUI);"
    		
    		//Inicio da história 
    		System.out.println("	Você é um garoto do Queens da cidade de Nova Iorque que nasceu no início ");
    		System.out.println("da década de 90 e perdeu seus pais ainda criança, mas, hoje vive com sua tia ");
    		System.out.println("e seu tio. Seus pais eram cientistas, porém, morreram em um acidente. Você é ");
    		System.out.println("um jovem brilhante, faz de tudo para ir bem na escola e ajudar seus tios. ");
    		System.out.println("Alguns te conhecerão pelos nomes: |amigão da vizinhança| ou |cabeça de teia|");
    		System.out.println("mas todos saberão que sempre poderão contar com o homem aranha. \n");
    		
    		System.out.println("	Você é estudante da Midtown High School e, apesar de não tem muitos ");
    		System.out.println("amigos, está sempre com Ned Leeds e as vezes com Harry Osborn. Todos ");
    		System.out.println("estão se preparando para o passeio escolar para um laboratório. \n");
    		
    		//Garantindo que o usuário vai dar uma entrada valida para minha primeira escolha 
    		boolean firstStop = false; 
    		while (firstStop == false) {
    			
    			//1º Parte 
    			System.out.println("	Após chegar no museu você vê a garota dos seus sonhos. Vocês conversam  ");
        		System.out.println("rápido, riem um pouco e logo após, ela pede para você fotografa-la. ");
        		System.out.println("  [o que você faz?]\n");
        		think();
        		
	    		System.out.println("[foto] => (Tira a foto para ela)");
	    		System.out.println("[apressado] => (Fala que está apressado, e não tirar a foto\n");
	    		System.out.print("Escolha: ");
	    		String choose = new String(input.nextLine()).toLowerCase();
	    		System.out.print("\n");
	    
	    		//1º ramificação da 1º parte
	    		if ("foto".contentEquals(choose)) {
	    			firstStop = true; 
	    			System.out.println("	 Você(Peter) tirar a foto, porém uma aranha radioativa desce por sua teia e ");
	        		System.out.println("pousa em seu pulso direito, além disso ela pica você e introduz uma toxina que ");
	        		System.out.println("fundirá seus DNAs. Após todo esse evento, você se sente enjoado e após o ");
	        		System.out.println("passeio, volta para casa. Sua noite é horrível, você tem febre e dores no corpo, ");
	        		System.out.println("porém o amanhã será outro dia e você acordará diferente... \n");
	        		
	        		System.out.println(" No dia seguinte...\n");
	        		
	        		System.out.println("	Em outra parte da cidade, o pai do seu melhor amigo (o MR. Osborn) está ");
	        		System.out.println("passando por experimentos genéticos. Esse experimento o dará força e ");
	        		System.out.println("habilidades de luta. \n");
	        		
	        		System.out.println("	O circo está feito. Você consegue entrar em uma luta livre para ganhar ");
	        		System.out.println("dinheiro para poder comprar um carro. Seu sonho é finalmente poder levar a ");
	        		System.out.println("MJ para sair.");
	        		System.out.println("A luta começa e você vai lutar contra o campeão dentro da gaiola. ");
	        		
	        		//Batalha 1
	        		System.out.println("=====================================BATALHA Nº1=====================================");
	        		System.out.println("O homem aranha entra na arena com seus braços finos, porém cheio de segredos por dentro,");
	        		System.out.println("enquanto o outro campeão, acho que não tem nada de interessante, além da coragem! rsrs");
	        		System.out.print("Irá começar em: "); 
	        		countDown();
	        		System.out.println("=====================================================================================");
	       
	        		//A luta só acaba quando um dos personagens morrer
	        		while (spiderMan.getHP() > 0 && fighter.getHP() > 0) {
	        			//Exibe informações do personagem
	        			spiderMan.displayStatus();
	        			fighter.displayStatus();
	        			
	        			//1º ataque 
	        			spiderMan.displayHabilidades();
	        			String attack = input.nextLine();
	        			
	        			//Ataque do homem aranha
	        			for(int i = 0; i < spiderMan.special().length; i++) {
	        				//Vai identificar qual foi a habilidade escolhida pelo personagem
	        				if (attack.contentEquals(spiderMan.special()[i].name)) {
	        					//Aqui vai ser usada a habilidade
	        					spiderMan.attack(spiderMan.special()[i], fighter, fighter.setDefense());
	        				} 
	        			}
	        			
	        			if (fighter.getHP() != 0) {
		        			System.out.println("O homem aranha pegou o lutador com as teias e meteu na parede");
		        			System.out.println("porém o lutador conseguiu segurar uma cadeira, e deu-lhe uma ");
		        			System.out.println("cadeirada na cabeça, deixando o homem Aranha tonto! ");
		        			think();
	        			}
	        		}
	        		
	        		System.out.println("Você consegue vencer a luta, porém o dinheiro não é o prometido, logo após ");
	        		System.out.println("isso você está saindo da arena de luta quando um ladrão passa por você e ");
	        		System.out.println("estava indo direto roubar o homem que te enganou. O enganador saiu ");
	        		System.out.println("correndo pedindo para parar o ladrão, o problema é que você o deixa sair.");
	        		
	        		System.out.println("No final você sabe o que acontece. Sim, foi culpa sua, e a que preço?");
	        		
	        		
        			
	        			        		
	        		
	        	//2º ramificação da 1º parte
	    		} else if ("apressado".contentEquals(choose)){ 
	    			//Garantindo uma escolha valida
	        		boolean secondStop = false;
	        		while (secondStop == false) {
	        			//2º parte 
	        			System.out.println("");
		    			System.out.println("	Peter não tira a foto e se distrai com uma sala mais isolada, que apresenta");
		        		System.out.println("barulhos estranhos então ele pensa um pouco, se irá ou não");
		        		think();
		        		
		        		System.out.println("[Sim]");
		        		System.out.println("[Não]");
		        		System.out.print("Escolha => ");
		        		choose = input.nextLine().toLowerCase();
		        		
		        		//1º ramificação da 2º parte
		        		if ("sim".contentEquals(choose)) { 
		        			System.out.println("	Então Peter decide ir até a sala. Ao abrir a porta, ele se depara com um ");
			        		System.out.println("compartimento de vidro cheio de aranhas, e em baixo vê as iniciais de seus ");
			        		System.out.println("pais escrita em uma placa metálica, quando ele toca a placa uma aranha pula ");
			        		System.out.println("nele e acaba o picando em sua nuca. Peter é pego, e é colocado para fora do ");
			        		System.out.println("laboratório onde foi e, após isso, decide ir para casa. \n");
			        		
			        		System.out.println("No dia seguinte..\n");
			        		
			        		System.out.println("	Peter acorda se sentido estranho, suas mãos grudam nos objetos, ele tem mais ");
			        		System.out.println("força e está com a visão boa. No mesmo dia, ao lembrar das iniciais dos pais, ");
			        		System.out.println("ele vasculha a casa para tentar encontrar algo relacionado aos seus pais. ");
			        		System.out.println("Então, acaba encontrando uma maleta com uma foto, onde é possível ver o pai ");
			        		System.out.println("dele e um doutor que não tem o antebraço direito. ainda mais, Peter acha uma ");
			        		System.out.println("pesquisa e decide estudar e tentar resolver o trabalho de seu falecido pai. \n");
			        		
			        		System.out.println("	Peter vai tentar contato com o amigo de seu pai para apresentar a pesquisa");
			        		System.out.println("com a formula final, então ele conhece pessoal mente o dr. Curt Connors, e se ");
			        		System.out.println("apresenta como um Parker. Após apresenta a pesquisa o Dr o convida para ");
			        		System.out.println("trabalhar e colocar em pratica.");
			        		
			        		System.out.println("	Pressionado o dr é obrigado a testar o soro da pesquisa em si próprio,");
			        		System.out.println("algo que vai fundir seu DNA com o de um lagarto. E de primeira o lagarto ataca");
			        		System.out.println("a cidade de NY, então o homem aranha vai intervir no ataque. O lagarto ");
			        		System.out.println("humanoide vai derrubando carros de uma ponte, porém em um desses carro ");
			        		System.out.println("tem uma criança, então peter terá que decidir");
			        		
			        		System.out.println("[Atacar] => (Vai atrás do largato)");
			        		System.out.println("[Salvar] => (Vai salvar a vida da criança)");
			        		choose = input.nextLine().toLowerCase();
			        		
			        		if ("Atacar".contentEquals(choose)){
			        			System.out.println("Você deixou o carro com a criança cair e foi atrás do largato, porém ");
			        			System.out.println("não conseguiu alcançar o largato, deixando-lhe fugir");
			        		} else if ("Salvar".contentEquals(choose)){ 
			        			System.out.println("Ele salva a criança, que estava no carro quase caindo da ponte, por ");
			        			System.out.println("e que por centímetros ainda estava nela. Porém deixa o largato fugir!!");
			        		} else { 
			        			System.out.println("");
			        		}
			        		
			        		System.out.println("Após isso Peter tenta entender o que está acontecendo e vai até o laboratório ");
			        		System.out.println("Oscorp, lá encontra o dr.  Connors  e  o  questiona sobre lagartos, rola uma ");
			        		System.out.println("Logo após essa conversa o dr decide atacar a escola de peter e então chega");
			        		System.out.println("a hora de se defender. Muita correria nos corredores de Midtown e o homem ");
			        		System.out.println("aranha esperando sua hora...");
			        		
			        		System.out.println("Você espera o corredor se esvaziar e coloca seu traje, já preparado para a ");
			        		System.out.println("batalha e mesmo assim e pego de surpresa pelo lagarto...");
			        		
			        		System.out.println("=====================================BATALHA Nº2=====================================");
			        		System.out.print("A batalha irá começar em ");
			        		countDown();
			        		System.out.println("=====================================================================================");
			        		
			        		//Batalha 2 
			        		while (spiderMan.getHP() > 0 && fighter.getHP() > 0) {
			        			spiderMan.displayStatus();
			        			lizard.displayStatus();
			        			
			        			Random random = new Random();
			        			int number = random.nextInt(1);
			        			spiderMan.displayHabilidades();
			        			if (number == 1) { 
			        				System.out.println("[Esquivar] => (Se esquiva do próximo ataque do adversário)");
			        			} 
			        			
			        			String attack = input.nextLine();
			        			
			        		}
			        			
			        		
			        		secondStop = true; 
			        	//2º ramificação da 2º parte
		        		} else if ("não".contentEquals(choose)) { 
		        			System.out.println("A história acaba aqui!!!! Rrsrs");
		        			System.out.println("Em um filme de terror, pense comigo, se alguém se depara com uma porta de um guardo  ");
		        			System.out.println("fechando, ela concerteza vai lar ver o que é. Eu sairia correndo, se fosse possivel até");
		        			System.out.println("dormiria na rua rsrs");
		        			
		        			System.out.println("Conclusão, você não dar pra ser ator de um filme de terror kkssksksks");
		        		}
	        		}
	        		
	        		firstStop = true;  
	        			
		        		
	        		
	        		
	    		} else { 
	    			JOptionPane.showMessageDialog
	    				(null, "Opção Invalida", "Invalid Answer",JOptionPane.ERROR_MESSAGE);; 
	    			
	    		}
    		}
    		
    		
    	} catch (Exception e) {
   		 // TODO Auto-generated catch block
   		 e.printStackTrace();
   	 	}
   	 
	}
    

}

