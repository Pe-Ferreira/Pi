package dto;

public class DuracaoDTO {

	private int hora;
	private int minutos;

	public DuracaoDTO() {

	}

	public DuracaoDTO(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
}
