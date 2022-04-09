package Herança;

public abstract class Preguica extends Animal
{
	public Preguica()
	{
		super("\nTipo do animal");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nQual o nome da sua preguiça?"+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nQue idade tem sua preguiça?"+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nQue som sua preguiça emite?");
	}
	
	public void subirArvore()
	{
		System.out.println("\nUma das características da sua preguiça é subir em árvores!");
	}
}
