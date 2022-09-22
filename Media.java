import java.util.Scanner;

public class Media{
	public static void main(String[] args){
		double N1, N2, MED;
		Scanner ler = new Scanner(System.in);
		System.out.println("SISTEMA DE CALCULO DE MEDIA");
		System.out.println("ATENCAO: A Prova 1 possui peso 6 e a Prova 2 possui peso 4!");
		System.out.println("Digite a primeira nota: ");
		N1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		N2 = ler.nextDouble();
		MED = (((N1*6)+(N2*4))/10);
		System.out.printf("A media final do aluno e' %.2f%n", MED);
	
	}
}