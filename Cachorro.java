package Herança;

public abstract class Cachorro extends Animal
{
	
	public Cachorro ()
	{
		
		super("Tipo do animal: Cachorro");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nQual o nome do seu cachorro?"+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nQue idade tem seu cachorro?"+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nQue som o seu cachorro emite?"+somAnimal);
	}
	
	public void corre()
	{
		System.out.println("Uma das caratcerísticas do seu cachorro é correr!");
	}

	}
