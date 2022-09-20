import java.util.*;

//20. Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:
//MEDIA = (P1 + 2.P2) / 3
//Fazer um programa para entrar via teclado com o valor da primeira nota (P1) 
//e o programa deverá calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente
//(P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.


public class Exe20_Media {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double P1=0, P2=0, MEDIA=0;
		
		System.out.println("Nota da P1");
		P1 = ler.nextDouble();
		
		System.out.println("Nota da P2");
		P2 = ler.nextDouble();
		
		MEDIA = (P1 + 2*P2) / 3;
		
		if(MEDIA < 5) {
			MEDIA = 5-MEDIA;
		}else {
			System.out.println("Aprovado");
		}
		
		
		System.out.printf("Valor restante para passar: %.2f", MEDIA);
		
		
	}

}
