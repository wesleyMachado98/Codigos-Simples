package casa01;
import java.util.Random;

public class teste2 {

	   public static void main(String[] args) {
	        int[] vetor = new int[15000];
	        Random random = new Random();
	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = random.nextInt(100000);
	        }
	        
	    
	        int x = 0;
	        for (int num : vetor) {
	            if (num % 2 == 0) {
	                x++;
	            }
	        }
	        
	        System.out.printf("Números pares: " + x);
	    }
	}