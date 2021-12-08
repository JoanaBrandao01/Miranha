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
    		//Array de textos, ou de Strings 
    		/*Evitando de dividir o capitulo em dois, criando dois objetos diferentes
    		 *para o mesmo capitulo, utilizamos um array, para guardar as partes do capitulo,
    		 **/
    		//Capitulo 1 
    		Capitulo capitulo1 = new Capitulo(new String[] {
    		//Parte 1 
    		"	Voc� � um garoto do Queens da cidade de Nova Iorque que nasceu no in�cio \n" + 
    		"da d�cada de 90 e perdeu seus pais ainda crian�a, mas, hoje vive com sua tia \n" + 
    		"e seu tio. Seus pais eram cientistas, por�m, morreram em um acidente. Voc� � \n" + 
    		"um jovem brilhante, faz de tudo para ir bem na escola e ajudar seus tios. \n" + 
    		"Alguns te conhecer�o pelos nomes: |amig�o da vizinhan�a| ou |cabe�a de teia|\n" + 
    		"mas todos saber�o que sempre poder�o contar com o homem aranha. \n\n" + 
    		"	Voc� � estudante da Midtown High School e, apesar de n�o tem muitos \n" +
    		"amigos, est� sempre com Ned Leeds e as vezes com Harry Osborn. Todos \n" + 
    		"est�o se preparando para o passeio escolar para um laborat�rio. \n\n" , 
    		//Parte 2
    		"	Ap�s chegar no museu voc� v� a garota dos seus sonhos. Voc�s conversam  \n"+
            "r�pido, riem um pouco e logo ap�s, ela pede para voc� fotografa-la. \n"+
            "	[o que voc� faz?]\n"+
        	"[foto] => (Tira a foto para ela)\n"+
    	    "[apressado] => (Fala que est� apressado, e n�o tirar a foto)\n"+
    	    "Escolha: "});
    		capitulo1.display(0,false);
    		
    		
    		// capitulo feito por Vitor
    		String choose;
    		
    		Capitulo capitulov1 = new Capitulo(new String[] {
    		" Voc� acorda e tem que se preparar para o passeio escolar, ent�o voc� decide entre\n"+
    		"escovar os dentes e comer.\n"+
    		"[escovar] => (Voc� escova os dentes e vai tomar banho!)\n"+
    		"[comer] => (Voc� vai fazer a primeira refei��o do dia e se preparar para o passeio\n"});
    		
    		while(true) {
    			choose = capitulov1.display(0,true);
    	   		
        		
        		if ("escovar".contentEquals(choose)) {
        			System.out.println("Peter escovou os dentes e foi ao ponto de �nibus.\n");
        			break;
        		} else if("comer".contentEquals(choose)) {
        			System.out.println("Peter comeu e foi comer e se preparar para espera o �nibus.\n");
        			break;
        		} else {
        			System.out.println("Escolha invalida!");
        			TimeUnit.SECONDS.sleep(5);
        			clear();
        		}
        		
    		}
    		
    		
    		Capitulo capitulov2 = new Capitulo(new String[] {
    		"Agora voc� est� no ponto de �nibus e ver o mesmo se aproximar.\n"+
    		"Porem o �nibus n�o para pra voc�. Ent�o tem que decidir entre correr \n"+
    		"ou pergar um taxi. \n"+
    		"[correr] => (voc� corre, bate no �nibus e...)\n"+
    		"[taxi] => (voc� pega um taxi em segura�a)\n"});
    		
    		while(true) {
    			choose = capitulov2.display(0,true);
    			
    			if ("correr".contentEquals(choose)) {
    				System.out.println("acaba trope�ando, cai e todo mundo rir de voc�.");
    				break;
    			} else if("taxi".contentEquals(choose)) {
    				System.out.println("apesar de pegar um taxi em seguran�a, voc� acaba em um\n");
    				System.out.println("engarrafamento e acaba tendo que sair a p�.\n");
    				break;
    			} else {
    				System.out.println("Escolha invalida!");
        			TimeUnit.SECONDS.sleep(5);
        			clear();
    			}
    		}
    		
    		
    		Capitulo capitulov3 = new Capitulo(new String[] {
    		"Voc� acaba tendo que ir correndo para a escola e chegando l� o alunos est�o se preparando\n"+
    		"para entrar no �nibus para chegar ao lab. voc� entra no �nibus e ver a MJ sentada sozinha e\n"+
    		"seu amigo Harry l� tr�s tambem sozinho, porem essa pode ser sua grande chance som a MJ, ent�o...\n"+
    		"[MJ] => (decide sentar com a MJ)\n"+
    		"[Harry] => (decide sentar com o Harry)\n"});
    		
    		while(true) {
    			choose = capitulov3.display(0,true);
    			
    			if ("mj".contentEquals(choose)) {
    				System.out.println("voc� decide sentar com a MJ, por�m leva um empurr�o do flash\n");
    				break;
    			} else if ("harry".contentEquals(choose)) {
    				System.out.println("voc� vai sentar com seu melhor amigo para ter uma viagem tranquila\n");
    				break;
    			} else {
    				System.out.println("Escolha invalida!");
        			TimeUnit.SECONDS.sleep(5);
        			clear();
    			}
    		
    		}
    		
    		//Garantindo que o usu�rio vai dar uma entrada valida para minha primeira escolha 
    		 
    		while (true) {
    			
    			
    			//Vari�vel para armazenar op��o escolhida pelo us�ario
    			choose = capitulo1.display(1,true);
	    		System.out.print("\n");
	    		clear();
	    
	    		//ramifica��o 1 
	    		if ("foto".contentEquals(choose)) {
	    			
	    			//Capitulo 2
	    			Capitulo capitulo2 = new Capitulo(new String[] {
	    			//Parte 1 
	    			"	 Voc�(Peter) tirar a foto, por�m uma aranha radioativa desce por sua teia e \n"+
	        		"pousa em seu pulso direito, al�m disso ela pica voc� e introduz uma toxina que \n"+
	        		"fundir� seus DNAs. Ap�s todo esse evento, voc� se sente enjoado e ap�s o \n"+
	        		"passeio, volta para casa. Sua noite � horr�vel, voc� tem febre e dores no corpo, \n"+
	        		"por�m o amanh� ser� outro dia e voc� acordar� diferente... \n\n"+
	        		" No dia seguinte...\n\n",
	        		"	Em outra parte da cidade, o pai do seu melhor amigo (o MR. Osborn) est� \n"+
	        		"passando por experimentos gen�ticos. Esse experimento o dar� for�a e \n"+
	        		"habilidades de luta. \n\n"+
	        		"	O circo est� feito. Voc� consegue entrar em uma luta livre para ganhar \n"+
	        		"dinheiro para poder comprar um carro. Seu sonho � finalmente poder levar a \n"+
	        		"MJ para sair.\n"+
	        		"A luta come�a e voc� vai lutar contra o campe�o dentro da gaiola. \n"});
	    			capitulo2.display(0, false);
	    			
	    			// capitulo feito por vitor
	    			
	    			Capitulo capitulov4 = new Capitulo(new String[] {
	    			"Voc� acodou se sentindo diferente, sua vis�o, seus movimentos, sua for�a e seus\n"+
	    			"sentidos est�o mais fortes e mais apurado. Mais uma vez tem que se preparar para \n"+
	    			" a escola e mais uma vez esperar �nibus.\n"+
	    			"[�nibus] => (o �nibus vai n�o parar...)\n"+
	    			"[correr] => (voc� decidiu ir correndo para a escola...)\n"});
	    			
	    			while(true) {
	        			choose = capitulov4.display(0,true);
	        			
	        			if ("�nibus".contentEquals(choose)) {
	        				System.out.println(", mas dessa vez voc� consegue correr mais r�pido e para-lo.");
	        				break;
	        			} else if ("correr".contentEquals(choose)) {
	        				System.out.println("e chegou mais r�pido que o �nibus");
	        				break;
	        			} else {
	        				System.out.println("Escolha invalida!");
	            			TimeUnit.SECONDS.sleep(5);
	            			clear();
	        			}
	    			}
	    			
	    			Capitulo capitulov5 = new Capitulo(new String[] {
	    			"Na escola durante o almo�o voc� arruma confus�o com o flash e ele quer muito bater em \n"+
	    			"voc�, e voc� quer apenas se defender dos golpes ele, ent�o seu sentido aranha � ativado \n"+
	    			"[sentido] => (Voc� segue seu sentido aranha)\n"+
	    			"[defender] => (Voc� se defende do jeito que pode)\n"});
	    			
	    			while(true) {
	        			choose = capitulov5.display(0,true);
	        			
	        			if ("sentido".contentEquals(choose)) {
	        				System.out.println("e desvia de um soco do flash onde todos se perguntam como voc� fez isso.\n");
	        				break;
	        			} else if ("defender".contentEquals(choose)) {
	        				System.out.println("quando o flash da um soco em voc�, voc� o segura e o derruba no ch�o \n");
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
	    			"=====================================BATALHA N�1=====================================\n"+
	    	        "O homem aranha entra na arena com seus bra�os finos, por�m cheio de segredos por dentro,\n"+
	    	        "enquanto o outro campe�o, acho que n�o tem nada de interessante, al�m da coragem! rsrs\n"+
	    	        "Ir� come�ar em: ",		
	    	        //Parte 2
	    	        "Voc� consegue vencer a luta, por�m o dinheiro n�o � o prometido, logo ap�s \n"+
	        		"isso voc� est� saindo da arena de luta quando um ladr�o passa por voc� e \n"+
	        		"estava indo direto roubar o homem que te enganou. O enganador saiu \n"+
	        		"correndo pedindo para parar o ladr�o, o problema � que voc� o deixa sair.\n"+
	        		
	        		"No final voc� sabe o que acontece. Sim, foi culpa sua, e a que pre�o?\n"});
	        		capitulo2Batalha1.display(0, false);
	        		countDown();
	        		System.out.println("=====================================================================================");
	        		//Inicia a 1� Batalha do capitulo 2
	        		capitulo2Batalha1.startBattle(1);
	        		//Mostra o p�s batalha 
	        		capitulo2Batalha1.display(1, false);
	        		
	        		
        			//Capitulo 2 Batalha 2
	        		CapituloBattle capitulo2Batalha2 = new CapituloBattle(spiderMan, greenGoblin, new String[] {
	    	        "=====================================BATALHA N�2=====================================\n"+
	    	        "Pouco tempo depois aparece o primeiro vil�o que voc� ter� que enfrentar seu \n"+
	    	        "nome � duende verde..\n"+
	    	        "O duende verde ataca um desfile na cidade e voc� tem que deter ele.\n"+ 
	    	        "A luta ir� come�ar em: ", 
	    		    "Voc� consegue deter o duende verde e descobre que ele � o pai do seu \n"+
	    		    "melhor amigo Harry. Voc� n�o consegue contar ao seu amigo. Al�m disso voc� \n"+
	    		    "consegue uma chance com a MJ\n\n"});
		        	
	        		capitulo2Batalha2.display(0, false);
	        		countDown();
	        		System.out.println("=====================================================================================");
	        		//Inicia a 2� Batalha do capitulo 2
	        		capitulo2Batalha2.startBattle(0);
	        		//Mostra p�s batalha 
	        		capitulo2Batalha2.display(1, false);
	        		
	        		
	        		//Capitulo 2 Batalha 3 
	        		CapituloBattle capitulo2Batalha3 = new CapituloBattle(spiderMan, greenGoblin, new String[] {
	        		"Tempo se passou e voc� reencontra o duende verde, por�m hoje ele \n"+
	        		"sequestrou a MJ, voc� ter� que salvar ela. O Duende Verde ent�o a leva para \n"+
	        		"a ponte Queensboro, l� ele tamb�m captura um telef�rico cheio de crian�as.\n"+
	        		"=====================================BATALHA N�3=====================================\n"+
	        		"O Homem Aranha em busca de salvar as crian�as, ent�o inicia uma batalha com o Duende Verde\n"+
	        		"A batalha ir� come�ar em: ", 
	        		"O Duende Verde antes da Batalha, danificou todos os cabos do telef�rico, deixando as crian�as\n"+
	        		"entre a vida e a morte. Tamb�m a Mary Jani ficou presa nas cordas da ponte, que est� prestes a\n"+
	        		"a se romper"});
	        		capitulo2Batalha3.display(0, false);
	        		countDown();
	        		System.out.println("=====================================================================================");
	        		//Inicia a 3� Batalha do Capitulo 2
	        		capitulo2Batalha3.startBattle(1);
	        		//Mostra o p�s Batalha
	        		capitulo2Batalha3.display(1, false);
	        		
	        		//Escolha final da hist�ria 
	        		//Capitulo 3
	        		Capitulo capitulo3 = new Capitulo(new String[] {
	        			//Parte 1
	        			"Voc� precisa escolher um dos dois para poder salvar, sua amada ou as\n"+
	        			"crian�as.\n",
	        			//Parte da escolha
	        			"[SalvarMJ] => (Salvar a Mary Jani)\n"+
	        			"[SalvarCriancas] => (Salvar as crian�as)\n",
	        			//Escolha final 1
	        			"\nO Homem Aranha consegue salvar a Mary Jani, por�m os cabos conten��o \n "+
	        			"estava muito danificados e acabam se partindo, o telef�rico cai no ch�o e \n"+ 
	        			"todas as crian�as acabam morrendo. No dia seguinte....\n"+ 
	        			"O Homem Aranha � acusado nos jornais por matar todas as crian�as, e \n"+
	        			"o Dr Osborn."
	        			+ ""
	        			+ "FIIIIIIIM!!!",
	        			//Escolha final 2 
	        			"\nO Homem Aranha consegue salvar as crian�as, e logo ap�s consegue salvar\n"+
	        			"e todos ficam bem, menos o Dr Osborn que morreu. No dia seguinte... \n"+
	        			"mesmo assim o Dr Osborn foi acusado de tentar matar as crian�as, e o \n"+
	        			"Homem Aranha vira o grande her�i de Nova York "
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
	        	//ramifica��o 2 
	    		} else if ("apressado".contentEquals(choose)){ 
	    			//Garantindo uma escolha valida
	        		while (true) {
	        			
	        			//Capitulo 4
	        			Capitulo capitulo4 = new Capitulo(new String[] { 
	        			//Parte 1 
	        			"\n"+
		    			"	Peter n�o tira a foto e se distrai com uma sala mais isolada, que apresenta\n"+
		        		"barulhos estranhos ent�o ele pensa um pouco, se ir� ou n�o\n",
		        		//Parte 2 
		        		"[Sim]\n"+
	        			"[N�o]\n"+
		        		"Escolha => "});
		        		capitulo4.display(0, false);
		        		think();
		        		choose = capitulo4.display(1, true);
		        		clear();
		        		
		        		//ramifica��o 1
		        		if ("sim".contentEquals(choose)) { 
		        			//capitulo 5
		        			Capitulo capitulo5 = new Capitulo(new String[] {
		        			//Parte 1
		        			"	Ent�o Peter decide ir at� a sala. Ao abrir a porta, ele se depara com um \n"+
			        		"compartimento de vidro cheio de aranhas, e em baixo v� as iniciais de seus \n"+
			        		"pais escrita em uma placa met�lica, quando ele toca a placa uma aranha pula \n"+
			        		"nele e acaba o picando em sua nuca. Peter � pego, e � colocado para fora do \n"+
			        		"laborat�rio onde foi e, ap�s isso, decide ir para casa. \n\n"+
			        		"No dia seguinte..\n\n"+			       
			        		"	Peter acorda se sentido estranho, suas m�os grudam nos objetos, ele tem mais \n"+
			        		"for�a e est� com a vis�o boa. No mesmo dia, ao lembrar das iniciais dos pais, \n"+
			        		"ele vasculha a casa para tentar encontrar algo relacionado aos seus pais. \n"+
			        		"Ent�o, acaba encontrando uma maleta com uma foto, onde � poss�vel ver o pai \n"+
			        		"dele e um doutor que n�o tem o antebra�o direito. ainda mais, Peter acha uma \n"+
			        		"pesquisa e decide estudar e tentar resolver o trabalho de seu falecido pai. \n\n"+
			        		"	Peter vai tentar contato com o amigo de seu pai para apresentar a pesquisa\n"+
			        		"com a formula final, ent�o ele conhece pessoal mente o dr. Curt Connors, e se \n"+
			        		"apresenta como um Parker. Ap�s apresenta a pesquisa o Dr o convida para \n"+
			        		"trabalhar e colocar em pratica.\n",
			        		//Parte 2 
			        		"	Pressionado o dr � obrigado a testar o soro da pesquisa em si pr�prio,\n"+
			        		"algo que vai fundir seu DNA com o de um lagarto. E de primeira o lagarto ataca\n"+
			        		"a cidade de NY, ent�o o homem aranha vai intervir no ataque. O lagarto \n"+
			        		"humanoide vai derrubando carros de uma ponte, por�m em um desses carro \n"+
			        		"tem uma crian�a, ent�o peter ter� que decidir\n"+
			        		"[Atacar] => (Vai atr�s do largato)\n"+
			        		"[Salvar] => (Vai salvar a vida da crian�a)\n"});
			        		capitulo5.display(0, false);
			        		while (true) {
				        		choose = capitulo5.display(1, true);
				        		
				        		if ("atacar".contentEquals(choose)){
				        			System.out.println("\nVoc� deixou o carro com a crian�a cair e foi atr�s do largato, por�m ");
				        			System.out.println("n�o conseguiu alcan�ar o largato, deixando-lhe fugir");
				        			break;
				        		} else if ("salvar".contentEquals(choose)){ 
				        			System.out.println("\nEle salva a crian�a, que estava no carro quase caindo da ponte, por ");
				        			System.out.println("e que por cent�metros ainda estava nela. Por�m deixa o largato fugir!!");
				        			break;
				        		} else { 
				        			System.out.println("Op��o invalida!!!");
				        			TimeUnit.SECONDS.sleep(5);
				        			clear();
				        			continue;
				        		}
			        		}
			        		
			        		//Capitulo 4 Batalha1
			        		CapituloBattle capitulo4Batalha1 = new CapituloBattle(spiderMan, lizard, new String[] {
			        		"Ap�s isso Peter tenta entender o que est� acontecendo e vai at� o laborat�rio \n"+
			        		"Oscorp, l� encontra o dr.  Connors  e  o  questiona sobre lagartos, rola uma \n"+
			        		"Logo ap�s essa conversa o dr decide atacar a escola de peter e ent�o chega\n"+
			        		"a hora de se defender. Muita correria nos corredores de Midtown e o homem \n"+
			        		"aranha esperando sua hora...\n"+
			        		"Voc� espera o corredor se esvaziar e coloca seu traje, j� preparado para a \n"+
			        		"batalha e mesmo assim e pego de surpresa pelo lagarto...\n"+
			        		"=====================================BATALHA N�1=====================================\n"+
			        		"A batalha ir� come�ar em: \n"});
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
			        		"Por�m o Homem Aranha vai atr�s dele, e descobre o seu esconderijo, e os seus\n"+
			        		"planos. O largato quer transforma todos os moradores da cidade de Nova York em \n"+
			        		"rept�is, atrav�s de um dispositivo que cria uma nuvem na cidade. Esse dispositivo\n"+
			        		"se encontra na torre Osborn, o Homem Aranha decide ir at� l�, e impedir o lagarto\n"+
			        		"=====================================BATALHA N�2=====================================\n"+
			        		"A batalha ir� come�ar em: \n"});
			        		countDown();
			        		System.out.println("=====================================================================================");
			        		capitulo4Batalha2.startBattle(1);
			        		
			        		//Capitulo 6
			        		Capitulo capitulo6 = new Capitulo(new String[] {
			        		//Final
			        		"Ap�s a batalha o lagarto se transforma em humano novamente. O Homem Aranha conseguiu \n"+
			        		"deter os seus planos. Mas o Dr Connors fica pendurado na torre, e se encontra fraco \n"+
			        		"ent�o o Homem Aranha tem que decidir se ir� Salva-lo ou n�o: \n"+
			        		"[Sim] => (O Dr Connors ser� salvo) \n"+
			        		"[N�o] => \n",
			        		//Escolha Final 1 
			        		"O Dr Connors foi salvo, por�m est� acusado de atentado contra a vida de todos os \n"+
			        		"moradores de Nova York e acabou sendo preso, conclus�o: Sua segunda casa � a cadeia \n"+
			        		"e pronto. O Homem Aranha salva o dia pela primeira Vez. Fiiiiiiiiim !!",
			        		//Escolha Final 2
			        		"Apesar da morte do Dr Connors ele ainda foi acusado de v�rios homicidios e atentado \n"+
			        		"contra a vida de todos os moradores de Nova York. Al�m disso o Homem Aranha se tornou \n"+
			        		"o grande her�i da cidade de Nova York. Fiiiiiim!!"});
			        		choose = capitulo6.display(0, true);
			        		
			        		while (true) {
			        			if ("sim".contentEquals(choose)) {
			        				capitulo6.display(1, false);
			        				break;
			        			} else if ("n�o".contentEquals(choose)) {
			        				capitulo6.display(2, false);
			        				break;
			        			} else { 
			        				System.out.println("Escolha Invalida!!");
			        				TimeUnit.SECONDS.sleep(5);
			        				clear();
			        			}
			        		}
			        		
			        		break; 
			        	//Ramifica��o 2 
		        		} else if ("n�o".contentEquals(choose)) { 
		        			//capitulo troll 
		        			Capitulo capituloTroll = new Capitulo(new String[] {
		        			"A hist�ria acaba aqui!!!! Rrsrs\n"+
		        			"Em um filme de terror, pense comigo, se algu�m se depara com uma porta de um quarto  \n"+
		        			"fechando, ela concerteza vai lar ver o que �. Eu sairia correndo, se fosse possivel at�\n"+
		        			"dormiria na rua rsrs\n"+
		        			"Conclus�o, voc� n�o dar pra ser ator de um filme de terror kkssksksks\n"+
		        			"\n Ainda n�o acabou, calma rsrsrs\n\n"+
		        			"O destino arrumou uma forma de transformar o Peter no Homem Aranha. \n"+
		        			"Tempos depois... Ele recebe uma carta do pr�prio Tony Stark.\n"+
		        			"=====================================================================================\n"+
		        			"-----------------------------isso ser� visto em DLC----------------------------------\n"+
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
	    				(null, "Op��o Invalida", "Invalid Answer",JOptionPane.ERROR_MESSAGE);; 
	    			continue; 
	    		}
    		}
    		
    		
    	} catch (Exception e) {
   		 // TODO Auto-generated catch block
   		 e.printStackTrace();
   	 	}
   	 
	}
    

}

