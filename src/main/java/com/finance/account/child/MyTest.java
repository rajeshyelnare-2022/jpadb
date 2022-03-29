package com.finance.account.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finance.account.Account;
import com.finance.account.AccountRepository;

@Controller
public class MyTest {
	
	@Autowired
	private  AccountRepository accountRepository;
	
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<Account> getAllUsers() {
	    // This returns a JSON or XML with the users
		System.out.println(" all path called");
	    return accountRepository.findAll();
	  }

	
	 @GetMapping(path="/mytest")
	  public String getResp() {
		  System.out.println("My test path called");
		  return "My How are you ";
	  }


}
