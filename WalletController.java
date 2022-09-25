package wallet.com.springboot.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import wallet.com.springboot.entity.Transaction;
import wallet.com.springboot.entity.User;
import wallet.com.springboot.service.TransactionService;

@Controller
public class WalletController {
	@Autowired
	private TransactionService tser;
	int currentbalance = 0;

	@GetMapping("/Da")
	public String dashlogin(Transaction tran) {
		// System.out.println(0.getPrice());
		return "hello";
	}

	@GetMapping("/das")
	   public String getdas() {
	 		//ModelAndView mav =new	ModelAndView("login");
	 		//mav.addObject("user",new User());
	 		System.out.println("HELLO");
		    return "Das.html";
	   }

	@GetMapping("/wda")
	public String getloginwithdraw() {
		// System.out.println(0.getPrice());

		return "Das.html";
	}

	
	  @GetMapping("/getb")
	  public String getloginBalance(Model model) { int id =1;
	  System.out.println(tser.balance(id).getPrice());
	  System.out.println("ugiu");
	 // double price = model.getPrice();
	  double obj = tser.balance(id).getPrice();
	  model.addAttribute("tser","obj"); 
	  
	  return "Das.html"; 
	  }
	  
	 
	@PostMapping("/das")
	public String postMessage(@RequestParam Integer price) {
		int id = 1;

		// System.out.println(price);
		// System.out.println(tser.balance(id));
		var msg = tser.balance(id).getPrice();
		System.out.println(price + msg);
		Transaction t = new Transaction();
		t.setId(1);
		t.setPrice(price + msg);
		tser.addCategory(t);
		return "redirect:/das";
	}

	@PostMapping("/wda")
	public String postMessageforwithdraw(@RequestParam Integer price) {
		int id = 1;

		// System.out.println(price);
		// System.out.println(tser.balance(id));
		var msg = tser.balance(id).getPrice();
		System.out.println(price + msg);
		Transaction t = new Transaction();
		t.setId(1);
		t.setPrice(msg - price);
		tser.addCategory(t);
		return "redirect:/das";
	}
}
