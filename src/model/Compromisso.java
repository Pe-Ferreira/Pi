package model;

import java.util.Calendar;
import java.util.Date;

import dto.DiaHoraDTO;
import dto.DuracaoDTO;

public class Compromisso {
	private String nome;
	private Calendar diaHora;
	private Date duracao;

	public Compromisso() {
	}

	public Compromisso(String nome, Calendar diaHora, Date duracao) {
		this.setNome(nome);
		this.setDiaHora(diaHora);
		this.setDuracao(duracao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDiaHora() {
		return diaHora;
	}

	public void setDiaHora(Calendar diaHora) {
		this.diaHora = diaHora;
	}

	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	public String tratarDiaHora(Calendar diaHora) {
		DiaHoraDTO diaHoraDTO = new DiaHoraDTO(diaHora.getTime().getDate(), diaHora.getTime().getMonth(),
				diaHora.getTime().getYear(), diaHora.getTime().getHours(), diaHora.getTime().getMinutes());
		String diaHoraDTOTratado = "";
		diaHoraDTOTratado = Integer.toString(diaHoraDTO.getDia()) + "/" + Integer.toString(diaHoraDTO.getMes() + 1)
				+ "/" + Integer.toString(diaHoraDTO.getAno() + 1900) + " " + Integer.toString(diaHoraDTO.getHora())
				+ "h" + Integer.toString(diaHoraDTO.getMinutos()) + "m";
		return diaHoraDTOTratado;
	}

	public String tratarDuracao(Date duracao) {
		DuracaoDTO duracaoDTO = new DuracaoDTO(duracao.getHours(), duracao.getMinutes());
		String duracaoDTOTratado = "";
		duracaoDTOTratado = Integer.toString(duracaoDTO.getHora()) + ":" + Integer.toString(duracaoDTO.getMinutos())
				+ "m";
		return duracaoDTOTratado;
	}
}
