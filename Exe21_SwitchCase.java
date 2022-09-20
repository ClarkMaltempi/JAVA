//21. Entrar via teclado com dois valores quaisquer. Após a digitação, 
//exibir um seletor de opções (“menu”) com as seguintes opções: (Fazer esse exercício utilizando If..Else e/ou Case)

//1 – Multiplicação
//2 – Adição
//3 – Divisão
//4 – Subtração
//5 – Fim de processo (sair do programa)

//Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) 
//e processar a respectiva operação. Enviar mensagem de erro se a opção escolhida não existir no seletor.

//Encerrar o programa somente quando o usuário escolher a opção de finalização. 
//Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de erro, (somente nesta opção) se o denominador for zero.

import java.util.*;
public class Exe21_SwitchCase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opc= 0, num, num2, resultado;
		
		
		
		do {
			
			System.out.println("Digite um numero");
			num = ler.nextInt();
			System.out.println("Digite outro numero");
			num2 = ler.nextInt();
			
			System.out.println("\nO que quer fazer\n");
			System.out.println("\n1 Multiplicacao\n");
			System.out.println("2 Adicao\n");
			System.out.println("3 Divisao\n");
			System.out.println("4 Subtracao\n");
			System.out.println("5 Fim de processo\n");
			opc = ler.nextInt();
			
			switch(opc) {
			
			
			case 1:
				resultado = num*num2;
				System.out.printf("Mult: %d\n", resultado);
			break;
			
			case 2:
				resultado = num+num2;
				System.out.printf("Soma: %d\n", resultado);
				break;
			
			case 3:
				
				if(num2 != 0) {
					resultado = num/num2;
					System.out.printf("Divisao: %d\n", resultado);
				}else {
					System.out.println("Erro Numero Invalido!\n");
				}
				
				break;
			
			case 4:
				resultado = num-num2;
				System.out.printf("Subtracao: %d\n", resultado);
				break;
				
			case 5:
				System.out.printf("Voce decidiu sair\n");
				break;
				
			default:
				System.out.println("Opcao Invalida!\n");
				break;
			
			}
			
		}while(opc != 5);
		
		
		
		

	}

}
