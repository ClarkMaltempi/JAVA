package pkgVerificaTriangulo;


import java.util.*;

public class VerTriangulo {

	public static void main(String[] args) {
		
		int a,b,c;
		boolean ba, bb, bc;
		
		Scanner ler = new Scanner(System.in);
		
		
		 System.out.println("DIGITE O LADO A: ");
		 a = ler.nextInt();
		 System.out.println("DIGITE O LADO B: ");
		 b = ler.nextInt();
		 System.out.println("DIGITE O LADO C: ");
		 c = ler.nextInt();
		
		
		if(a + b > c) {
			
			ba = true;
		}else {
			
			ba = false;
		}
		
		if (a + c > b) {
			
			bb = true;
		}else {
			
			bb = false;
		}
		
		if(b + c > a) {
			bc = true;
		}else {
			bc = false;
		}
		
		
		
		if(ba && bb && bc == true) {
			
			 System.out.println("Este eh um Triangulo");
		}else {
			
			System.out.println(" Não eh um Triangulo");
		}
		
		
	}

}