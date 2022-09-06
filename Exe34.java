import java.util.*;

//34. Exibir a tabuada do número cinco no intervalo de um a dez.

public class Exe34 {

	public static void main(String[] args) {
		
		int i=1,t, num=5;
		
		while(i <= 10) {
			
			t = num * i;
			System.out.printf("\n %d X %d = %d", num, i, t);
		
			i++;
		}

	}

}
