package spring.assignments.com;

public class PythonWorld implements PythonLanguage {
	
	JavaWorld jw;
	
	public PythonWorld(JavaWorld jw) {
		this.jw = jw;
	}

	@Override
	public String learningPython() {
		System.out.println(jw.learningJava());
		return "I am learning Python";
		
	}
	
	

}
