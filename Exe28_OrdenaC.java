import java.util.*;


public class Exe28_OrdenaC {

	public static void main(String[] args) {
		
	
		Scanner ler = new Scanner(System.in);
		int num;
		int numberFila[] = new int[3];
		
		for(int i=0;i<=2;i++) {
			
			System.out.println("Digite um numero");
			num = ler.nextInt();
			
			numberFila[i] = num;
		}
		
		for (int i = 0; i <= 2; i++)
        {
            for (int j = i + 1; j <= 2; j++)
            {
                if (numberFila[i] > numberFila[j])
                {
                    int a =  numberFila[i];
                    numberFila[i] = numberFila[j];
                    numberFila[j] = a;
                }
            }
        }
		
		
		for(int i=0;i<=2;i++) {
			
			System.out.printf(" %d ",numberFila[i]);
			
		}
		
		
	}

}
