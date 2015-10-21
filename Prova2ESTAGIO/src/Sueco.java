public class Sueco extends Curso {

	@Override
	public double notaPorIdioma(Aluno aluno) {
		return this.notaPorIdioma = (aluno.proeficiencia.getEscrita() * 0.1)
				+ (aluno.proeficiencia.getLeitura() * 0.1)
				+ (aluno.proeficiencia.getFala() * 0.3)
				+ (aluno.proeficiencia.getEscuta() * 0.5);

	}

	@Override
	public String cumprimenta(String nome) {
		return  "Hej hej! Jag heter " + nome + ". Trevligt att troffas.";
	}



}
