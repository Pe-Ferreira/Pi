package model;

public class Pi {
	public void falaInicial() {
		System.out.println(
				"Ol�, sou o Pi, seu assistente pessoal! Consigo guardar informa��es sobre seus compromissos (:");
		System.out.println("Podemos come�ar? Digite 's' para SIM ou 'n' para N�O: ");
	}

	public void falaFinal() {
		System.out.println("Obrigado por ter me utilizado.");
		System.out.println("N�o vejo a hora de trabalharmos juntos novamente (:");
	}

	public void primeiroCompromisso() {
		System.out.println(
				"Vamos l�. Primeiramente, me diz o nome do teu compromisso, exemplo: Varrer a casa, estudar programa��o ...");
		System.out.println("Digite aqui o nome do seu compromisso: ");
	}

	public void pedeDuracao() {
		System.out.println("Quase l�! Agora eu s� preciso saber quanto tempo voc� vai gastar nesse compromisso.");
		System.out.println("Faz o seguinte. Digita pra mim nesse formato 'hh:mm': ");
	}

	public void mostrarLista() {
		System.out.println("Ser� que voc� est� atarefado demais?");
		System.out.println("Vamos dar uma olhada na sua lista de Compromissos.");
		System.out.println("-> Lista de Compromissos <-		");
		System.out.println("NOME DA TAREFA - DATA - DURA��O");
	}

	public void reboot() {
		System.out.println("\n Viu como sou �til? Gostou do meu trabalho?");
		System.out.println("Tenho certeza que gostou!");
		System.out.println("Quer gravar outro compromisso comigo?  Digite 's' para SIM ou 'n' para N�O: ");
	}

	public void mostrarHorasLivres(int horasLivres) {
		System.out.println("\nVoc� j� utilizou cerca de " + (720 - horasLivres) + " do seu m�s!");
		System.out.println("Por�m, ainda tem " + horasLivres + " horas para realizar suas atividades.");
	}

	public void casoDeErro() {
		System.out.println("Ops. Ocorreu um erro e eu n�o consegui me recuperar dele :(");
		System.out.println("Infelizmente vou desligar. Espero poder te ajudar na pr�xima.");
		System.exit(0);
	}
}
