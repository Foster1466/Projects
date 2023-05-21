package spring.assignments.annotations;

import org.springframework.stereotype.Component;

@Component("Framework")
public class JavaWorld implements JavaLanguage {

	@Override
	public String learningJava() {

		return "I am learning java";
	}
	
	

}
