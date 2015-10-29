public abstract class Curso {

	protected double facilidadeGenerica;
	protected double notaPorIdioma;

	public double calculaFacilidadeGenerica(Aluno aluno) {

		return this.facilidadeGenerica = (aluno.proeficiencia.getEscrita()
				+ aluno.proeficiencia.getEscuta() + aluno.proeficiencia.getFala() + aluno.proeficiencia
				.getLeitura()) / 4.0;
	}

	public abstract double notaPorIdioma(Aluno aluno);
	
	public abstract String cumprimenta(String nome);

}
