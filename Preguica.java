package Heran�a;

public abstract class Preguica extends Animal
{
	public Preguica()
	{
		super("\nTipo do animal");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nQual o nome da sua pregui�a?"+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nQue idade tem sua pregui�a?"+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nQue som sua pregui�a emite?");
	}
	
	public void subirArvore()
	{
		System.out.println("\nUma das caracter�sticas da sua pregui�a � subir em �rvores!");
	}
}
