package variaveis;

public class Tipos {

	public static void main(String[] args) {
		//<tipo do dado> <nome da variavel/objeto;
		String nome= "William de Moraes";
		int idade = 35;
		double altura = 1.81;
		double peso = 82.500;
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + idade + " anos.");
		System.out.println("Altura: " + altura + " metros." );
		System.out.println("Peso: " + peso + " kilos.");
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Imc: %.2f \n", imc);
		System.out.printf("%s seu imc �: %.2f \n", nome, imc);
		
		/*
		 * Identificado (nome de classe, nome de variavel, nome de metodo) - regras
		 * 1� Nao come�aras com n�meros. Exemplo errado: 1berto
		 * 2� Nao utilizaras palavas reservadas da linguagem: exemplo errado: class, int, public
		 * 3� Nao faras uso de caracteres especiais. Exemplo: @,  %, &, *
		 *
		 * 
		 * PADROES: 
		 * 1� Nomes significativos
		 * 2� Utilizar o padrao CamelCase (ex correto: dataDeNascimento ou data_de_nascimento ; exemplo errado: datadenascimento
		 * 3� Respeite as caixas e os padroes dos recursos:
		 * 	Classe: Smepre come�a com letra maiuscula
		 * 	Variavel: sempre come�a com minuscula
		 * 	Metodo: sempre come�a com minuscula e � seguido de parenteses(verbo)
		 * 
		 */

	}//fecha metodo

}//fecha clase
