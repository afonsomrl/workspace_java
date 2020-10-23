
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	
	public void setHorario(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;		
	}
	
	public void setHorario(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;		
	}
	public void setHorario(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;		
	}
	
	
	
	public String exibirHoraUniversal() {
		return +hora+":"+minuto+":"+segundo;
	}
	
	public String exibirHoraPadrao() {
		
		String strHora;
		
		if(hora==0) {
			strHora = 12 + ":"+minuto+":"+segundo+ " AM";
		}
		else if(hora==12) {
			strHora = 12 + ":"+minuto+":"+segundo+ " PM";
		}
		else if(hora>=1&&hora<=11) {
			strHora = hora + ":"+minuto+":"+segundo+ " AM";
		}
		else {
			strHora = (hora-12) + ":"+minuto+":"+segundo+ " PM";
		}
		return strHora;
				
	}
}
