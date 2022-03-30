package br.com.lds;

import br.com.lds.models.Caminhao;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {

		Caminhao primeiroCaminhao = new Caminhao("TiburssiusLog", 1);
		Caminhao segundoCaminhao = new Caminhao("AroldusLog", 2);

		Thread threadPrimeiroCaminhao = new Thread(primeiroCaminhao);
		Thread threadSegundoCaminhao = new Thread(segundoCaminhao);

		threadPrimeiroCaminhao.start();
		threadSegundoCaminhao.start();
	}

}
