public abstract class Curso {

	protected double facilidadeGenerica;
	protected double notaPorIdioma;
	protected Proeficiencia proeficiencia;

	public double calculaFacilidadeGenerica() {

		return this.facilidadeGenerica = (proeficiencia.getEscrita()
				+ proeficiencia.getEscuta() + proeficiencia.getFala() + proeficiencia
				.getLeitura()) / 4.0;
	}

	public abstract double notaPorIdioma();
	
	public abstract String cumprimenta(String nome);

}
