package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xpTo@itau-uNibanco.cOm.bR";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Onde est� o arroba?: " + email.indexOf("@"));
		System.out.println("Do 2� at� o 4� caracter: " + email.substring(1,5));
		System.out.println("Metade " + email.substring(0,(email.length()/2)));
		System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
		
		//Compara��o de strings
		System.out.println("Compara��o: " + email.equals("xpto@itau-unibanco.com.br"));
		System.out.println( "Compara��o com Case: " + email.equalsIgnoreCase("xpto@itau-unibanco.com.br"));


	}

}
