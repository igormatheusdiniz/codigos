public class factoryCursos {

	public Curso criaCursoIngles() {
		Curso novoCurso = new Ingles();
		return novoCurso;
	}

	public Curso criaCursoSueco() {
		Curso novoCurso = new Sueco();
		return novoCurso;
	}

	public Curso criaCursoJapones() {
		Curso novoCurso = new Japones();
		return novoCurso;
	}

	public Curso criaCurso(String nomeCurso) throws Exception {

		Curso curso = null;

		if (nomeCurso.equals("Ingles")) {
			curso = this.criaCursoIngles();
		}

		else if (nomeCurso.equals("Japones")) {
			curso = this.criaCursoJapones();
		}

		else if (nomeCurso.equals("Sueco")) {
			curso = this.criaCursoSueco();
		}
		
		else { throw new Exception ("HelloWorld não ensina " + nomeCurso);}

		return curso;
	}

}
