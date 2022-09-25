package wallet.com.springboot.controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import wallet.com.springboot.entity.User;
import wallet.com.springboot.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private	LoginService loginservice;
	@GetMapping("/Dashboard")
	   public String dashlogin() {
	 		
	 		//System.out.println("HELLO");
		    return "Dashboard.html";
	   }
	 	@GetMapping("/login")
	   public String getlogin() {
	 		//ModelAndView mav =new	ModelAndView("login");
	 		//mav.addObject("user",new User());
	 		System.out.println("HELLO");
		    return "login.html";
	   }
	 @PostMapping("/login")
	 public String getlogin(@ModelAttribute("user") User user) {
		 System.out.println(user);
		 User  outhuser = loginservice.loginmethod(user.getEmail(), user.getPassword());
		 //System.out.println(outhuser.getEmail());
		 //System.out.println(outhuser.getPassword());
		 if(Objects.nonNull(outhuser)) {
			 System.out.println(outhuser.getEmail()+"______");
			 return	"redirect:/Dashboard";
		 }
		 else {
			 System.out.println("HELLOunderelse");
			 return	"redirect:/login";
		 }
	 }
}


//