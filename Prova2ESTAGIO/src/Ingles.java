
public class Ingles extends Curso {

	@Override
	public double notaPorIdioma(Aluno aluno) {
		return this.notaPorIdioma = (aluno.proeficiencia.getEscrita()*0.5) + (aluno.proeficiencia.getLeitura()*0.1) + (aluno.proeficiencia.getFala()*0.4);
	}

	@Override
	public String cumprimenta(String nome) {
		return "Hello! I am " + nome + ". Nice to meet you.";
		
	}

}
