package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Spring
 * ======
 * =======================================
 * 요청받는 클래스: Front Controller (MVC 중 C) => Servlet(보안 필요한 부분에서), JSP 
 * 			==================
 * 			DispatcherServlet : Servlet
 * 			=>tomcat에 등록 
 * ===================================
 * 요청을 제어 (Model) : ~controller : java
 * WebApplicationContext
 * Model ==> DAO, VO, Model(Service)
 * ===================================
 * View : ViewResolver
 * ===================================
 * 1) 사전에 해야할 작업 ==> xml 파싱
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
	public String movie_main(String name, Model model){ //여기서 model,name이 리퀘스트역할, 내가 필요한 객체는 어떤 것이든지 요청 가능
		//model.addAttribute("msg", "Spring MVC!!"+name);
		return "movie/main";
				
	}
}
