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
		System.out.printf("%s seu imc é: %.2f \n", nome, imc);
		
		/*
		 * Identificado (nome de classe, nome de variavel, nome de metodo) - regras
		 * 1ª Nao começaras com números. Exemplo errado: 1berto
		 * 2ª Nao utilizaras palavas reservadas da linguagem: exemplo errado: class, int, public
		 * 3ª Nao faras uso de caracteres especiais. Exemplo: @,  %, &, *
		 *
		 * 
		 * PADROES: 
		 * 1º Nomes significativos
		 * 2º Utilizar o padrao CamelCase (ex correto: dataDeNascimento ou data_de_nascimento ; exemplo errado: datadenascimento
		 * 3º Respeite as caixas e os padroes dos recursos:
		 * 	Classe: Smepre começa com letra maiuscula
		 * 	Variavel: sempre começa com minuscula
		 * 	Metodo: sempre começa com minuscula e é seguido de parenteses(verbo)
		 * 
		 */

	}//fecha metodo

}//fecha clase
