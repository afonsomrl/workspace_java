
public class TimeTeste {
	public static void main(String[] args) {
		Time t1;
		
		t1 = new Time();
		
		t1.setHora(20);
		t1.setMinuto(20);
		t1.setSegundo(35);
		
		System.out.println(t1.exibirHoraUniversal());
		System.out.println(t1.exibirHoraPadrao());
			
	}
}
