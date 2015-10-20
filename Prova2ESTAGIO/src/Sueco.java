public class Sueco extends Curso {

	@Override
	public double notaPorIdioma() {
		return this.notaPorIdioma = (proeficiencia.getEscrita() * 0.1)
				+ (proeficiencia.getLeitura() * 0.1)
				+ (proeficiencia.getFala() * 0.3)
				+ (proeficiencia.getEscuta() * 0.5);

	}

	@Override
	public String cumprimenta(String nome) {
		return  "Hej hej! Jag heter " + nome + ". Trevligt att traffas.";
	}

}
