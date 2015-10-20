
public class Proeficiencia {
	
	private double fala;
	private double escrita;
	private double leitura;
	private double escuta;
	
	// ordem de construcao: escrita, escuta, fala, leitura.
	public Proeficiencia(double escrita, double escuta, double fala, double leitura){
		this.fala = fala;
		this.escrita = escrita;
		this.leitura = leitura;
		this.escuta = escuta;
	}

	public double getFala() {
		return fala;
	}

	public void setFala(double nota) {
		this.fala += nota;
	}

	public double getEscrita() {
		return escrita;
	}

	public void setEscrita(double nota) {
		this.escrita += nota;
	}

	public double getLeitura() {
		return leitura;
	}

	public void setLeitura(double nota) {
		this.leitura += nota;
	}

	public double getEscuta() {
		return escuta;
	}

	public void setEscuta(double nota) {
		this.escuta += nota;
	}
	
	
	
}
