package casa01;
import java.util.Scanner;
public class teste1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota,i,quantidade,soma,media;
		System.out.print("Informe a quantidade:");
		quantidade=ler.nextDouble();
		i=0;
		soma=0;
		while(i<quantidade) {
			i++;
			System.out.print("Informe as notas:");
			nota=ler.nextDouble();
			soma = soma+nota;
		}
		media = soma/quantidade;
		System.out.println("A média é:"+media);
		if(media>6) {
		    System.out.println("Aprovado");	
		}else if(media>=4) {
		    System.out.println("Recuperação");	
		}else {
		    System.out.println("Reprovado");			
		}
	}		
}