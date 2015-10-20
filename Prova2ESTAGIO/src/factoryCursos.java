
public class factoryCursos {

	public Curso criaCursoIngles(){
		Curso novoCurso = new Ingles();
		return  novoCurso;
	}
	
	public Curso criaCursoSueco(){
		Curso novoCurso = new Sueco();
		return novoCurso; 
	}
	
	public Curso criaCursoJapones(){
		Curso novoCurso = new Japones();
		return novoCurso;
	}

	public Curso criaCurso(String nomeCurso) {
		
		Curso curso = null;
		
		if (nomeCurso.equals("Ingles")) {
			curso = this.criaCursoIngles();
		}
		
		else if (nomeCurso.equals("Japones")) {
			curso = this.criaCursoJapones();
		}
		
		else{ curso = this.criaCursoSueco();}
	
		return curso;
	}

}
