package br.com.projetoTeste.implementacao;

import br.com.projetoTeste.modelo.Televisao;

public class TesteTv {

	public static void main(String[] args) {
		Televisao objeto = new Televisao ();
		objeto.preencherMarca("LG");
		
			objeto.ligar();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.aumentarVolume();
			objeto.diminuirVolume();
			objeto.mudarCanal(500);
			
			System.out.println (objeto.retornarStatus());
			System.out.println(objeto.retornarResumo());
		
			objeto.desligar();
			objeto.mudarCanal(100);
			System.out.println(objeto.retornarStatus());
		
	}

}