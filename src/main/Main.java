package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import model.Agenda;
import model.Compromisso;
import model.Pi;

public class Main {
	public static void main(String[] args) {
		Pi pi = new Pi();
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda(new ArrayList<Compromisso>());
		String decisao = "";
		pi.falaInicial();
		do {
			decisao = sc.nextLine();
			if (decisao.equalsIgnoreCase("s")) {
				salvarCompromisso(pi, sc, agenda);
				pi.mostrarLista();
				for (Compromisso compromissoTemp : agenda.getListaCompromisso()) {
					String compromissoView = compromissoTemp.getNome() + " - "
							+ compromissoTemp.tratarDiaHora(compromissoTemp.getDiaHora()) + " - "
							+ compromissoTemp.tratarDuracao(compromissoTemp.getDuracao());
					System.out.println(compromissoView);
				}
				pi.mostrarHorasLivres(agenda.calcularHorasLivres());
				pi.reboot();
			} else {
				pi.falaFinal();
				return;
			}
		} while (decisao.equalsIgnoreCase("s"));
	}

	@SuppressWarnings("deprecation")
	private static void salvarCompromisso(Pi pi, Scanner sc, Agenda agenda) {
		// Nome do Compromisso
		pi.primeiroCompromisso();
		Compromisso compromisso = new Compromisso();
		compromisso.setNome(sc.nextLine());
		// Data e Hora do Compromisso
		System.out
				.println("Utilizando o formato 'dd/MM/yyyy hh:mm', digite aqui qual a data/hora do seu compromisso: ");
		String stringDataCompromisso = sc.nextLine();
		DateFormat dateFormatDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Calendar dataCompromisso = Calendar.getInstance();
		try {
			dataCompromisso.setTime(dateFormatDataHora.parse(stringDataCompromisso));
			compromisso.setDiaHora(dataCompromisso);
			// Duração do Compromisso, provavelmente tudo isso tá errado
			pi.pedeDuracao();
			String stringDuracao = sc.nextLine();
			DateFormat dateFormatDuracao = new SimpleDateFormat("HH:mm");
			Date date = dateFormatDuracao.parse(stringDuracao);
			compromisso.setDuracao(date);
			agenda.getListaCompromisso().add(compromisso);
		} catch (Exception e) {
			pi.casoDeErro();
		}
	}
}
