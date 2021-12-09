import java.util.Scanner;

public class Capitulo {
	private String[] textos; 

	public Capitulo(String[] textos) { 
		this.textos = textos;
	}
	
	public String display(int number, boolean escolha) {
		Scanner input = new Scanner(System.in);
		if (escolha == true) {
			System.out.print(this.textos[number]);
			String choose = new String(input.nextLine()).toLowerCase();
			return choose; 
		} else {
			System.out.print(textos[number]);
			return this.textos[number]; 
			
		}

	}
	
	
}


