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
	
	public static void clear() { 
		for (int i = 0; i < 100; i++ ) { 
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {   
		
		//Criando os personagens e definindo seus atributos 
    	Character spiderMan = new Character("Homem Aranha",150,250,35,15,25)    ;
    	Character greenGoblin = new Character("Duende Verde", 175,200,30,15,30);
    	Character lizard = new Character("Largato",200,300,50,30,15);
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
    		//Array de textos, ou de Strings 
    		/*Evitando de dividir o capitulo em dois, criando dois objetos diferentes
    		 *para o mesmo capitulo, utilizamos um array, para guardar as partes do capitulo,
    		 **/
    		//Capitulo 1 
    		Capitulo capitulo1 = new Capitulo(new String[] {
    		//Parte 1 
    		"	Você é um garoto do Queens da cidade de Nova Iorque que nasceu no início \n" + 
    		"da década de 90 e perdeu seus pais ainda criança, mas, hoje vive com sua tia \n" + 
    		"e seu tio. Seus pais eram cientistas, porém, morreram em um acidente. Você é \n" + 
    		"um jovem brilhante, faz de tudo para ir bem na escola e ajudar seus tios. \n" + 
    		"Alguns te conhecerão pelos nomes: |amigão da vizinhança| ou |cabeça de teia|\n" + 
    		"mas todos saberão que sempre poderão contar com o homem aranha. \n\n" + 
    		"	Você é estudante da Midtown High School e, apesar de não tem muitos \n" +
    		"amigos, está sempre com Ned Leeds e as vezes com Harry Osborn. Todos \n" + 
    		"estão se preparando para o passeio escolar para um laboratório. \n\n" , 
    		//Parte 2
    		"	Após chegar no museu você vê a garota dos seus sonhos. Vocês conversam  \n"+
            "rápido, riem um pouco e logo após, ela pede para você fotografa-la. \n"+
            "	[o que você faz?]\n"+
        	"[foto] => (Tira a foto para ela)\n"+
    	    "[apressado] => (Fala que está apressado, e não tirar a foto)\n"+
    	    "Escolha: "});
    		capitulo1.display(0,false);
    		
    		
    		// capitulo feito por Vitor
    		String choose;
    		
    		Capitulo capitulov1 = new Capitulo(new String[] {
    		" Você acorda e tem que se preparar para o passeio escolar, então você decide entre\n"+
    		"escovar os dentes e comer.\n"+
    		"[escovar] => (Você escova os dentes e vai tomar banho!)\n"+
    		"[comer] => (Você vai fazer a primeira refeição do dia e se preparar para o passeio\n"});
    		
    		while(true) {
    			choose = capitulov1.display(0,true);
    	   		
        		
        		if ("escovar".contentEquals(choose)) {
        			System.out.println("Peter escovou os dentes e foi ao ponto de ônibus.\n");
        			break;
        		} else if("comer".contentEquals(choose)) {
        			System.out.println("Peter comeu e foi comer e se preparar para espera o ônibus.\n");
        			break;
        		} else {
        			System.out.println("Escolha invalida!");
        			TimeUnit.SECONDS.sleep(5);
        			clear();
        		}
        		
    		}
    		
    		
    		Capitulo capitulov2 = new Capitulo(new String[] {
    		"Agora você está no ponto de ônibus e ver o mesmo se aproximar.\n"+
    		"Porem o ônibus não para pra você. Então tem que decidir entre correr \n"+
    		"ou pergar um taxi. \n"+
    		"[correr] => (você corre, bate no ônibus e...)\n"+
    		"[taxi] => (você pega um taxi em seguraça)\n"});
    		
    		while(true) {
    			choose = capitulov2.display(0,true);
    			
    			if ("correr".contentEquals(choose)) {
    				System.out.println("acaba tropeçando, cai e todo mundo rir de você.");
    				break;
    			} else if("taxi".contentEquals(choose)) {
    				System.out.println("apesar de pegar um taxi em segurança, você acaba em um\n");
    				System.out.println("engarrafamento e acaba tendo que sair a pé.\n");
    				break;
    			} else {
    				System.out.println("Escolha invalida!");
        			TimeUnit.SECONDS.sleep(5);
        			clear();
    			}
    		}
    		
    		
    		Capitulo capitulov3 = new Capitulo(new String[] {
    		"Você acaba tendo que ir correndo para a escola e chegando lá o alunos estão se preparando\n"+
    		"para entrar no ônibus para chegar ao lab. você entra no ônibus e ver a MJ sentada sozinha e\n"+
    		"seu amigo Harry lá trás tambem sozinho, porem essa pode ser sua grande chance som a MJ, então...\n"+
    		"[MJ] => (decide sentar com a MJ)\n"+
    		"[Harry] => (decide sentar com o Harry)\n"});
    		
    		while(true) {
    			choose = capitulov3.display(0,true);
    			
    			if ("mj".contentEquals(choose)) {
    				System.out.println("você decide sentar com a MJ, porém leva um empurrão do flash\n");
    				break;
    			} else if ("harry".contentEquals(choose)) {
    				System.out.println("você vai sentar com seu melhor amigo para ter uma viagem tranquila\n");
    				break;
    			} else {
    				System.out.println("Escolha invalida!");
        			TimeUnit.SECONDS.sleep(5);
        			clear();
    			}
    		
    		}
    		
    		//Garantindo que o usuário vai dar uma entrada valida para minha primeira escolha 
    		 
    		while (true) {
    			
    			
    			//Variável para armazenar opção escolhida pelo usúario
    			choose = capitulo1.display(1,true);
	    		System.out.print("\n");
	    		clear();
	    
	    		//ramificação 1 
	    		if ("foto".contentEquals(choose)) {
	    			
	    			//Capitulo 2
	    			Capitulo capitulo2 = new Capitulo(new String[] {
	    			//Parte 1 
	    			"	 Você(Peter) tirar a foto, porém uma aranha radioativa desce por sua teia e \n"+
	        		"pousa em seu pulso direito, além disso ela pica você e introduz uma toxina que \n"+
	        		"fundirá seus DNAs. Após todo esse evento, você se sente enjoado e após o \n"+
	        		"passeio, volta para casa. Sua noite é horrível, você tem febre e dores no corpo, \n"+
	        		"porém o amanhã será outro dia e você acordará diferente... \n\n"+
	        		" No dia seguinte...\n\n",
	        		"	Em outra parte da cidade, o pai do seu melhor amigo (o MR. Osborn) está \n"+
	        		"passando por experimentos genéticos. Esse experimento o dará força e \n"+
	        		"habilidades de luta. \n\n"+
	        		"	O circo está feito. Você consegue entrar em uma luta livre para ganhar \n"+
	        		"dinheiro para poder comprar um carro. Seu sonho é finalmente poder levar a \n"+
	        		"MJ para sair.\n"+
	        		"A luta começa e você vai lutar contra o campeão dentro da gaiola. \n"});
	    			capitulo2.display(0, false);
	    			
	    			// capitulo feito por vitor
	    			
	    			Capitulo capitulov4 = new Capitulo(new String[] {
	    			"Você acodou se sentindo diferente, sua visão, seus movimentos, sua força e seus\n"+
	    			"sentidos estão mais fortes e mais apurado. Mais uma vez tem que se preparar para \n"+
	    			" a escola e mais uma vez esperar ônibus.\n"+
	    			"[ônibus] => (o ônibus vai não parar...)\n"+
	    			"[correr] => (você decidiu ir correndo para a escola...)\n"});
	    			
	    			while(true) {
	        			choose = capitulov4.display(0,true);
	        			
	        			if ("ônibus".contentEquals(choose)) {
	        				System.out.println(", mas dessa vez você consegue correr mais rápido e para-lo.");
	        				break;
	        			} else if ("correr".contentEquals(choose)) {
	        				System.out.println("e chegou mais rápido que o ônibus");
	        				break;
	        			} else {
	        				System.out.println("Escolha invalida!");
	            			TimeUnit.SECONDS.sleep(5);
	            			clear();
	        			}
	    			}
	    			
	    			Capitulo capitulov5 = new Capitulo(new String[] {
	    			"Na escola durante o almoço você arruma confusão com o flash e ele quer muito bater em \n"+
	    			"você, e você quer apenas se defender dos golpes ele, então seu sentido aranha é ativado \n"+
	    			"[sentido] => (Você segue seu sentido aranha)\n"+
	    			"[defender] => (Você se defende do jeito que pode)\n"});
	    			
	    			while(true) {
	        			choose = capitulov5.display(0,true);
	        			
	        			if ("sentido".contentEquals(choose)) {
	        				System.out.println("e desvia de um soco do flash onde todos se perguntam como você fez isso.\n");
	        				break;
	        			} else if ("defender".contentEquals(choose)) {
	        				System.out.println("quando o flash da um soco em você, você o segura e o derruba no chão \n");
	        				System.out.println("e depois sai correndo pelo corredor");
	        				break;
	        			} else {
	        				System.out.println("Escolha invalida!");
	            			TimeUnit.SECONDS.sleep(5);
	            			clear();
	        			}
	        			
	    			}
	    			
	    			
	    			capitulo2.display(1, false);
	    			TimeUnit.SECONDS.sleep(10);
	    	        //Capitulo 2 Batalha 1  
	    			CapituloBattle capitulo2Batalha1 = new CapituloBattle(spiderMan, fighter, new String[] {
	    			//Parte 1 
	    			"=====================================BATALHA Nº1=====================================\n"+
	    	        "O homem aranha entra na arena com seus braços finos, porém cheio de segredos por dentro,\n"+
	    	        "enquanto o outro campeão, acho que não tem nada de interessante, além da coragem! rsrs\n"+
	    	        "Irá começar em: ",		
	    	        //Parte 2
	    	        "Você consegue vencer a luta, porém o dinheiro não é o prometido, logo após \n"+
	        		"isso você está saindo da arena de luta quando um ladrão passa por você e \n"+
	        		"estava indo direto roubar o homem que te enganou. O enganador saiu \n"+
	        		"correndo pedindo para parar o ladrão, o problema é que você o deixa sair.\n"+
	        		
	        		"No final você sabe o que acontece. Sim, foi culpa sua, e a que preço?\n"});
	        		capitulo2Batalha1.display(0, false);
	        		countDown();
	        		System.out.println("=====================================================================================");
	        		//Inicia a 1º Batalha do capitulo 2
	        		capitulo2Batalha1.startBattle(1);
	        		//Mostra o pós batalha 
	        		capitulo2Batalha1.display(1, false);
	        		
	        		
        			//Capitulo 2 Batalha 2
	        		CapituloBattle capitulo2Batalha2 = new CapituloBattle(spiderMan, greenGoblin, new String[] {
	    	        "=====================================BATALHA Nº2=====================================\n"+
	    	        "Pouco tempo depois aparece o primeiro vilão que você terá que enfrentar seu \n"+
	    	        "nome é duende verde..\n"+
	    	        "O duende verde ataca um desfile na cidade e você tem que deter ele.\n"+ 
	    	        "A luta irá começar em: ", 
	    		    "Você consegue deter o duende verde e descobre que ele é o pai do seu \n"+
	    		    "melhor amigo Harry. Você não consegue contar ao seu amigo. Além disso você \n"+
	    		    "consegue uma chance com a MJ\n\n"});
		        	
	        		capitulo2Batalha2.display(0, false);
	        		countDown();
	        		System.out.println("=====================================================================================");
	        		//Inicia a 2º Batalha do capitulo 2
	        		capitulo2Batalha2.startBattle(0);
	        		//Mostra pós batalha 
	        		capitulo2Batalha2.display(1, false);
	        		
	        		
	        		//Capitulo 2 Batalha 3 
	        		CapituloBattle capitulo2Batalha3 = new CapituloBattle(spiderMan, greenGoblin, new String[] {
	        		"Tempo se passou e você reencontra o duende verde, porém hoje ele \n"+
	        		"sequestrou a MJ, você terá que salvar ela. O Duende Verde então a leva para \n"+
	        		"a ponte Queensboro, lá ele também captura um teleférico cheio de crianças.\n"+
	        		"=====================================BATALHA Nº3=====================================\n"+
	        		"O Homem Aranha em busca de salvar as crianças, então inicia uma batalha com o Duende Verde\n"+
	        		"A batalha irá começar em: ", 
	        		"O Duende Verde antes da Batalha, danificou todos os cabos do teleférico, deixando as crianças\n"+
	        		"entre a vida e a morte. Também a Mary Jani ficou presa nas cordas da ponte, que está prestes a\n"+
	        		"a se romper"});
	        		capitulo2Batalha3.display(0, false);
	        		countDown();
	        		System.out.println("=====================================================================================");
	        		//Inicia a 3º Batalha do Capitulo 2
	        		capitulo2Batalha3.startBattle(1);
	        		//Mostra o pós Batalha
	        		capitulo2Batalha3.display(1, false);
	        		
	        		//Escolha final da história 
	        		//Capitulo 3
	        		Capitulo capitulo3 = new Capitulo(new String[] {
	        			//Parte 1
	        			"Você precisa escolher um dos dois para poder salvar, sua amada ou as\n"+
	        			"crianças.\n",
	        			//Parte da escolha
	        			"[SalvarMJ] => (Salvar a Mary Jani)\n"+
	        			"[SalvarCriancas] => (Salvar as crianças)\n",
	        			//Escolha final 1
	        			"\nO Homem Aranha consegue salvar a Mary Jani, porém os cabos contenção \n "+
	        			"estava muito danificados e acabam se partindo, o teleférico cai no chão e \n"+ 
	        			"todas as crianças acabam morrendo. No dia seguinte....\n"+ 
	        			"O Homem Aranha é acusado nos jornais por matar todas as crianças, e \n"+
	        			"o Dr Osborn."
	        			+ ""
	        			+ "FIIIIIIIM!!!",
	        			//Escolha final 2 
	        			"\nO Homem Aranha consegue salvar as crianças, e logo após consegue salvar\n"+
	        			"e todos ficam bem, menos o Dr Osborn que morreu. No dia seguinte... \n"+
	        			"mesmo assim o Dr Osborn foi acusado de tentar matar as crianças, e o \n"+
	        			"Homem Aranha vira o grande herói de Nova York "
	        			+ ""
	        			+ "FIIIIIIIM!!!"});
	        		while (true) {
		        		capitulo3.display(0, false);
		        		choose = capitulo3.display(1, true);
		        		if ("salvarmj".contentEquals(choose)) {
		        			capitulo3.display(2, false);
		        			break; 
		        		} else if ("salvarcrianas".contentEquals(choose)){ 
		        			capitulo3.display(3, false);
		        			break;
		        		} else { 
		        			System.out.println("Escolha Invalida!!");
		        			TimeUnit.SECONDS.sleep(5);
		        			clear();
		        		}
	        		}
	        		break; 
	        	//ramificação 2 
	    		} else if ("apressado".contentEquals(choose)){ 
	    			//Garantindo uma escolha valida
	        		while (true) {
	        			
	        			//Capitulo 4
	        			Capitulo capitulo4 = new Capitulo(new String[] { 
	        			//Parte 1 
	        			"\n"+
		    			"	Peter não tira a foto e se distrai com uma sala mais isolada, que apresenta\n"+
		        		"barulhos estranhos então ele pensa um pouco, se irá ou não\n",
		        		//Parte 2 
		        		"[Sim]\n"+
	        			"[Não]\n"+
		        		"Escolha => "});
		        		capitulo4.display(0, false);
		        		think();
		        		choose = capitulo4.display(1, true);
		        		clear();
		        		
		        		//ramificação 1
		        		if ("sim".contentEquals(choose)) { 
		        			//capitulo 5
		        			Capitulo capitulo5 = new Capitulo(new String[] {
		        			//Parte 1
		        			"	Então Peter decide ir até a sala. Ao abrir a porta, ele se depara com um \n"+
			        		"compartimento de vidro cheio de aranhas, e em baixo vê as iniciais de seus \n"+
			        		"pais escrita em uma placa metálica, quando ele toca a placa uma aranha pula \n"+
			        		"nele e acaba o picando em sua nuca. Peter é pego, e é colocado para fora do \n"+
			        		"laboratório onde foi e, após isso, decide ir para casa. \n\n"+
			        		"No dia seguinte..\n\n"+			       
			        		"	Peter acorda se sentido estranho, suas mãos grudam nos objetos, ele tem mais \n"+
			        		"força e está com a visão boa. No mesmo dia, ao lembrar das iniciais dos pais, \n"+
			        		"ele vasculha a casa para tentar encontrar algo relacionado aos seus pais. \n"+
			        		"Então, acaba encontrando uma maleta com uma foto, onde é possível ver o pai \n"+
			        		"dele e um doutor que não tem o antebraço direito. ainda mais, Peter acha uma \n"+
			        		"pesquisa e decide estudar e tentar resolver o trabalho de seu falecido pai. \n\n"+
			        		"	Peter vai tentar contato com o amigo de seu pai para apresentar a pesquisa\n"+
			        		"com a formula final, então ele conhece pessoal mente o dr. Curt Connors, e se \n"+
			        		"apresenta como um Parker. Após apresenta a pesquisa o Dr o convida para \n"+
			        		"trabalhar e colocar em pratica.\n",
			        		//Parte 2 
			        		"	Pressionado o dr é obrigado a testar o soro da pesquisa em si próprio,\n"+
			        		"algo que vai fundir seu DNA com o de um lagarto. E de primeira o lagarto ataca\n"+
			        		"a cidade de NY, então o homem aranha vai intervir no ataque. O lagarto \n"+
			        		"humanoide vai derrubando carros de uma ponte, porém em um desses carro \n"+
			        		"tem uma criança, então peter terá que decidir\n"+
			        		"[Atacar] => (Vai atrás do largato)\n"+
			        		"[Salvar] => (Vai salvar a vida da criança)\n"});
			        		capitulo5.display(0, false);
			        		while (true) {
				        		choose = capitulo5.display(1, true);
				        		
				        		if ("atacar".contentEquals(choose)){
				        			System.out.println("\nVocê deixou o carro com a criança cair e foi atrás do largato, porém ");
				        			System.out.println("não conseguiu alcançar o largato, deixando-lhe fugir");
				        			break;
				        		} else if ("salvar".contentEquals(choose)){ 
				        			System.out.println("\nEle salva a criança, que estava no carro quase caindo da ponte, por ");
				        			System.out.println("e que por centímetros ainda estava nela. Porém deixa o largato fugir!!");
				        			break;
				        		} else { 
				        			System.out.println("Opção invalida!!!");
				        			TimeUnit.SECONDS.sleep(5);
				        			clear();
				        			continue;
				        		}
			        		}
			        		
			        		//Capitulo 4 Batalha1
			        		CapituloBattle capitulo4Batalha1 = new CapituloBattle(spiderMan, lizard, new String[] {
			        		"Após isso Peter tenta entender o que está acontecendo e vai até o laboratório \n"+
			        		"Oscorp, lá encontra o dr.  Connors  e  o  questiona sobre lagartos, rola uma \n"+
			        		"Logo após essa conversa o dr decide atacar a escola de peter e então chega\n"+
			        		"a hora de se defender. Muita correria nos corredores de Midtown e o homem \n"+
			        		"aranha esperando sua hora...\n"+
			        		"Você espera o corredor se esvaziar e coloca seu traje, já preparado para a \n"+
			        		"batalha e mesmo assim e pego de surpresa pelo lagarto...\n"+
			        		"=====================================BATALHA Nº1=====================================\n"+
			        		"A batalha irá começar em: \n"});
			        		capitulo4Batalha1.display(0, false);
			        		countDown();
			        		System.out.println("=====================================================================================");
			        		capitulo4Batalha1.startBattle(0);
			        		//Homem aranha regenera vida 
			        		spiderMan.regenarahp(150);
			        		clear();
			        		//Capitulo 4 Batalha2 
			        		CapituloBattle capitulo4Batalha2 = new CapituloBattle(spiderMan, lizard, new String[] {
			        		//Inicio da batalha
			        		"Porém o Homem Aranha vai atrás dele, e descobre o seu esconderijo, e os seus\n"+
			        		"planos. O largato quer transforma todos os moradores da cidade de Nova York em \n"+
			        		"reptéis, através de um dispositivo que cria uma nuvem na cidade. Esse dispositivo\n"+
			        		"se encontra na torre Osborn, o Homem Aranha decide ir até lá, e impedir o lagarto\n"+
			        		"=====================================BATALHA Nº2=====================================\n"+
			        		"A batalha irá começar em: \n"});
			        		countDown();
			        		System.out.println("=====================================================================================");
			        		capitulo4Batalha2.startBattle(1);
			        		
			        		//Capitulo 6
			        		Capitulo capitulo6 = new Capitulo(new String[] {
			        		//Final
			        		"Após a batalha o lagarto se transforma em humano novamente. O Homem Aranha conseguiu \n"+
			        		"deter os seus planos. Mas o Dr Connors fica pendurado na torre, e se encontra fraco \n"+
			        		"então o Homem Aranha tem que decidir se irá Salva-lo ou não: \n"+
			        		"[Sim] => (O Dr Connors será salvo) \n"+
			        		"[Não] => \n",
			        		//Escolha Final 1 
			        		"O Dr Connors foi salvo, porém está acusado de atentado contra a vida de todos os \n"+
			        		"moradores de Nova York e acabou sendo preso, conclusão: Sua segunda casa é a cadeia \n"+
			        		"e pronto. O Homem Aranha salva o dia pela primeira Vez. Fiiiiiiiiim !!",
			        		//Escolha Final 2
			        		"Apesar da morte do Dr Connors ele ainda foi acusado de vários homicidios e atentado \n"+
			        		"contra a vida de todos os moradores de Nova York. Além disso o Homem Aranha se tornou \n"+
			        		"o grande herói da cidade de Nova York. Fiiiiiim!!"});
			        		choose = capitulo6.display(0, true);
			        		
			        		while (true) {
			        			if ("sim".contentEquals(choose)) {
			        				capitulo6.display(1, false);
			        				break;
			        			} else if ("não".contentEquals(choose)) {
			        				capitulo6.display(2, false);
			        				break;
			        			} else { 
			        				System.out.println("Escolha Invalida!!");
			        				TimeUnit.SECONDS.sleep(5);
			        				clear();
			        			}
			        		}
			        		
			        		break; 
			        	//Ramificação 2 
		        		} else if ("não".contentEquals(choose)) { 
		        			//capitulo troll 
		        			Capitulo capituloTroll = new Capitulo(new String[] {
		        			"A história acaba aqui!!!! Rrsrs\n"+
		        			"Em um filme de terror, pense comigo, se alguém se depara com uma porta de um quarto  \n"+
		        			"fechando, ela concerteza vai lar ver o que é. Eu sairia correndo, se fosse possivel até\n"+
		        			"dormiria na rua rsrs\n"+
		        			"Conclusão, você não dar pra ser ator de um filme de terror kkssksksks\n"+
		        			"\n Ainda não acabou, calma rsrsrs\n\n"+
		        			"O destino arrumou uma forma de transformar o Peter no Homem Aranha. \n"+
		        			"Tempos depois... Ele recebe uma carta do próprio Tony Stark.\n"+
		        			"=====================================================================================\n"+
		        			"-----------------------------isso será visto em DLC----------------------------------\n"+
		        			"=====================================================================================\n"});
		        			capituloTroll.display(0, false);
		        			break;
		        		} else { 
		        			continue; 
		        		}
	        		}
	        		
	        		break;  
	        			
		        		
	        		
	        		
	    		} else { 
	    			JOptionPane.showMessageDialog
	    				(null, "Opção Invalida", "Invalid Answer",JOptionPane.ERROR_MESSAGE);; 
	    			continue; 
	    		}
    		}
    		
    		
    	} catch (Exception e) {
   		 // TODO Auto-generated catch block
   		 e.printStackTrace();
   	 	}
   	 
	}
    

}

