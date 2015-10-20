
public class Ingles extends Curso {

	@Override
	public double notaPorIdioma() {
		return this.notaPorIdioma = (proeficiencia.getEscrita()*0.5) + (proeficiencia.getLeitura()*0.1) + (proeficiencia.getFala()*0.4);
	}

	@Override
	public String cumprimenta(String nome) {
		return "Hello! I am " + nome + ". Nice to meet you.";
		
	}

}
