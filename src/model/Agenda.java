package model;

import java.util.List;

import dto.DuracaoDTO;

public class Agenda {
	private List<Compromisso> listaCompromisso;

	public Agenda() {

	}

	public int calcularHorasLivres() {
		int horasTotais = 0;
		int minutosTotais = 0;
		int quantidadeDeHorasNoMes = 720; // 30 dias * 24h
		for (Compromisso compromisso : this.getListaCompromisso()) {
			DuracaoDTO duracaoDTO = new DuracaoDTO(compromisso.getDuracao().getHours(),
					compromisso.getDuracao().getMinutes());
			horasTotais = horasTotais + duracaoDTO.getHora();
			minutosTotais = minutosTotais + duracaoDTO.getMinutos();
		}
		horasTotais = horasTotais + (minutosTotais / 60);
		return quantidadeDeHorasNoMes - horasTotais;
	}

	public Agenda(List<Compromisso> listaCompromisso) {
		this.setListaCompromisso(listaCompromisso);
	}

	public List<Compromisso> getListaCompromisso() {
		return listaCompromisso;
	}

	public void setListaCompromisso(List<Compromisso> listaCompromisso) {
		this.listaCompromisso = listaCompromisso;
	}

}
