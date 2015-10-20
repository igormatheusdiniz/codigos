public class Aluno implements Comparable<Aluno>{

	// ordem de construcao: escrita, escuta, fala, leitura.
	private String nome;
	private double mensalidade;
	private double proEscrita;
	private double proEscuta;
	private double proFala;
	private double proLeitura;
	private Proeficiencia proeficiencia;
	private Curso curso;
	private factoryCursos factory;

	public Aluno(String nome, double mensalidade, double proEscrita,
			double proEscuta, double proFala, double proLeitura) {
		this.nome = nome;
		this.mensalidade = mensalidade;
		this.proeficiencia = new Proeficiencia(proEscrita,proEscuta,proFala,proLeitura);
		this.factory = new factoryCursos();
		this.curso = null;
	}

	public void matricula(String nomeCurso) {
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

	public void setProEscrita(double proEscrita) {
		this.proEscrita = proEscrita;
	}

	public void setProEscuta(double proEscuta) {
		this.proEscuta = proEscuta;
	}

	public void setProFala(double proFala) {
		this.proFala = proFala;
	}

	public void setProLeitura(double proLeitura) {
		this.proLeitura = proLeitura;
	}

	public double calculaFacilidadeMedia() {
		return curso.calculaFacilidadeGenerica();
	}

	public double calculaFacilidade() {
		return curso.notaPorIdioma();
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		
		int comparation = this.nome.compareTo(outroAluno.getNome());
		return comparation;
	}
	
	


}
