package com.sg.webApp.pl;


import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("login") 
public class LoginController {
	
	@GetMapping
   public ModelAndView login(Model m, HttpSession session) {

		if(session.getAttribute("loginSession") != null && session.getAttribute("loginSession") == "loginDone" ) {
			System.out.println("siamo già loggati");
			return new ModelAndView("areaRiservata");
		} else {
			System.out.println("non loggato go to login page");
			return new ModelAndView("login");
		}
	}  
	
	@PostMapping
	public String checklogin(HttpSession session,@RequestParam("username") String userName,@RequestParam("password") String password) {
		  
		 
		System.out.println("siamo qua");
		 if (userIS(userName,password)) {	
			 session.setAttribute("loginSession", "loginDone");
			 return "areaRiservata";
		}else {
			return "logIn";
		}
	 
	}
	
	public boolean  userIS(String username ,String Password) { 
		
		 if (username.equals("dani") && Password.equals("123")) { 
			 return true;
		}else {
			return false;
		}
		 
	}
	
	
   
}
