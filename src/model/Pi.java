package model;

public class Pi {
	public void falaInicial() {
		System.out.println(
				"Olá, sou o Pi, seu assistente pessoal! Consigo guardar informações sobre seus compromissos (:");
		System.out.println("Podemos começar? Digite 's' para SIM ou 'n' para NÃO: ");
	}

	public void falaFinal() {
		System.out.println("Obrigado por ter me utilizado.");
		System.out.println("Não vejo a hora de trabalharmos juntos novamente (:");
	}

	public void primeiroCompromisso() {
		System.out.println(
				"Vamos lá. Primeiramente, me diz o nome do teu compromisso, exemplo: Varrer a casa, estudar programação ...");
		System.out.println("Digite aqui o nome do seu compromisso: ");
	}

	public void pedeDuracao() {
		System.out.println("Quase lá! Agora eu só preciso saber quanto tempo você vai gastar nesse compromisso.");
		System.out.println("Faz o seguinte. Digita pra mim nesse formato 'hh:mm': ");
	}

	public void mostrarLista() {
		System.out.println("Será que você está atarefado demais?");
		System.out.println("Vamos dar uma olhada na sua lista de Compromissos.");
		System.out.println("-> Lista de Compromissos <-		");
		System.out.println("NOME DA TAREFA - DATA - DURAÇÃO");
	}

	public void reboot() {
		System.out.println("\n Viu como sou útil? Gostou do meu trabalho?");
		System.out.println("Tenho certeza que gostou!");
		System.out.println("Quer gravar outro compromisso comigo?  Digite 's' para SIM ou 'n' para NÃO: ");
	}

	public void mostrarHorasLivres(int horasLivres) {
		System.out.println("\nVocê já utilizou cerca de " + (720 - horasLivres) + " do seu mês!");
		System.out.println("Porém, ainda tem " + horasLivres + " horas para realizar suas atividades.");
	}

	public void casoDeErro() {
		System.out.println("Ops. Ocorreu um erro e eu não consegui me recuperar dele :(");
		System.out.println("Infelizmente vou desligar. Espero poder te ajudar na próxima.");
		System.exit(0);
	}
}
