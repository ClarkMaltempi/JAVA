import java.util.*;

public class bibliFibonacci {
	
	
	
	void ExibaSeq(int num)
	{
		
	   num = num-1;	
	   int vet[] = new int [num]; 	
	   
	   int i;
	   int t1 = 0, t2 = 1;
	   int nextTerm = t1 + t2;

	   System.out.println("\nSequência Escolhida: \n");
	   System.out.printf("%d ", t2);

	   for (i = 3; i < num; ++i)
	    {

		   System.out.printf(", %d ", nextTerm);
	        t1 = t2;
	        t2 = nextTerm;
	        nextTerm = t1 + t2;
	        vet[i] = nextTerm;
	       
	    }
	    Exibe(vet, num);
	}
	
	
	
	void Exibe(int vet[], int num)
	{
	    int i;
	    //System.out.printf("\n\n\nDivisivel por Três: \n");
	    for (i = 1; i <= num; ++i)
	    {

	        vet[1] = 1;
	        vet[2] = 1;
	        //if(vet[i]%3 == 0){
	        	//System.out.printf(" %d, ", vet[i]);
	        //}
	    }
	    System.out.printf("\n\n");
	 
	}


}
