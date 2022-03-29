package com.finance.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	private  AccountRepository accountRepository;
	
	/*public @ResponseBody String addNewAccount (@RequestParam String name
		      , @RequestParam int balance) {
		    
		Account a = new Account();
		a.setBalance(balance);
		a.setName(name);

		  
		    accountRepository.save(a);
		    return "Saved";
		  }
*/
	
	//@GetMapping(path="/all")
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<Account> getAllUsers() {
	    // This returns a JSON or XML with the users
		System.out.println(" all path called");
	    return accountRepository.findAll();
	  }
	
	 // @GetMapping(path="/test")
	 @GetMapping("/test")
	  public String getResp() {
		  System.out.println(" test path called");
		  return "How are you ";
	  }
}
