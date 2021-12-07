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

	
	//M�todo que imita o pensamento do personagem
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
    			new SpecialHabilities("Granada de g�s", 30, 40),
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
    			new SpecialHabilities("Arranh�o", 70, 50)
    	});
    	
   	 	//Criando meu objeto scanner
    	Scanner input = new Scanner(System.in);
    	
    	
    	try {  //Todo o c�digo deve ser escrito dentro dessas chaves para poder utilizar a fun��o de tempo "TimeUnit.SECONDS.sleep(TEMPO EM SEGUNDOS AQUI);"
    		
    		//Inicio da hist�ria 
    		System.out.println("	Voc� � um garoto do Queens da cidade de Nova Iorque que nasceu no in�cio ");
    		System.out.println("da d�cada de 90 e perdeu seus pais ainda crian�a, mas, hoje vive com sua tia ");
    		System.out.println("e seu tio. Seus pais eram cientistas, por�m, morreram em um acidente. Voc� � ");
    		System.out.println("um jovem brilhante, faz de tudo para ir bem na escola e ajudar seus tios. ");
    		System.out.println("Alguns te conhecer�o pelos nomes: |amig�o da vizinhan�a| ou |cabe�a de teia|");
    		System.out.println("mas todos saber�o que sempre poder�o contar com o homem aranha. \n");
    		
    		System.out.println("	Voc� � estudante da Midtown High School e, apesar de n�o tem muitos ");
    		System.out.println("amigos, est� sempre com Ned Leeds e as vezes com Harry Osborn. Todos ");
    		System.out.println("est�o se preparando para o passeio escolar para um laborat�rio. \n");
    		
    		//Garantindo que o usu�rio vai dar uma entrada valida para minha primeira escolha 
    		boolean firstStop = false; 
    		while (firstStop == false) {
    			
    			//1� Parte 
    			System.out.println("	Ap�s chegar no museu voc� v� a garota dos seus sonhos. Voc�s conversam  ");
        		System.out.println("r�pido, riem um pouco e logo ap�s, ela pede para voc� fotografa-la. ");
        		System.out.println("  [o que voc� faz?]\n");
        		think();
        		
	    		System.out.println("[foto] => (Tira a foto para ela)");
	    		System.out.println("[apressado] => (Fala que est� apressado, e n�o tirar a foto\n");
	    		System.out.print("Escolha: ");
	    		String choose = new String(input.nextLine()).toLowerCase();
	    		System.out.print("\n");
	    
	    		//1� ramifica��o da 1� parte
	    		if ("foto".contentEquals(choose)) {
	    			firstStop = true; 
	    			System.out.println("	 Voc�(Peter) tirar a foto, por�m uma aranha radioativa desce por sua teia e ");
	        		System.out.println("pousa em seu pulso direito, al�m disso ela pica voc� e introduz uma toxina que ");
	        		System.out.println("fundir� seus DNAs. Ap�s todo esse evento, voc� se sente enjoado e ap�s o ");
	        		System.out.println("passeio, volta para casa. Sua noite � horr�vel, voc� tem febre e dores no corpo, ");
	        		System.out.println("por�m o amanh� ser� outro dia e voc� acordar� diferente... \n");
	        		
	        		System.out.println(" No dia seguinte...\n");
	        		
	        		System.out.println("	Em outra parte da cidade, o pai do seu melhor amigo (o MR. Osborn) est� ");
	        		System.out.println("passando por experimentos gen�ticos. Esse experimento o dar� for�a e ");
	        		System.out.println("habilidades de luta. \n");
	        		
	        		System.out.println("	O circo est� feito. Voc� consegue entrar em uma luta livre para ganhar ");
	        		System.out.println("dinheiro para poder comprar um carro. Seu sonho � finalmente poder levar a ");
	        		System.out.println("MJ para sair.");
	        		System.out.println("A luta come�a e voc� vai lutar contra o campe�o dentro da gaiola. ");
	        		
	        		//Batalha 1
	        		System.out.println("=====================================BATALHA N�1=====================================");
	        		System.out.println("O homem aranha entra na arena com seus bra�os finos, por�m cheio de segredos por dentro,");
	        		System.out.println("enquanto o outro campe�o, acho que n�o tem nada de interessante, al�m da coragem! rsrs");
	        		System.out.print("Ir� come�ar em: "); 
	        		countDown();
	        		System.out.println("=====================================================================================");
	       
	        		//A luta s� acaba quando um dos personagens morrer
	        		while (spiderMan.getHP() > 0 && fighter.getHP() > 0) {
	        			//Exibe informa��es do personagem
	        			spiderMan.displayStatus();
	        			fighter.displayStatus();
	        			
	        			//1� ataque 
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
		        			System.out.println("por�m o lutador conseguiu segurar uma cadeira, e deu-lhe uma ");
		        			System.out.println("cadeirada na cabe�a, deixando o homem Aranha tonto! ");
		        			think();
	        			}
	        		}
	        		
	        		System.out.println("Voc� consegue vencer a luta, por�m o dinheiro n�o � o prometido, logo ap�s ");
	        		System.out.println("isso voc� est� saindo da arena de luta quando um ladr�o passa por voc� e ");
	        		System.out.println("estava indo direto roubar o homem que te enganou. O enganador saiu ");
	        		System.out.println("correndo pedindo para parar o ladr�o, o problema � que voc� o deixa sair.");
	        		
	        		System.out.println("No final voc� sabe o que acontece. Sim, foi culpa sua, e a que pre�o?");
	        		
	        		
        			
	        			        		
	        		
	        	//2� ramifica��o da 1� parte
	    		} else if ("apressado".contentEquals(choose)){ 
	    			//Garantindo uma escolha valida
	        		boolean secondStop = false;
	        		while (secondStop == false) {
	        			//2� parte 
	        			System.out.println("");
		    			System.out.println("	Peter n�o tira a foto e se distrai com uma sala mais isolada, que apresenta");
		        		System.out.println("barulhos estranhos ent�o ele pensa um pouco, se ir� ou n�o");
		        		think();
		        		
		        		System.out.println("[Sim]");
		        		System.out.println("[N�o]");
		        		System.out.print("Escolha => ");
		        		choose = input.nextLine().toLowerCase();
		        		
		        		//1� ramifica��o da 2� parte
		        		if ("sim".contentEquals(choose)) { 
		        			System.out.println("	Ent�o Peter decide ir at� a sala. Ao abrir a porta, ele se depara com um ");
			        		System.out.println("compartimento de vidro cheio de aranhas, e em baixo v� as iniciais de seus ");
			        		System.out.println("pais escrita em uma placa met�lica, quando ele toca a placa uma aranha pula ");
			        		System.out.println("nele e acaba o picando em sua nuca. Peter � pego, e � colocado para fora do ");
			        		System.out.println("laborat�rio onde foi e, ap�s isso, decide ir para casa. \n");
			        		
			        		System.out.println("No dia seguinte..\n");
			        		
			        		System.out.println("	Peter acorda se sentido estranho, suas m�os grudam nos objetos, ele tem mais ");
			        		System.out.println("for�a e est� com a vis�o boa. No mesmo dia, ao lembrar das iniciais dos pais, ");
			        		System.out.println("ele vasculha a casa para tentar encontrar algo relacionado aos seus pais. ");
			        		System.out.println("Ent�o, acaba encontrando uma maleta com uma foto, onde � poss�vel ver o pai ");
			        		System.out.println("dele e um doutor que n�o tem o antebra�o direito. ainda mais, Peter acha uma ");
			        		System.out.println("pesquisa e decide estudar e tentar resolver o trabalho de seu falecido pai. \n");
			        		
			        		System.out.println("	Peter vai tentar contato com o amigo de seu pai para apresentar a pesquisa");
			        		System.out.println("com a formula final, ent�o ele conhece pessoal mente o dr. Curt Connors, e se ");
			        		System.out.println("apresenta como um Parker. Ap�s apresenta a pesquisa o Dr o convida para ");
			        		System.out.println("trabalhar e colocar em pratica.");
			        		
			        		System.out.println("	Pressionado o dr � obrigado a testar o soro da pesquisa em si pr�prio,");
			        		System.out.println("algo que vai fundir seu DNA com o de um lagarto. E de primeira o lagarto ataca");
			        		System.out.println("a cidade de NY, ent�o o homem aranha vai intervir no ataque. O lagarto ");
			        		System.out.println("humanoide vai derrubando carros de uma ponte, por�m em um desses carro ");
			        		System.out.println("tem uma crian�a, ent�o peter ter� que decidir");
			        		
			        		System.out.println("[Atacar] => (Vai atr�s do largato)");
			        		System.out.println("[Salvar] => (Vai salvar a vida da crian�a)");
			        		choose = input.nextLine().toLowerCase();
			        		
			        		if ("Atacar".contentEquals(choose)){
			        			System.out.println("Voc� deixou o carro com a crian�a cair e foi atr�s do largato, por�m ");
			        			System.out.println("n�o conseguiu alcan�ar o largato, deixando-lhe fugir");
			        		} else if ("Salvar".contentEquals(choose)){ 
			        			System.out.println("Ele salva a crian�a, que estava no carro quase caindo da ponte, por ");
			        			System.out.println("e que por cent�metros ainda estava nela. Por�m deixa o largato fugir!!");
			        		} else { 
			        			System.out.println("");
			        		}
			        		
			        		System.out.println("Ap�s isso Peter tenta entender o que est� acontecendo e vai at� o laborat�rio ");
			        		System.out.println("Oscorp, l� encontra o dr.  Connors  e  o  questiona sobre lagartos, rola uma ");
			        		System.out.println("Logo ap�s essa conversa o dr decide atacar a escola de peter e ent�o chega");
			        		System.out.println("a hora de se defender. Muita correria nos corredores de Midtown e o homem ");
			        		System.out.println("aranha esperando sua hora...");
			        		
			        		System.out.println("Voc� espera o corredor se esvaziar e coloca seu traje, j� preparado para a ");
			        		System.out.println("batalha e mesmo assim e pego de surpresa pelo lagarto...");
			        		
			        		System.out.println("=====================================BATALHA N�2=====================================");
			        		System.out.print("A batalha ir� come�ar em ");
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
			        				System.out.println("[Esquivar] => (Se esquiva do pr�ximo ataque do advers�rio)");
			        			} 
			        			
			        			String attack = input.nextLine();
			        			
			        		}
			        			
			        		
			        		secondStop = true; 
			        	//2� ramifica��o da 2� parte
		        		} else if ("n�o".contentEquals(choose)) { 
		        			System.out.println("A hist�ria acaba aqui!!!! Rrsrs");
		        			System.out.println("Em um filme de terror, pense comigo, se algu�m se depara com uma porta de um guardo  ");
		        			System.out.println("fechando, ela concerteza vai lar ver o que �. Eu sairia correndo, se fosse possivel at�");
		        			System.out.println("dormiria na rua rsrs");
		        			
		        			System.out.println("Conclus�o, voc� n�o dar pra ser ator de um filme de terror kkssksksks");
		        		}
	        		}
	        		
	        		firstStop = true;  
	        			
		        		
	        		
	        		
	    		} else { 
	    			JOptionPane.showMessageDialog
	    				(null, "Op��o Invalida", "Invalid Answer",JOptionPane.ERROR_MESSAGE);; 
	    			
	    		}
    		}
    		
    		
    	} catch (Exception e) {
   		 // TODO Auto-generated catch block
   		 e.printStackTrace();
   	 	}
   	 
	}
    

}

