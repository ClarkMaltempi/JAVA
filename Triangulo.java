package PkgTriangulo;


/*
        Só irá existir um triângulo se, somente se,
        os seus lados obedeceram à seguinte regra: um de seus lados deve ser maior que o valor absoluto (módulo)
        da diferença dos outros dois lados e menor que a soma dos outros dois lados.
        | b - c | < a < b + c
        | a - c | < b < a + c
        | a - b | < c < a + b
		
		5 – 4 = 1 < 3 < 4 + 5 = 9
		5 – 3 = 2 < 4 < 3 + 5 = 8
		4 – 3 = 1 < 5 < 3 + 4 = 7
		
		
*/



import java.util.*;

public class Triangulo {

	public static void main(String[] args) {
		
		int a,b,c;
		char condicao1, condicao2, condicao3, condicaofinal=' ';
		
		Scanner ler = new Scanner(System.in);
		
		
		 System.out.println("DIGITE O LADO A: ");
		 a = ler.nextInt();
		 System.out.println("DIGITE O LADO B: ");
		 b = ler.nextInt();
		 System.out.println("DIGITE O LADO C: ");
		 c = ler.nextInt();

		    if (b - c  < a && a < b + c)
		    {
		        condicao1 = 'v';
		    }
		    else
		    {
		        condicao1 = 'n';
		    }
		    if (a - c < b && b < a + c)
		    {
		        condicao2 = 'v';
		    }
		    else
		    {
		        condicao2 = 'n';
		    }
		    if (a - b < c && c < a + b)
		    {
		        condicao3 = 'v';
		    }
		    else
		    {
		        condicao3 = 'n';
		    }

		    if(condicao1 == 'v' && condicao2 =='v' && condicao3 == 'v')
		    {
		    	System.out.println("\n\n");
		    	System.out.println("Este eh um Triangulo!");
		        condicaofinal = 'v';

		    }
		    if(condicao1 == 'n' || condicao2 == 'n' || condicao3 == 'n')
		    {
		    	System.out.println("\n\n");
		    	System.out.println("Verifique os numeros digitados, eles nao representam valores que formam um triangulo");
		    	System.out.println("\n\n");
		    }


		        if(condicaofinal == 'v')
		        {
		                if (a == b || c == b || a == c)
		                {
		                	System.out.println("\n\n");
		                	System.out.println("\nDo tipo: Triangulo Isoceles");
		                	System.out.println("\n\n");
		                }

		                if (a == b && c == b && a == c)
		                {
		                	System.out.println("\n\n");
		                	System.out.println("\nDo tipo: Triangulo Equilatero");
		                	System.out.println("\n\n");
		                }

		                if (a != b && c != b && a != c)
		                {
		                	System.out.println("\n\n");
		                	System.out.println("\nDo tipo: Triangulo Escaleno");
		                	System.out.println("\n\n");
		                }
		
		
		        }


	}

}
