package com.aartek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/login")
	public String defaultMethod(){
		System.out.println("custon login page");
		return "login";
	}
	
	@RequestMapping("/home")
	public ModelAndView getHome(){
		 String string = "Congrats ! You are done with your first Spring Security configuration !";
		 //Principal principal
		 
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		 User u = (User)auth.getPrincipal();
		 System.out.println(u.getUsername());
		 System.out.println(u.getPassword());
		 
		 System.out.println("workinggggggggg");
		 return new ModelAndView("home", "string", string);
	}
	
	/*@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}*/
	
	public void check(String hi){
		try{
			int x = hi.length();
			System.out.println(x);
		}
		catch(NullPointerException e){
			
		}
		
	}
}
