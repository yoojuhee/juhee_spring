package jh_package;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ch02.xml");
		ArticleService articleService = ctx.getBean("articleService", jh_package.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", jh_package.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}