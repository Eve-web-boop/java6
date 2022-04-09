package Herança;

public abstract class Cavalo extends Animal
{

	public Cavalo()
	{
		super("\nTipo do animal: Cavalo");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nQual o nome do seu cavalo?"+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nQue idade tem seu cavalo?"+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nQue som o seu cavalo emite?");
	}
	
	public void corre()
	{
		System.out.println("\nUma das características do seu cavalo é correr!");
	}

}
