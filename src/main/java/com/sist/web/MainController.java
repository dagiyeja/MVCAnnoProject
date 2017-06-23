package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Spring
 * ======
 * =======================================
 * ��û�޴� Ŭ����: Front Controller (MVC �� C) => Servlet(���� �ʿ��� �κп���), JSP 
 * 			==================
 * 			DispatcherServlet : Servlet
 * 			=>tomcat�� ��� 
 * ===================================
 * ��û�� ���� (Model) : ~controller : java
 * WebApplicationContext
 * Model ==> DAO, VO, Model(Service)
 * ===================================
 * View : ViewResolver
 * ===================================
 * 1) ������ �ؾ��� �۾� ==> xml �Ľ�
 * DispatcherServlet <==> WebApplicationContext
 * 				HandlerMapping
 * 				viewResolver
 * ==> applicationContext.xml
 * 		application-context.xml
 * 		application-datasource.xml
 * 		application-security.xml
 * 
 * 		=>application-*.xml
 * */

@Controller
public class MainController {
	@RequestMapping("movie/main.do")
	/*
	 * p:prefix="/movie/" p:suffix=".jsp"  ->/movie/main.jsp
	 * */
	public String movie_main(String name, Model model){ //���⼭ model,name�� ������Ʈ����, ���� �ʿ��� ��ü�� � ���̵��� ��û ����
		//model.addAttribute("msg", "Spring MVC!!"+name);
		return "movie/main";
				
	}
}
