package eteczl.privateob;

public class Pessoa {
	
	private String nome;
	private int idade;

	public Pessoa (String N)
	
	
	
	{
		
		this.nome = N;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (idade >=18) {
		
		this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
