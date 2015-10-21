public class Japones extends Curso {

	@Override
	public double notaPorIdioma(Aluno aluno) {
		return this.notaPorIdioma = (aluno.proeficiencia.getEscrita() * 0.6)
				+ (aluno.proeficiencia.getLeitura() * 0.4);
	}

	@Override
	public String cumprimenta(String nome) {
		return "Hajimemashite. Watashi ha " + nome + " desu.";
	}

}
