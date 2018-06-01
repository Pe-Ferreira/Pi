package model;

import java.util.Calendar;
import java.util.Date;

import dto.DiaHoraDTO;
import dto.DuracaoDTO;

public class Compromisso implements Comparable<Compromisso> {
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

	@SuppressWarnings("deprecation")
	@Override
	public int compareTo(Compromisso outroCompromisso) {
		if (this.getDiaHora().getTime().getYear() < outroCompromisso.getDiaHora().getTime().getYear()) {
			return -1;
		} else if (this.getDiaHora().getTime().getMonth() < outroCompromisso.getDiaHora().getTime().getMonth()) {
			return -1;
		} else if (this.getDiaHora().getTime().getDay() < outroCompromisso.getDiaHora().getTime().getDay()) {
			return -1;
		} else if (this.getDiaHora().getTime().getHours() < outroCompromisso.getDiaHora().getTime().getHours()) {
			return -1;
		} else if (this.getDiaHora().getTime().getMinutes() < outroCompromisso.getDiaHora().getTime().getMinutes()) {
			return -1;
		}
		if (this.getDiaHora().getTime().getYear() > outroCompromisso.getDiaHora().getTime().getYear()) {
			return 1;
		} else if (this.getDiaHora().getTime().getMonth() > outroCompromisso.getDiaHora().getTime().getMonth()) {
			return 1;
		} else if (this.getDiaHora().getTime().getDay() > outroCompromisso.getDiaHora().getTime().getDay()) {
			return 1;
		} else if (this.getDiaHora().getTime().getHours() > outroCompromisso.getDiaHora().getTime().getHours()) {
			return 1;
		} else if (this.getDiaHora().getTime().getMinutes() > outroCompromisso.getDiaHora().getTime().getMinutes()) {
			return 1;
		}
		return 0;
	}
}
