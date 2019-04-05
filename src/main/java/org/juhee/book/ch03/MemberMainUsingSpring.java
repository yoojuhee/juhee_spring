package org.juhee.book.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",MemberRegisterService.class);

		RegisterRequest req = new RegisterRequest();
		req.setEmail("dragon9813@gmail.com");
		req.setPassword("8870");
		req.setName("owl");

		regService.regist(req);
	}
}


