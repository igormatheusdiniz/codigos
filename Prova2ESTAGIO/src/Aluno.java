public class Aluno implements Comparable<Aluno> {

	// ordem de construcao: escrita, escuta, fala, leitura.
	private String nome;
	private double mensalidade;
	protected Proeficiencia proeficiencia;
	private Curso curso;
	private factoryCursos factory;

	public Aluno(String nome, double mensalidade, double proEscrita,
			double proEscuta, double proFala, double proLeitura)
			throws Exception {

		if (proEscuta > 10 || proEscuta < 0 || proFala > 10 || proFala < 0
				|| proLeitura > 10 || proLeitura < 0 || proEscrita > 10
				|| proEscrita < 0) {

			throw new Exception(
					"Nivel de proficiencia invalido. Deve ser entre 0 e 10.");
		}

		this.nome = nome;
		this.mensalidade = mensalidade;
		this.proeficiencia = new Proeficiencia(proEscrita, proEscuta, proFala,
				proLeitura);
		this.factory = new factoryCursos();
		this.curso = null;
	}

	public void matricula(String nomeCurso) throws Exception {
		this.curso = factory.criaCurso(nomeCurso);

	}

	public String cumprimenta() {
		return curso.cumprimenta(this.nome);
	}

	public String getNome() {
		return this.nome;
	}

	public double getMensalidade() {
		return this.mensalidade;
	}

	public double getEscrita() {
		return this.proeficiencia.getEscrita();
	}

	public double getEscuta() {
		return this.proeficiencia.getEscuta();
	}

	public double getFala() {
		return this.proeficiencia.getFala();
	}

	public double getLeitura() {
		return this.proeficiencia.getLeitura();
	}

	public double calculaFacilidadeMedia() throws Exception {
		if (this.curso == null) {
			throw new Exception(this.nome
					+ " ainda nao esta matriculado em nenhum curso.");
		}
		return curso.calculaFacilidadeGenerica(this);
	}

	public double calculaFacilidade() throws Exception {
		if (this.curso == null) {
			throw new Exception(this.nome
					+ " ainda nao esta matriculado em nenhum curso.");
		}

		return curso.notaPorIdioma(this);
	}

	@Override
	public int compareTo(Aluno outroAluno) {

		int comparation = this.nome.compareTo(outroAluno.getNome());
		return comparation;
	}

}
