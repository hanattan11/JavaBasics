package teste;
import java.util.*;

public class prova {
	
	public static void main(String[] Args) {
		
		try (Scanner d = new Scanner(System.in)) {
			String stop = "n";
			
			int ter = 0;
			int aqua = 0;
			int semi = 0;
			
			int conT = 0;
			int conA = 0;
			int conS = 0;
			
			while(stop.equals("n")) {
				
				System.out.println("Qual seria o tipo da especie?");
				System.out.println("t - Terrestre");
				System.out.println("a - Aquatico");
				System.out.println("s - Semiaqu�tico");
				String tipo = d.nextLine();
							
				if(tipo.equals("t")) {
					ter++;
				}
				else if(tipo.equals("a")) {
					aqua++;
				}
				else {
					semi++;
				}
				conT+=ter;
				conA+=aqua;
				conS+=semi;
				
				if(stop.equals("n")) {
				System.out.println("Deseja parar o programa? s/n");
				String sair = d.nextLine();
				stop = sair;
				}
			}
			
			if(conT > conA && conT > conS) {
				System.out.println("O tipo de percebejo em maior quantidade � o Terrestre.");
			}
			else if(conA > conT && conA > conS) {
				System.out.println("O tipo de percebejo em maior quantidade � o Aquatico.");
			}
			else if(conS > conT && conS > conA) {
				System.out.println("O tipo de percebejo em maior quantidade � o Semiaquatico.");
			}
			
			else if(conS > conT && conS == conA) {
				System.out.println("O tipo de percebejo SemiAquatico e Aquatico tem a mesma quantidade.");
			}
			else if(conT > conS && conT == conA) {
				System.out.println("O Tipo de Percebejo Terrestre e Aquatico tem a mesma quantidade.");
			}
			else if(conA > conT && conA == conS) {
				System.out.println("O tipo de percebejo Aquatico e SemiAquatico tem a mesma quantidade.");
			}
			
			else if(conS > conA && conS == conT) {
				System.out.println("O tipo de percebejo SemiAquatico e Terrestre tem a mesma quantidade.");
			}
			else if(conT > conA && conT == conS) {
				System.out.println("O tipo de percebejo Terrestre e Semiaquatico tem a mesma quantidade.");
			}
			else {
				System.out.println("O tipo de percebejo Aquatico e Terrestre tem a mesma quantidade.");
			}
		}
	}

}
