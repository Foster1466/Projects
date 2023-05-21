package spring.assignments.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("App.xml");

		JavaWorld j = context.getBean("Framework",JavaWorld.class);
		System.out.print(j.learningJava());
		context.close();
	}

}
