package Herança;

	import java.util.Scanner;
	
public class TesteAnimal
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		
		int x=0;
		do
		{
			System.out.println("\nQual o tipo do seu animal:\n\n"+"1-Cachorro\n2-Cavalo\n3-Preguiça\n");
		
			x = leia.nextInt();
			if(x==1)
			{
				animal=cachorro;
				
				System.out.println("\nQual o nome do seu cachorro? ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQue idade tem seu cachorro?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nEssa é legal!!!Que som seu cachorro emite?");
				String som = leia.nextLine();
				
				System.out.println("\n*****************************************************");
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.som(som);
			}
			else if(x==2)
			{
				animal = cavalo;
				leia.nextLine();
				System.out.println("\nQual o nome do seu cavalo?");
				String nome = leia.nextLine();
				System.out.println("\nQue idade tem sua preguiça?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nEssa é legal!!!Que som o seu cavalo emite?");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
			}
			else if(x==3)
			{
				animal = preguica;
				leia.nextLine();
				System.out.println("\nQual o nome da sua preguiça?");
				String nome = leia.nextLine();
				System.out.println("\nQue idade tem sua preguiça?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nEssa é legal!!!Que som sua preguiça emite?");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(som);
			}
			else
			{
				System.out.println("\nOpção inválida!!!");
			}
		}
		while(x<=0 || x>=4);
	}
}
