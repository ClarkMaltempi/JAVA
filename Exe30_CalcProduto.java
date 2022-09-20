import java.util.*;

public class Exe30_CalcProduto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		double preco, Valpagar=0;
		int opc;
		
		System.out.println("Digite o preco do Produto");
		preco = ler.nextDouble();

		System.out.println("\n\n");
		System.out.println("1 Dinheiro ou Cheque");
		System.out.println("2 A vista no credito");
		System.out.println("3 Credito em 2X");
		System.out.println("4 Credito em 4X");
		System.out.println("Sair");
		
		System.out.println("\nQual a forma de pagamento ?");
		opc = ler.nextInt();
		
		switch(opc)
		{
		
		case 1:
			Valpagar = preco-(preco*0.1);
		break;
			
		case 2:
			Valpagar = preco-(preco*0.15);
		break;
		
		case 3:
			Valpagar = preco;
		break;
		
		case 4:
			Valpagar = preco+(preco*0.1);
		break;
		
		case 5:
			System.out.println("FIM");
		break;
		
		default:
			System.out.println("Valor Inválido");
			break;
		
		}
		
		System.out.printf("Preco Final: %.2f", Valpagar);
		
		
		
		
		

	}

}
