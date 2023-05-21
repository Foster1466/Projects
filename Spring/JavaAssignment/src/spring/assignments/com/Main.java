package spring.assignments.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

		PythonWorld j = context.getBean("PythonFramework",PythonWorld.class);
		System.out.print(j.learningPython());
		context.close();
	}

}
