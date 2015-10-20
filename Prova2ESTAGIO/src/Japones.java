public class Japones extends Curso {

	@Override
	public double notaPorIdioma() {
		return this.notaPorIdioma = (proeficiencia.getEscrita() * 0.6)
				+ (proeficiencia.getLeitura() * 0.4);
	}

	@Override
	public String cumprimenta(String nome) {
		return "Hajimemashite. Watashi ha " + nome + " desu.";
	}

}
